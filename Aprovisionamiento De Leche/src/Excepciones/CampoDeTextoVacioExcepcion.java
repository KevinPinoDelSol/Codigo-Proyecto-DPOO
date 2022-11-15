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
public class CampoDeTextoVacioExcepcion extends Exception{
    
    /**mensaje por defecto: "Uno o mas campos de texto obligatorios están vacios."
    */
    public CampoDeTextoVacioExcepcion(){
        super("Uno o mas campos de texto obligatorios están vacios.");
    }

    /**mensaje personalizado
    *@param mensaje 
    */
    public CampoDeTextoVacioExcepcion(String mensaje){
        super(mensaje);
    }
}
