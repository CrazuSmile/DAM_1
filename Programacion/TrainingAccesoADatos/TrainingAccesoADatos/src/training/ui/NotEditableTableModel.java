/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.ui;

import javax.swing.table.DefaultTableModel;

/**
 * Clase hija de la base de Swing <code>DefaultTableModel</code>. Tiene la característica que no
 * permite editar ninguna celda
 * @author jsanm
 */
public class NotEditableTableModel extends DefaultTableModel{
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
}
