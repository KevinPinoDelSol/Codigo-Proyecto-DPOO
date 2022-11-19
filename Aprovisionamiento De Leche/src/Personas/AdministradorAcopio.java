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
     * @param contrasenna
     */
    public AdministradorAcopio(String nombre, String apellidos, int CI, String FechaDeEntrada, EmpresaAcopio Empresa, String contrasenna) {
        super(nombre, apellidos, CI, FechaDeEntrada, Empresa, contrasenna);
    }

    public AdministradorAcopio(){}

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
