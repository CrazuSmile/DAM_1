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
import java.util.Date;
import java.util.List;
import proyecto_final.objects.Pokemon;
/**
 *
 * @author jojos
 */
public class PokemonDOA extends DataAccessObject{
    
    PokemonDOA(Connection cnt){
        super(cnt);
    }
    
    protected List<Pokemon> loadAllPokemon() throws SQLException{
        List<Pokemon> pokemones = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM pokemon");
        ResultSet result = stmt.executeQuery();
        
        while(result.next()){
            pokemones.add(readPokemonFromResultSet(result));
        }
        
        return pokemones;
    }
}
