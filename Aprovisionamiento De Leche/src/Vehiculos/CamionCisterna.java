package Vehiculos;

import Interfaces.*;

public class CamionCisterna extends Vehiculo implements AlmacenamientoDeLeche {

    private int CapacidadMaximaLitros;

    public int getCapacidadMaximaLitros() {
        return CapacidadMaximaLitros;
    }

    public void setCapacidadMaximaLitros(int CapacidadMaximaLitros) {
        this.CapacidadMaximaLitros = CapacidadMaximaLitros;
    }

    public int getContenidoActualLitros() {
        return ContenidoActualLitros;
    }

    public void setContenidoActualLitros(int ContenidoActualLitros) {
        this.ContenidoActualLitros = ContenidoActualLitros;
    }
    private int ContenidoActualLitros;

    /**
     * 
     * @param id
     * @param capacidad
     * @param contenidoInicial
     */
    public CamionCisterna(int id, int capacidad, int contenidoInicial) {
 
        throw new UnsupportedOperationException();
    }

    @Override
    public void CargarLeche(int litros) {
        ContenidoActualLitros+=litros;
}

    @Override
    public void DescargarLeche(int litros) {
    }

}
