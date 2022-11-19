/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Paneles.NuevaEmpresa;
import View.Paneles.LogIn;
import Edificios.EmpresaAcopio;
import Model.Fichero;
import Personas.*;
import Personas.Usuario;
import View.Paneles.FormularioPrincipal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class VentanaPrincipal extends JFrame{
        private Usuario usuario;
        public   EmpresaAcopio empresa;
        private JPanel panelActual;
        private JPanel panelinferior;
        private JMenuBar barraMenu;
    /**
     * Crea la ventana Principal de la GUI
     */
        public VentanaPrincipal(JPanel panelActual){
            this.panelActual.setLayout(null);
            this.setLayout(null);
            remove(this.panelActual);
            this.removeAll();
            System.out.println("constructor");
            this.panelActual=panelActual;
            this.add(panelActual);
            
        }
    public VentanaPrincipal() {
        
        setBounds(5, 5, 640, 480);
        try {
            this.empresa=Fichero.loadEmpresa();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(empresa == null || empresa.getSecretarias().length==0){
            this.setTitle("Nueva Empresa.");
            setVisualNuevaEmpresa();
       } else {
            this.setTitle(this.getEmpresa().getNombre());
            setVisualLogIn();
        }
            
        
    }
        private void actualizar(){
            remove(panelActual);
            this.setBounds((int)this.getX(),(int) this.getY(), this.getWidth()+1, this.getHeight());
            this.setBounds((int)this.getX(),(int) this.getY(), this.getWidth()-1, this.getHeight());
        }
    
    public EmpresaAcopio getEmpresa() {
        return empresa;
    }
    public void setEmpresa(EmpresaAcopio empresa) {
        this.empresa = empresa;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    public void setVisualLogIn(){
        actualizar();
        panelActual = new LogIn(this);
        this.add(panelActual);
    }
    public void setVisualSecretaria(){
        
    }
    public void setVisualContable(){
        
    }
    public void setVisualAdministrador(){
        
    }
    public void setVisualTransportista(){
        
    }
    public void setVisualNuevaEmpresa(){
        panelActual= new NuevaEmpresa(this);
        panelActual.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.add(panelActual);
    }
    
    public void setVisualNuevoTrabajador(boolean DebeIniciarSesion, boolean rolCambiable, Trabajador trabajador){
        actualizar();
        panelActual=new FormularioPrincipal(this, true, false, new Secretaria());
        add(panelActual);
    }
    
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JPanel nuevoPanel=null;
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
}
