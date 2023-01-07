/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.BarrasDeMenu;

import Model.Fichero;
import View.VentanaNotificacion;
import View.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;

/**
 *
 * @author Kevin
 */
public class MenuItemGuardar extends JMenuItem implements ActionListener {
    VentanaPrincipal parent;
    
    public MenuItemGuardar(VentanaPrincipal parent){
        super("Guardar");
        this.parent = parent;
        this.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Fichero.saveEmpresa(parent.empresa);
        } catch (IOException ex) {
            Logger.getLogger(MenuItemGuardar.class.getName()).log(Level.SEVERE, null, ex);
            VentanaNotificacion notificacion = new VentanaNotificacion(parent, "No se pudo guardar");
        }
    }
    
}
