package Personas;

import Edificios.*;

public class Ganadero extends Trabajador {

    private String DireccionFinca;

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param entrada
     * @param empresa
     */
    public Ganadero(String nombre, int CI, String apellidos, String entrada, EmpresaAcopio empresa,String direccionFinca) {
        super(nombre,apellidos,CI,entrada,empresa);
        this.DireccionFinca=direccionFinca;
    }

    public Ganadero() {
    }

    public String getDireccionFinca() {
        return DireccionFinca;
    }

    public void setDireccionFinca(String DireccionFinca) {
        this.DireccionFinca = DireccionFinca;
    }

}