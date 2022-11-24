package Personas;

import Edificios.*;
import java.util.Date;

public class Trabajador extends Persona {
    
    public Trabajador(){}
    
    public Trabajador(String nombre, String apellidos, long CI, Date FechaDeEntrada, EmpresaAcopio Empresa){
        super(nombre, apellidos, CI);
        this.FechaDeEntradaAEmpresa=FechaDeEntrada;
        this.EmpresaAsignada=Empresa;
    }

    private Date FechaDeEntradaAEmpresa;
    private EmpresaAcopio EmpresaAsignada;

    public Date getFechaDeEntradaAEmpresa() {
        return this.FechaDeEntradaAEmpresa;
    }

    /**
     * 
     * @param FechaDeEntradaAEmpresa
     */
    public void setFechaDeEntradaAEmpresa(Date FechaDeEntradaAEmpresa) {
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