package Personas;

import Vehiculos.*;
import DocumentacionEmpresa.*;
import Edificios.*;
import Interfaces.*;


public class Transportista extends Usuario implements RecepcionDeLeche {

    private Vehiculo VehiculoAsignado;
    private HojaRuta RutaAsignada;

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param entrada
     * @param empresa
     * @param contrasenna
     */
    public Transportista(String nombre, int CI, String apellidos, String entrada, EmpresaAcopio empresa, String contrasenna) {
        // TODO - implement Transportista.Transportista
        throw new UnsupportedOperationException();
    }

    @Override
    public void ControlDeCalidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RechazarLeche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RecibirLeche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}