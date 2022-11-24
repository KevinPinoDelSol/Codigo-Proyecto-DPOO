/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Paneles;

import View.*;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Kevin
 */
public class Tabla extends JPanel{
    VentanaPrincipal parent;
    DefaultTableModel modelo;
    String[] titulos;
    Object[][] datos;
    
    public Tabla(VentanaPrincipal parent, Object[] objetos){
        setLayout(new BorderLayout());
        
        add(new JButton("weeee"),BorderLayout.NORTH);
        //JScrollBar barraDesplazamiento =new JScrollBar(JScrollBar.VERTICAL);
        //barraDesplazamiento.setBounds(this.getWidth()-30, 0, 30, this.getHeight());
        //this.add(barraDesplazamiento);
        datos=setDatos(objetos);
        titulos=new String[]{"nombre", "Datos"};
        
        modelo = new DefaultTableModel(titulos, 40);
        
        JTable tabla=new JTable(modelo);
        
        //tabla.addColumn(new TableColumn(0, 30));
        
        //tabla.setBounds(0, 0, this.getWidth(), this.getHeight());
        add(tabla, BorderLayout.SOUTH);
        
    }

    private Object[][] setDatos(Object[] objetos) {
        return new Object[][]{{null,null},{null,null}};
    }
    
}
