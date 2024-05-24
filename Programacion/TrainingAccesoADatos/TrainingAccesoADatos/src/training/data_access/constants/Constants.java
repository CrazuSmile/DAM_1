/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.data_access.constants;

import java.io.File;

/**
 * Constantes de la aplicación de training relacionadas con el acceso a datos
 * @author jsanm
 */
public class Constants {
        
    /**
     * path relativo al fichero de configuración que incluye las credenciales y URL configurables. Independiente
     * de la plataforma: <code><i>resources/db.properties</i></code>
     * <p>
     * Configurar en él el acceso a datos.
     * </p>
     */
    public final static String DB_CONFIG__FILE_NAME = "resources" + File.separator + "db.properties";
    
    /**
     * Nombre de la clase principal del driver de MySQL
     */
    public final static String MYSQL_DB_DRIVER__CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
    //propiedades configurables en el fichero de configuración
    
    /**
     * De las propiedades configurables en {@link #DB_CONFIG__FILE_NAME}, el usuario con el que se conecta a
     * base de datos la aplicación de training
     */
    public final static String DB_CONFIG__USER_PROPERTY = "user";
    
    /**
     * De las propiedades configurables en {@link #DB_CONFIG__FILE_NAME}, la contraseña con la que se conecta a
     * base de datos la aplicación de training.
     */
    public final static String DB_CONFIG__PWD_PROPERTY = "pass";
    
    /**
     * De las propiedades configurables en {@link #DB_CONFIG__FILE_NAME}, la URL jdbc con la que se conecta a
     * base de datos la aplicación de training
     */
    public final static String DB_CONFIG__URL_PROPERTY = "url";
    
    //Valores por defecto de credenciales y URL de acceso a datos 
    //(utilizadas en caso de error en la carga del fichero de configuración)
    
    /**
     * De las propiedades configurables en {@link #DB_CONFIG__FILE_NAME}, el valor por defecto de la propiedad 
     * {@link #DB_CONFIG__USER_PROPERTY}
     */
    public final static String DEFAULT_DATA_BASE__USER = "tester";
    
    /**
     * De las propiedades configurables en {@link #DB_CONFIG__FILE_NAME}, el valor por defecto de la propiedad 
     * {@link #DB_CONFIG__PWD_PROPERTY}
     */
    public final static String DEFAULT_DATA_BASE__PWD = "tester";
    
    /**
     * De las propiedades configurables en {@link #DB_CONFIG__FILE_NAME}, el valor por defecto de la propiedad 
     * {@link #DB_CONFIG__URL_PROPERTY}
     */
    public final static String DEFAULT_DATA_BASE__URL = "jdbc:mysql://localhost:3306/sakila";

}
