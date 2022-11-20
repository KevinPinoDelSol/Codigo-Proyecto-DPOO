/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.BarrasDeMenu;

import Personas.*;
import View.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class BarraSecretaria extends JMenuBar implements ActionListener{
    VentanaPrincipal parent;
    JMenuItem inicio;
    MenuUsuarios usuarios;
    JMenu vehiculos;

    public BarraSecretaria(VentanaPrincipal parent) {
        this.parent=parent;
        
        inicio =new JMenuItem("Inicio");
        inicio.addActionListener(this);
        usuarios=new MenuUsuarios("Usuarios", parent);
        vehiculos=new JMenu("Vehiculos");
        
        add(inicio);
        add(usuarios);
        add(vehiculos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem botonpresionado=(JMenuItem)e.getSource();
        
        if(botonpresionado==inicio){
            parent.setVisualInicio();
        }
    }
    
    
    
    
    
    private static class MenuUsuarios extends JMenu implements ActionListener{
        VentanaPrincipal parent;
        
        JMenuItem tablaTodos=new JMenuItem("Todos");
        JMenuItem tablaUsuarios=new JMenuItem("Usuarios");
        JMenuItem tablaSecretarias=new JMenuItem("Secretarias");
        JMenuItem tablaAdministradores=new JMenuItem("Administradores");
        JMenuItem tablaTransportistas=new JMenuItem("Transportistas");
        JMenuItem tablaContables=new JMenuItem("Contables");
        JMenuItem tablaGanaderos=new JMenuItem("Ganaderos");
        JMenuItem Crear=new JMenuItem("Crear");
        
        public MenuUsuarios(String nombre, VentanaPrincipal parent) {
            super(nombre);
            this.parent=parent;
            
            tablaTodos.addActionListener(this);
            tablaUsuarios.addActionListener(this);
            tablaSecretarias.addActionListener(this);
            tablaAdministradores.addActionListener(this);
            tablaTransportistas.addActionListener(this);
            tablaContables.addActionListener(this);
            tablaGanaderos.addActionListener(this);
            Crear.addActionListener(this);
            
            
             this.add(tablaTodos);
             this.add(tablaUsuarios);
             this.add(tablaSecretarias);
             this.add(tablaAdministradores);
             this.add(tablaTransportistas);
             this.add(tablaGanaderos);
             this.add(tablaContables);
             this.add(Crear);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuPulsado=(JMenuItem)e.getSource();
            
            if(menuPulsado==tablaTodos) {
                parent.setVisualTabla(parent.empresa.getTrabajadores());
            } else if(menuPulsado==Crear){
                parent.setVisualNuevoTrabajador(false, true, null);
            }
            
            
        }
    }
    
}
