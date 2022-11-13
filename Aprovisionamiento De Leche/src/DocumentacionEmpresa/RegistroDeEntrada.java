package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;

public class RegistroDeEntrada extends RegistroDeMercancia {

    private String Calidad;
    private boolean pagado;

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    /**
     * 
     * @param id
     * @param fecha
     * @param litros
     * @param emisor
     * @param receptor
     * @param calidad
     * @param empresa
     */
    public RegistroDeEntrada(int id, String fecha, int litros, Trabajador emisor, Trabajador receptor, String calidad, EmpresaAcopio empresa) {
        super(id, fecha, litros, emisor, receptor, empresa);
        this.Calidad=calidad;
        this.pagado=false;
    }

}