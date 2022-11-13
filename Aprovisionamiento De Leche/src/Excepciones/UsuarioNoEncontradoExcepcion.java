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

public class UsuarioNoEncontradoExcepcion extends Exception {
    
    /**mensaje por defecto: "Usuario no encontrado."
    */
    public UsuarioNoEncontradoExcepcion(){
        super("Usuario no encontrado.");
    }

    /**mensaje personalizado
    *@param mensaje 
    */
    public UsuarioNoEncontradoExcepcion(String mensaje){
        super(mensaje);
    }
}
