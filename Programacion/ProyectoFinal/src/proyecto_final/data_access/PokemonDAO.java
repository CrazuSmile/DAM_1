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
import java.util.List;
import proyecto_final.objects.Pokemon;
/**
 *
 * @author jojos
 */
public class PokemonDAO extends DataAccessObject{
    
    PokemonDAO(Connection cnt){
        super(cnt);
    }
    
    protected List<Pokemon> loadAllPokemon() throws SQLException{
        List<Pokemon> pokemons = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM pokemon");
        ResultSet result = stmt.executeQuery();
        
        while(result.next()){
            pokemons.add(readPokemonFromResultSet(result));
        }
        
        return pokemons;
    }
    
    protected List<Pokemon> loadPokemonContaining(String content) throws SQLException {
        List<Pokemon> pokemons = new ArrayList<>();
        
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM pokemon WHERE pok_name LIKE ?");
        stmt.setString(1,content);
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            pokemons.add(readPokemonFromResultSet(result));
        }
                      
            
        return pokemons;
    }
    
    private static Pokemon readPokemonFromResultSet(ResultSet rs) throws SQLException{
        int pokID = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_ID);
        String pokName = rs.getString(PokemonTablesColumn.COLUM_NAME__POK_NAME);
        int pokHeight = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_HEIGHT);
        int pokWeight = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_WEIGHT);
        int pokBaseExperience = rs.getInt(PokemonTablesColumn.COLUM_NAME__POK_BASE_EXPERCIENCE);
        Pokemon pokemon = new Pokemon(pokID, pokName, pokHeight, pokWeight, pokBaseExperience);
        return pokemon;
    }
    
    private class PokemonTablesColumn{
        private final static String COLUM_NAME__POK_ID = "pok_id";
        
        private final static String COLUM_NAME__POK_NAME = "pok_name";
        
        private final static String COLUM_NAME__POK_HEIGHT = "pok_height";
        
        private final static String COLUM_NAME__POK_WEIGHT = "pok_weight";

        private final static String COLUM_NAME__POK_BASE_EXPERCIENCE = "pok_base_experience";

        
    }

}
