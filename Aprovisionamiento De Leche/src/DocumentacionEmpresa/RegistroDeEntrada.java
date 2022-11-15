package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;

public class RegistroDeEntrada extends RegistroDeMercancia {

    private boolean pagado;

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
    public RegistroDeEntrada(String id, String fecha, int litros, Trabajador emisor, Trabajador receptor, EmpresaAcopio empresa) {
        super(id, fecha, litros, emisor, receptor, empresa);
        this.pagado=false;
    }

}