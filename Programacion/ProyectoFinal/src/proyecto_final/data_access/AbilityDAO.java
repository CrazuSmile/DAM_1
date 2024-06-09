
package proyecto_final.data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proyecto_final.objects.Ability;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jojos
 */

public class AbilityDAO extends DataAccessObject {

    public AbilityDAO(Connection cnt) {
        super(cnt);
    }

    /**
     *
     * @return @throws SQLException
     */
    protected List<Ability> loadAllAbilities() throws SQLException {
        List<Ability> abilities = new ArrayList<>();

        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM abilities");
        ResultSet result = stmt.executeQuery();

        while (result.next()) {
            abilities.add(readAbilitiesFromResultSet(result));
        }

        return abilities;
    }

    /**
     *
     * @param conn
     * @param ability
     *
     * @return
     * @throws SQLException
     */
    public int insertAbility(Connection conn, Ability ability) throws SQLException {
        String sql = "INSERT INTO abilities (abil_name) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, ability.getAbilName());
            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating ability failed, no rows affected.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Creating ability failed, no ID obtained.");
                }
            }
        }
    }

    protected void deleteAbility(int abilityId) throws SQLException {
    // Primero, eliminamos todas las filas relacionadas en la tabla pokemon_abilities
    String deletePokemonAbilitiesQuery = "DELETE FROM pokemon_abilities WHERE abil_id = ?";
    try (PreparedStatement stmt = cnt.prepareStatement(deletePokemonAbilitiesQuery)) {
        stmt.setInt(1, abilityId);
        stmt.executeUpdate();
    }
    
    // Luego, eliminamos la habilidad de la tabla abilities
    String deleteAbilityQuery = "DELETE FROM abilities WHERE abil_id = ?";
    try (PreparedStatement stmt = cnt.prepareStatement(deleteAbilityQuery)) {
        stmt.setInt(1, abilityId);
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected == 0) {
            throw new SQLException("No rows were deleted for Ability with ID: " + abilityId);
        }
    }
}


    public void updateAbilityName(int abilID, String newName) throws SQLException {
        String sql = "UPDATE abilities SET abil_name = ? WHERE abil_id = ?";
        try (PreparedStatement stmt = cnt.prepareStatement(sql)) {
            stmt.setString(1, newName);
            stmt.setInt(2, abilID);
            stmt.executeUpdate();
        }
    }

    private static Ability readAbilitiesFromResultSet(ResultSet rs) throws SQLException {
        int abilId = rs.getInt(AbilitiesTablesColumn.COLUMN_NAME__ABIL_ID);
        String abilName = rs.getString(AbilitiesTablesColumn.COLUMN_NAME__ABIL_NAME);
        Ability ability = new Ability(abilId, abilName);
        return ability;
    }

    private class AbilitiesTablesColumn {

        private static final String COLUMN_NAME__ABIL_ID = "abil_id";

        private static final String COLUMN_NAME__ABIL_NAME = "abil_name";
    }
}
