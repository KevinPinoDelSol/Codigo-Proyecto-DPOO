package DocumentacionEmpresa;

import Edificios.EmpresaAcopio;
import Personas.*;

public class RegistroDeRechazo extends RegistroDeMercancia {

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