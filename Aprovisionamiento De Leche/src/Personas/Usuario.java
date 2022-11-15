package Personas;

import Edificios.EmpresaAcopio;

public class Usuario extends Trabajador {
    
    private String contrasenna;

    public Usuario(String nombre, String apellidos, int CI, String FechaDeEntrada, EmpresaAcopio Empresa, String contrasenna){
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