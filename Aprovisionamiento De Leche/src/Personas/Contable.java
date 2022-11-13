package Personas;

import Edificios.*;

public class Contable extends Usuario {

    public void PagarGanaderos() {
        // TODO - implement Contable.PagarGanaderos
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param entrada
     * @param empresa
     * @param contrasenna
     */
    public Contable(String nombre, int CI, String apellidos, String entrada, EmpresaAcopio empresa, String contrasenna) {
        super( nombre,  apellidos,  CI,  entrada,  empresa, contrasenna);

    }

}