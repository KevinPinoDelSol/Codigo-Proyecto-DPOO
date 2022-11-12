package Personas;

import Edificios.*;
import Interfaces.*;


public class AdministradorAcopio extends Usuario implements RecepcionDeLeche {

    private Silo[] silosAsignados;

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param entrada
     * @param empresa
     * @param contrasenna
     */
    public void AministradorAcopio(String nombre, int CI, String apellidos, String entrada, EmpresaAcopio empresa, String contrasenna) {
        // TODO - implement AdministradorAcopio.AministradorAcopio
        throw new UnsupportedOperationException();
    }

    public Silo[] getSilosAsignados() {
        return this.silosAsignados;
    }

    /**
     * 
     * @param silosAsignados
     */
    public void setSilosAsignados(Silo[] silosAsignados) {
        this.silosAsignados = silosAsignados;
    }

    @Override
    public void ControlDeCalidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
