/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.data_access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import training.objects.Country;

/**
 * Clase de acceso a datos que manipula la lógica de acceso de la tabla <code>country</code>
 * @author jsanm
 */
class CountryDAO extends DataAccessObject{
    
     CountryDAO(Connection cnt){
        super(cnt);
    }
     
    /**
     * Consulta de la tabla <code>country</code> todos los registros y los devuelve como lista
     * de objetos
     * @return Lista dinámica con tantos objetos {@link Country} como registros existan en la bbdd (TODOS)
     * @throws SQLException Si hay algún error en la ejecución de la consulta
     */ 
    protected List<Country> loadAllCountries() throws SQLException{
        
        List<Country> cities = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM country ORDER BY country");
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            cities.add(readCountryFromResultSet(result));
        }
        
        return cities;
    }
    
    /**
     * Carga todos los países de la tabla <code>country</code> que contengan el contenido indicado.
     * @param content Contenido. Se buscan las ciudades que contengan dicho contenido. Puede ser una letra o una palabra.
     * @return Lista dinámica con tantos objetos {@link Country} como registros existan en la bbdd que
     * cumplan con el criterio de búsqueda
     * @throws SQLException Si hay algún error en la ejecución de la consulta
     */
    protected List<Country> loadCountriesContaining(String content) throws SQLException{
        
        List<Country> cities = new ArrayList<>();
        PreparedStatement stmt = cnt.prepareStatement("SELECT * FROM country WHERE country LIKE ?");
        stmt.setString(1,content);
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            cities.add(readCountryFromResultSet(result));
        }
        
        return cities;
    }
    
    
    /**
     * Actualiza el registro en base de datos que coincida con el id del objeto {@link Country#getCountryId()}.
     * @param newCountryName Nuevo nombre del país
     * @param id Id del registro a actualizar
     * @throws SQLException Si hay un error en base de datos
     */
    protected void updateCountry(String newCountryName, Short id) throws SQLException{
       
        PreparedStatement stmt = cnt.prepareStatement("UPDATE country SET country = ?, last_update = now() WHERE country_id = ?");
        stmt.setString(1,newCountryName);
        stmt.setShort(2,id);
        int numUpdatedRows = stmt.executeUpdate();
        
        if(numUpdatedRows!=1){
            cnt.rollback();
            throw new IllegalStateException("No se ha actualizado el registro que se esperaba actualizar");
        }
        
        cnt.commit();
    }
   
    
    /**
     * Elimina el registro en base de datos que coincida con el id del país a eliminar
     * @param idCountryToDelete Id del país a eliminar de la base de datos. 
     * @throws SQLException Si hay un error en base de datos
     */
    protected void deleteCountry(Short idCountryToDelete) throws SQLException{
        
        PreparedStatement stmt = cnt.prepareStatement("DELETE FROM country WHERE country_id = ?");
        stmt.setShort(1,idCountryToDelete);
        int numDeletedRows = stmt.executeUpdate();
        
        if(numDeletedRows!=1){
            cnt.rollback();
            throw new IllegalStateException("No se ha eliminado el registro que se esperaba eliminar");
        }
        
        cnt.commit();
    }
    
    
    /**
     * Añade un nuevo registro <code>country</code> en base de datos.
     * <p>
     * Dado que el <code>country_id</code> es autogenerado y la <code>last_update</code> acaece en el momento de ejecución de esta función,
     * serán datos de salida. 
     * </p>
     * @param countryName Nombre del país a añadir a la base de datos
     * @return Objeto {@link Country} equivalente al registro insertado
     * @throws SQLException Si hay un error en base de datos
     */
    protected Country insertCountry(String countryName) throws SQLException{
        
        PreparedStatement stmt = cnt.prepareStatement("INSERT INTO country (country, last_update) VALUES (?, ?)");
        stmt.setString(1,countryName);
        stmt.setTimestamp(2,new Timestamp(System.currentTimeMillis()));
        int numInsertedRows = stmt.executeUpdate();
        
        if(numInsertedRows!=1){
            cnt.rollback();
            throw new IllegalStateException("No se ha insertado el registro que se esperaba insertar");
        }
        
        List<Country> newRecord = this.loadCountriesContaining(countryName);
        
        if(newRecord==null || newRecord.size()!=1){
            cnt.rollback();
            throw new IllegalStateException("No se ha encontrado el registro que se esperaba encontrar");
        }
        
        cnt.commit();
        
        return newRecord.get(0);
    }

    /**
     * Lee de un <code>ResultSet</code> un registro de la base de datos. El result set debe contener las columnas de la tabla
     * <code>country</code>
     * @param rs ResultSet SQL
     * @return Un objeto país con los datos del registro actual del result set
     * @throws SQLException Si ocurre un error SQL
     */
    private static Country readCountryFromResultSet(ResultSet rs) throws SQLException {
        
        Short countryId = rs.getShort(CountryTableColumns.COLUMN_NAME__COUNTRY_ID);
        String countryName = rs.getString(CountryTableColumns.COLUMN_NAME__COUNTRY);
        Date lastUpdate = rs.getDate(CountryTableColumns.COLUMN_NAME__LAST_UPDATE);
        Country country = new Country(countryId, countryName, lastUpdate);
        return country;
    }
     
     /**
     * Clase donde definir constantes con los nombres de las columnas de la tabla <code>country</code>
     */
    private class CountryTableColumns{
        
        /**
         * Nombre de la columna con el identificador del registro
         */
        private final static String COLUMN_NAME__COUNTRY_ID = "country_id";
        
        /**
         * Nombre de la columna que contiene el nombre del país
         */
        private final static String COLUMN_NAME__COUNTRY = "country";
        
        /**
         * Nombre de la columna con la fecha de última modificación del registro
         */
        private final static String COLUMN_NAME__LAST_UPDATE = "last_update";
        
    }
}
