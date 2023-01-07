package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;
import java.io.Serializable;

public class RegistroDeRechazo extends RegistroDeMercancia implements Serializable {

    /**
     * 
     * @param id
     * @param fecha
     * @param litros
     * @param emisor
     * @param receptor
     * @param empresa
     */
    public RegistroDeRechazo(String id, String fecha, int litros, Trabajador emisor, Trabajador receptor, EmpresaAcopio empresa) {
        super(id, fecha, litros, emisor, receptor, empresa);
        
    }

}