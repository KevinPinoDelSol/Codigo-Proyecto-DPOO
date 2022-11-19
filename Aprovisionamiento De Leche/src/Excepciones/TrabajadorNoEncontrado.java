/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Kevin
 */
public class TrabajadorNoEncontrado extends Exception {

    public TrabajadorNoEncontrado() {
        super("No existe este trabajador");
    }
    
}
