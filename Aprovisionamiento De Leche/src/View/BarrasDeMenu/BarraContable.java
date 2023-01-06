/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.BarrasDeMenu;

import View.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Kevin
 */
public class BarraContable extends JMenuBar implements ActionListener{
    VentanaPrincipal parent;
    MenuDocumentacion docs;
    JMenuItem inicio;
    
    public BarraContable(VentanaPrincipal parent){
        this.parent = parent;
        inicio = new JMenuItem("Inicio");
        docs = new MenuDocumentacion("Documentos", parent);
        
        inicio.addActionListener(this);
        
        add(inicio);
        add(docs);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.setVisualInicio();
    }
    
    
}
