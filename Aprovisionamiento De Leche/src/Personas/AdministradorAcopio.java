package Personas;

import Edificios.*;
import Interfaces.*;


public class AdministradorAcopio extends Usuario implements RecepcionDeLeche {

    private Silo[] silosAsignados;

    public AdministradorAcopio(String nombre, String apellidos, int CI, String FechaDeEntrada, EmpresaAcopio Empresa, String contrasenna) {
        super(nombre, apellidos, CI, FechaDeEntrada, Empresa, contrasenna);
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
    public void ControlDeCalidad(boolean calidad,int litros) {
        if (calidad) {
            RecibirLeche(litros);
        }
        else{
            RechazarLeche(litros);
        }
    }

    @Override
    public void RechazarLeche(int litros) {
        
        
    }

    @Override
    public void RecibirLeche(int litros) {
    }

}
