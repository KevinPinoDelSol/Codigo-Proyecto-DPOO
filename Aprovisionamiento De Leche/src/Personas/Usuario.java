package Personas;

import Edificios.EmpresaAcopio;
import java.util.Date;

public class Usuario extends Trabajador {
    
    private String contrasenna;
    
    public Usuario(){}
    
    public Usuario(String nombre, String apellidos, long CI, Date FechaDeEntrada, EmpresaAcopio Empresa, String contrasenna){
        super( nombre,  apellidos,  CI,  FechaDeEntrada,  Empresa);
        this.contrasenna=contrasenna;
    }

    public String getContrasenna() {
        return this.contrasenna;
    }

    /**
     * 
     * @param contrasenna
     */
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

}