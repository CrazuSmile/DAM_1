/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import training.data_access.DataAccessManager;
import training.ui.CountryManagementWindow;

/**
 * Training de acceso a datos sobre la app de test de MySQL (bbdd <i>Sakila</i>) con interfaz de usuario. 
 * 
 * Se precisa para su funcionamiento
 * <ul>
 *  <li>Tener <b>instalado</b> y <b>levantado</b> el servidor de MySQL. <a href=https://dev.mysql.com/downloads/installer/>Descargar</a></li>
 *  <li>Tener <b>instalada</b> la aplicación de prueba <i>Sakila</i> de MySQL <a href=https://dev.mysql.com/doc/index-other.html/>Descargar</a></li>
 *  <li>Tener <b>instalada</b> la libería JDBC de MySQL <a href=https://dev.mysql.com/downloads/connector/j/>Descargar</a> y configurada 
 *  en el classpath de esta aplicación </li>
 *  <li><b>Configurar</b> el acceso a la base de datos desde <i>resources/db.properties</i></li>
 * </ul>
 * @author jsanm
 */
public class TrainingUIApp {
    
    /**
     * Ejecuta la aplicación de acceso a datos desde con entrada y salida estándar. 
     * <p><b>
     * Ampliar cada alumno según necesidades
     * </b></p>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CountryManagementWindow mainWindow = null;
        
        try{
            mainWindow = new CountryManagementWindow();
        }
        catch(SQLException sqle){
            System.out.println("Error al iniciar la aplicación. " + sqle.getMessage() + ". Saliendo...");
            return;
        }
        
        
        mainWindow.addWindowListener(new WindowListener() {
            @Override
            public void windowClosing(WindowEvent arg0) {
                if(DataAccessManager.connectionEnabled())
                    DataAccessManager.getInstance().close();
            }
            
            @Override
            public void windowOpened(WindowEvent arg0) {
                //nada que hacer
            }        

            @Override
            public void windowClosed(WindowEvent arg0) {
                //nada que hacer
            }

            @Override
            public void windowIconified(WindowEvent arg0) {
                //nada que hacer
            }

            @Override
            public void windowDeiconified(WindowEvent arg0) {
                //nada que hacer
            }

            @Override
            public void windowActivated(WindowEvent arg0) {
                //nada que hacer
            }

            @Override
            public void windowDeactivated(WindowEvent arg0) {
                //nada que hacer
            }
        });
        
        mainWindow.setVisible(true);
    }
}
