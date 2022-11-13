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
public class ContrasennaIncorectaExcepcion extends Exception{
    /**mensaje por defecto: "La contraseña es incorrecta."
    */
    public ContrasennaIncorectaExcepcion(){
        super("La contraseña es incorrecta.");
    }

    /**mensaje personalizado
    *@param mensaje 
    */
    public ContrasennaIncorectaExcepcion(String mensaje){
        super(mensaje);
    }
}
