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
        vehiculos=new MenuVehiculos(parent);
        
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
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(Trabajador.class), "Trabajador");
            } else if(menuPulsado==tablaSecretarias){
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(Secretaria.class), "Secretaria");
            } else if(menuPulsado==tablaUsuarios){
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(Usuario.class), "Usuario");
            } else if(menuPulsado==Crear){
                parent.setVisualNuevoTrabajador(false, true, null);
            }else if(menuPulsado==tablaAdministradores){
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(AdministradorAcopio.class),"Administrador");
            }else if(menuPulsado==tablaContables){
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(Contable.class), "Contable");
            }else if(menuPulsado==tablaGanaderos){
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(Ganadero.class),"Ganadero");
            }else if(menuPulsado==tablaTransportistas){
                parent.setVisualTabla(parent.empresa.getTrabajadoresPorTipo(Transportista.class), "Transportista");
                
            }
        }
    }
    private static class MenuVehiculos extends JMenu implements ActionListener{
        VentanaPrincipal parent;

        JMenuItem tablaTodos=new JMenuItem("Todos");
        JMenuItem tablaCamionesCisterna=new JMenuItem("Camiones Cisterna");
        JMenuItem Crear=new JMenuItem("Crear");
        
        public MenuVehiculos(VentanaPrincipal parent){
            super("Vehiculos");
            this.parent=parent;
            
            add(tablaTodos);
            add(Crear);
     //                        add(tablaCamionesCisterna);
            
            tablaTodos.addActionListener(this);
            tablaCamionesCisterna.addActionListener(this);
            Crear.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem pulsado=(JMenuItem)e.getSource();
            
            if(pulsado==tablaTodos){
                parent.setVisualTabla(parent.empresa.getVehiculos(),"Vehiculo");
            } else if(pulsado==tablaCamionesCisterna){
                parent.setVisualTabla(parent.empresa.getCamionesCisterna(), "CamionCisterna");
            } else if(pulsado==Crear){
                parent.setVisualNuevoVehiculo();
            }
            
        }
    }
}
