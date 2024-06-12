/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.data_access;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import proyecto_final.objects.Ability;
import proyecto_final.objects.Pokemon;

/**
 *
 * @author jojos
 */
public class PokemonDAO extends DataAccessObject {

    PokemonDAO(Connection cnt) {
        super(cnt);
    }

    protected List<Pokemon> loadAllPokemon() throws SQLException {
        List<Pokemon> pokemons = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM pokemon");
        ResultSet result = stmt.executeQuery();

        while (result.next()) {
            pokemons.add(readPokemonFromResultSet(result));
        }

        return pokemons;
    }

    protected List<Pokemon> loadPokemonContaining(String content) throws SQLException {
        Map<Integer, Pokemon> pokemonMap = new HashMap<>();

        String query = "select * from pokemon natural join pokemon_abilities natural join abilities WHERE pok_name like ? order by pok_id;";
        try (PreparedStatement stmt = cnt.prepareStatement(query)) {
            stmt.setString(1, content);
            try (ResultSet result = stmt.executeQuery()) {
                while (result.next()) {
                    int pokId = result.getInt("pok_id");
                    Pokemon pokemon = pokemonMap.getOrDefault(pokId, readPokemonFromResultSet(result));
                    Ability ability = readAbilityFromResultSet(result);
                    pokemon.addAbility(ability);
                    pokemonMap.putIfAbsent(pokId, pokemon);
                }
            }
        } catch (SQLException e) {
            throw e;
        }

        return new ArrayList<>(pokemonMap.values());
    }

    protected List<Pokemon> loadPokemonsWithAbilities() throws SQLException {
        Map<Integer, Pokemon> pokemonMap = new HashMap<>();

        String query = "SELECT * FROM pokemon NATURAL JOIN pokemon_abilities NATURAL JOIN abilities ORDER BY pok_id";
        try (PreparedStatement stmt = cnt.prepareStatement(query); ResultSet result = stmt.executeQuery()) {

            while (result.next()) {
                int pokId = result.getInt("pok_id");
                Pokemon pokemon = pokemonMap.getOrDefault(pokId, readPokemonFromResultSet(result));
                Ability ability = readAbilityFromResultSet(result);
                pokemon.addAbility(ability);
                pokemonMap.putIfAbsent(pokId, pokemon);
            }
        } catch (SQLException e) {
            throw e;
        }

        return new ArrayList<>(pokemonMap.values());
    }

    protected int insertPokemon(Connection conn, Pokemon pokemon) throws SQLException {
        String sql = "INSERT INTO pokemon (pok_name) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, pokemon.getPokName());
            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating pokemon failed, no rows affected.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating pokemon failed, no ID obtained.");
                }
            }
        }
    }

    public void updatePokemonName(String oldName, String newName) throws SQLException {
        String sql = "UPDATE pokemon SET pok_name = ? WHERE pok_name = ?";
        try (PreparedStatement stmt = cnt.prepareStatement(sql)) {
            stmt.setString(1, newName);
            stmt.setString(2, oldName);
            stmt.executeUpdate();
        }
    }

    public void deletePokemonByName(String name) throws SQLException {
        // First delete the associated abilities
        String deleteAbilitiesSql = "DELETE FROM pokemon_abilities WHERE pok_id = (SELECT pok_id FROM pokemon WHERE pok_name = ?)";
        try (PreparedStatement stmt = cnt.prepareStatement(deleteAbilitiesSql)) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        }

        // Delete the associated base stats
        String deleteBaseStatsSql = "DELETE FROM base_stats WHERE pok_id = (SELECT pok_id FROM pokemon WHERE pok_name = ?)";
        try (PreparedStatement stmt = cnt.prepareStatement(deleteBaseStatsSql)) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        }

        // Then delete the pokemon
        String deletePokemonSql = "DELETE FROM pokemon WHERE pok_name = ?";
        try (PreparedStatement stmt = cnt.prepareStatement(deletePokemonSql)) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        }
    }

    protected void deletePokemonWithAbilities(int pokemonId) throws SQLException {
        // Eliminar todas las habilidades asociadas al Pokémon
        String deleteAbilitiesQuery = "DELETE FROM pokemon_abilities WHERE pok_id = ?";
        try (PreparedStatement stmt = cnt.prepareStatement(deleteAbilitiesQuery)) {
            stmt.setInt(1, pokemonId);
            stmt.executeUpdate();
        }

        // Eliminar el Pokémon en sí
        String deletePokemonQuery = "DELETE FROM pokemon WHERE pok_id = ?";
        try (PreparedStatement stmt = cnt.prepareStatement(deletePokemonQuery)) {
            stmt.setInt(1, pokemonId);
            stmt.executeUpdate();
        }
    }

    public void linkPokemonWithAbility(Connection conn, int pokemonId, int abilityId, boolean isHidden, int slot) throws SQLException {
        String sql = "INSERT INTO pokemon_abilities (pok_id, abil_id, is_hidden, slot) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pokemonId);
            stmt.setInt(2, abilityId);
            stmt.setBoolean(3, isHidden);
            stmt.setInt(4, slot);
            stmt.executeUpdate();
        }
    }

    private static Pokemon readPokemonFromResultSet(ResultSet rs) throws SQLException {
        int pokID = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_ID);
        String pokName = rs.getString(PokemonTablesColumn.COLUM_NAME__POK_NAME);
        int pokHeight = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_HEIGHT);
        int pokWeight = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_WEIGHT);
        int pokBaseExperience = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_BASE_EXPERCIENCE);
        Pokemon pokemon = new Pokemon(pokID, pokName, pokHeight, pokWeight, pokBaseExperience);
        return pokemon;
    }

    private Ability readAbilityFromResultSet(ResultSet result) throws SQLException {
        int abilityId = result.getInt("abil_id");
        String abilityName = result.getString("abil_name");
        return new Ability(abilityId, abilityName);
    }

    private class PokemonTablesColumn {

        private final static String COLUM_NAME__POK_ID = "pok_id";

        private final static String COLUM_NAME__POK_NAME = "pok_name";

        private final static String COLUM_NAME__POK_HEIGHT = "pok_height";

        private final static String COLUM_NAME__POK_WEIGHT = "pok_weight";

        private final static String COLUM_NAME__POK_BASE_EXPERCIENCE = "pok_base_experience";

    }

}
