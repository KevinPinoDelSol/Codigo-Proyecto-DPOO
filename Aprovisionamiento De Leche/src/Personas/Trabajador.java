package Personas;

import Edificios.*;

public class Trabajador extends Persona {
    
    public Trabajador(){}
    
    public Trabajador(String nombre, String apellidos, int CI, String FechaDeEntrada, EmpresaAcopio Empresa){
        super(nombre, apellidos, CI);
        this.FechaDeEntradaAEmpresa=FechaDeEntrada;
        this.EmpresaAsignada=Empresa;
    }

    private String FechaDeEntradaAEmpresa;
    private EmpresaAcopio EmpresaAsignada;

    public String getFechaDeEntradaAEmpresa() {
        return this.FechaDeEntradaAEmpresa;
    }

    /**
     * 
     * @param FechaDeEntradaAEmpresa
     */
    public void setFechaDeEntradaAEmpresa(String FechaDeEntradaAEmpresa) {
        this.FechaDeEntradaAEmpresa=FechaDeEntradaAEmpresa;
    }

    public EmpresaAcopio getEmpresaAsignada() {
        return this.EmpresaAsignada;
    }

    /**
     * 
     * @param EmpresaAsignada
     */
    public void setEmpresaAsignada(EmpresaAcopio EmpresaAsignada) {
        this.EmpresaAsignada=EmpresaAsignada;
    }

}