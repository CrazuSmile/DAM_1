/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import proyecto_final.data_access.DataAccessManager;
import proyecto_final.ui.UserInterfaceFrame;

/**
 *
 * @author jojos
 */
public class AccessUIApp {
    public static void main(String[] args) {
        UserInterfaceFrame mainWindow = null;
        
        try{
            mainWindow = new UserInterfaceFrame();
        } catch(SQLException e){
            System.out.println("Error al iniciar la aplicacion: "+e.getMessage()+" Saliendo del programa...");
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
