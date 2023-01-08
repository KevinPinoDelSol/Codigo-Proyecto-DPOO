/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.BarrasDeMenu;

import Edificios.Silo;
import Personas.*;
import Vehiculos.CamionCisterna;
import Vehiculos.Vehiculo;
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
    MenuDocumentacion docs;
    JMenuItem inicio;
    MenuItemGuardar guardar;
    MenuUsuarios usuarios;
    JMenu vehiculos;
    MenuEdificios silos;

    public BarraSecretaria(VentanaPrincipal parent) {
        this.parent=parent;
        
        inicio =new JMenuItem("Inicio");
        inicio.addActionListener(this);
        guardar = new MenuItemGuardar(parent);
        silos = new MenuEdificios("Silos");
        usuarios=new MenuUsuarios("Usuarios", parent);
        vehiculos=new MenuVehiculos(parent);
        docs = new MenuDocumentacion("Documentos", parent);
        
        add(inicio);
        add(guardar);
        add(silos);
        add(usuarios);
        add(vehiculos);
        add(docs);
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
                parent.setVisualTabla(Trabajador.class);
            } else if(menuPulsado==tablaSecretarias){
                parent.setVisualTabla(Secretaria.class);
            } else if(menuPulsado==tablaUsuarios){
                parent.setVisualTabla(Usuario.class);
            } else if(menuPulsado==Crear){
                parent.setVisualNuevoTrabajador(false, true, null);
            }else if(menuPulsado==tablaAdministradores){
                parent.setVisualTabla(AdministradorAcopio.class);
            }else if(menuPulsado==tablaContables){
                parent.setVisualTabla(Contable.class);
            }else if(menuPulsado==tablaGanaderos){
                parent.setVisualTabla(Ganadero.class);
            }else if(menuPulsado==tablaTransportistas){
                parent.setVisualTabla(Transportista.class);
                
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
                parent.setVisualTabla(CamionCisterna.class);
            } else if(pulsado==tablaCamionesCisterna){
                parent.setVisualTabla(CamionCisterna.class);
            } else if(pulsado==Crear){
                parent.setVisualNuevoVehiculo();
            }
            
        }
    }
    
    
    
    private class MenuEdificios extends JMenu implements ActionListener{
        JMenuItem Empresa=new JMenuItem("Empresa");
        JMenuItem Almacen=new JMenuItem("Almacen");
        JMenuItem Silo=new JMenuItem("Crear");
        JMenuItem Lista=new JMenuItem("Lista");
        
        public MenuEdificios(String name) {
            super(name);
            //add(Empresa);
            //add(Almacen);
            add(Lista);
            add(Silo);
            
            Empresa.addActionListener(this);
            Almacen.addActionListener(this);
            Silo.addActionListener(this);
            Lista.addActionListener(this);
        }
        
        

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem presionado=(JMenuItem)e.getSource();
            
            if(presionado==Silo){
                parent.setVisualNuevoSilo();
            } else{
                parent.setVisualTabla(Silo.class);
            }
        }
        
    }
}
