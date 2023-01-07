package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;
import java.io.Serializable;

public class RegistroDeEntrada extends RegistroDeMercancia implements Serializable{

    private boolean pagado;

    public boolean isPagado() {
        return pagado;
    }
    public String isPagadoString(){
        if(pagado) return "Ya pagado";
        else          return "No pagado";
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
    public RegistroDeEntrada(String id, String fecha, int litros, Trabajador emisor, Trabajador receptor, EmpresaAcopio empresa) {
        super(id, fecha, litros, emisor, receptor, empresa);
        this.pagado=false;
    }

}