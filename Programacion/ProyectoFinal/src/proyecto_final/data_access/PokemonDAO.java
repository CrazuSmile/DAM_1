/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.data_access;

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
        List<Pokemon> pokemons = new ArrayList<>();

        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM pokemon WHERE pok_name LIKE ?");
        stmt.setString(1, content);
        ResultSet result = stmt.executeQuery();

        while (result.next()) {
            pokemons.add(readPokemonFromResultSet(result));
        }

        return pokemons;
    }

    protected List<Pokemon> loadPokemonsWithAbilities() throws SQLException {
        Map<Integer, Pokemon> pokemonMap = new HashMap<>();

        String query = "SELECT * FROM pokemon NATURAL JOIN pokemon_abilities NATURAL JOIN abilities ORDER BY pok_id";
        try (PreparedStatement stmt = cnt.prepareStatement(query);
             ResultSet result = stmt.executeQuery()) {

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
