package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;

public class RegistroDeRechazo extends RegistroDeMercancia {

    private String RazonDeRechazo;

    public String getRazonDeRechazo() {
        return RazonDeRechazo;
    }

    public void setRazonDeRechazo(String RazonDeRechazo) {
        this.RazonDeRechazo = RazonDeRechazo;
    }

    /**
     * 
     * @param id
     * @param fecha
     * @param litros
     * @param emisor
     * @param receptor
     * @param razon
     * @param empresa
     */
    public RegistroDeRechazo(int id, String fecha, int litros, Trabajador emisor, Trabajador receptor, String razon, EmpresaAcopio empresa) {
        super(id, fecha, litros, emisor, receptor, empresa);
        this.RazonDeRechazo=razon;
    }

}