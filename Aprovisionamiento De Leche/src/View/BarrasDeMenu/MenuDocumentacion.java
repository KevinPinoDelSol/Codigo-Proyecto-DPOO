/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.BarrasDeMenu;

import DocumentacionEmpresa.Cheque;
import DocumentacionEmpresa.RegistroDeEntrada;
import DocumentacionEmpresa.RegistroDeMercancia;
import DocumentacionEmpresa.RegistroDeRechazo;
import Personas.Contable;
import View.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Kevin
 */
public class MenuDocumentacion extends JMenu implements ActionListener{
        VentanaPrincipal parent;
        
        JMenuItem Entrada=new JMenuItem("Registros de Entrada");
        JMenuItem Rechazo=new JMenuItem("Registros de Salida");
        JMenuItem Cheque=new JMenuItem("Cheques de pagos");
        
        JMenuItem Pagar=new JMenuItem("Pagar a los ganaderos");

        public MenuDocumentacion(String nombre, VentanaPrincipal parent) {
            super(nombre);
            this.parent=parent;
            
            Entrada.addActionListener(this);
            Rechazo.addActionListener(this);
            Cheque.addActionListener(this);
            
            Pagar.addActionListener(this);
            
            
            add(Entrada);
            add(Rechazo);
            add(Cheque);
            
            if(parent.usuario instanceof Contable)
                add(Pagar);
            
        }

        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem presionado=(JMenuItem) e.getSource();
            
            if(presionado==Entrada) parent.setVisualTabla(RegistroDeEntrada.class);
            if(presionado==Rechazo) parent.setVisualTabla(RegistroDeRechazo.class);
            if(presionado==Cheque) parent.setVisualTabla(Cheque.class);
            
            if(presionado==Pagar) parent.setVisualPagoDeCheque();
        }
        
    }