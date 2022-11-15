package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;

public class RegistroDeMercancia {
    protected String id;

    protected String fecha;
    protected int cantidadLitros;
    protected Trabajador emisor;
    protected Trabajador receptor;
    protected EmpresaAcopio empresa;

    public RegistroDeMercancia(String id, String fecha, int cantidadLitros, Trabajador emisor, Trabajador receptor, EmpresaAcopio empresa) {
        this. id=id;
        this.fecha = fecha;
        this.cantidadLitros = cantidadLitros;
        this.emisor = emisor;
        this.receptor = receptor;
        this.empresa = empresa;
    }
    public String getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(int cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public Trabajador getEmisor() {
        return emisor;
    }

    public void setEmisor(Trabajador emisor) {
        this.emisor = emisor;
    }

    public Trabajador getReceptor() {
        return receptor;
    }

    public void setReceptor(Trabajador receptor) {
        this.receptor = receptor;
    }

    public EmpresaAcopio getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaAcopio empresa) {
        this.empresa = empresa;
    }


    
}