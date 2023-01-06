package Edificios;

import Interfaces.AlmacenamientoDeLeche;
import Personas.AdministradorAcopio;

public class Silo implements AlmacenamientoDeLeche {
    private int Id;
    private int CapacidadMaximaLitros;
    private int ContenidoActualLitros;
    private AdministradorAcopio Administrador;

    /**
     * 
     * @param capacidad
     * @param contenido
     */
    public Silo(int capacidad, int contenido) {
        // TODO - implement Silo.Silo
        throw new UnsupportedOperationException();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCapacidadMaximaLitros() {
        // TODO - implement Silo.getCapacidadMaximaLitros
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param Capacidad
     */
    public void setCapacidad(int Capacidad) {
        // TODO - implement Silo.setCapacidad
        throw new UnsupportedOperationException();
    }

    public int getContenidoLitros() {
        // TODO - implement Silo.getContenidoLitros
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param Contenido
     */
    public void setContenidoLitros(int Contenido) {
        // TODO - implement Silo.setContenidoLitros
        throw new UnsupportedOperationException();
    }

    public AdministradorAcopio getAdministrador() {
        // TODO - implement Silo.getAdministrador
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param Administrador
     */
    public void setAdministrador(AdministradorAcopio Administrador) {
        // TODO - implement Silo.setAdministrador
        throw new UnsupportedOperationException();
    }

    @Override
    public void CargarLeche(int litros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DescargarLeche(int litros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}