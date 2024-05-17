package proyecto_final.data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proyecto_final.objects.Ability;

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
    
    protected List<Ability> loadAllAbilities() throws SQLException{
        List<Ability> abilities = new ArrayList<>();
        
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM abilities");
        ResultSet result = stmt.executeQuery();
        
        while(result.next()){
            abilities.add(readAbilitiesFromResultSet(result));
        }
        
        return abilities;
    }
    
    private static Ability readAbilitiesFromResultSet(ResultSet rs) throws SQLException{
        int abilId = rs.getInt(AbilitiesTablesColumn.COLUMN_NAME__ABIL_ID);
        String abilName = rs.getString(AbilitiesTablesColumn.COLUMN_NAME__ABIL_NAME);
        Ability ability = new Ability(abilId,abilName);
        return ability;
    }
    
    private class AbilitiesTablesColumn{
        private static final String COLUMN_NAME__ABIL_ID = "abil_id";
        
        private static final String COLUMN_NAME__ABIL_NAME = "abil_name";
    }
}
