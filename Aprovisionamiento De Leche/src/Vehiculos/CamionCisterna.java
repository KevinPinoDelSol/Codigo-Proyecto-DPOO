package Vehiculos;

import Interfaces.AlmacenamientoDeLeche;

public class CamionCisterna extends Vehiculo implements AlmacenamientoDeLeche {

	private int CapacidadMaximaLitros;
	private int ContenidoActualLitros;

	/**
	 * 
	 * @param id
	 * @param capacidad
	 * @param contenidoInicial
	 */
	public CamionCisterna(int id, int capacidad, int contenidoInicial) {
		// TODO - implement CamionCisterna.CamionCisterna
		throw new UnsupportedOperationException();
	}

    @Override
    public void CargarLeche(int litros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DescargarLeche(int litros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}