package Edificios;

import Personas.*;
import DocumentacionEmpresa.*;
import Vehiculos.*;

public class EmpresaAcopio {

	private String nombre;
	private Ganadero[] ganaderos;
	private Transportista[] transportistas;
	private AdministradorAcopio[] administradores;
	private Contable[] contables;
	private Secretaria[] gerentes;
	private Almacen[] almacenes;
	private RegistroDeRechazo[] registroRechazo;
	private RegistroDeEntrada[] RegistroEntrada;
	private Vehiculo[] vehiculos;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ganadero[] getGanaderos() {
		return this.ganaderos;
	}

	/**
	 * 
	 * @param ganaderos
	 */
	public void setGanaderos(Ganadero[] ganaderos) {
		this.ganaderos = ganaderos;
	}

	public Transportista[] getTransportistas() {
		return this.transportistas;
	}

	/**
	 * 
	 * @param transportistas
	 */
	public void setTransportistas(Transportista[] transportistas) {
		this.transportistas = transportistas;
	}

	public AdministradorAcopio[] getAdministradores() {
		return this.administradores;
	}

	/**
	 * 
	 * @param administradores
	 */
	public void setAdministradores(AdministradorAcopio[] administradores) {
		this.administradores = administradores;
	}

	public Contable[] getContables() {
		return this.contables;
	}

	/**
	 * 
	 * @param contables
	 */
	public void setContables(Contable[] contables) {
		this.contables = contables;
	}

	public Secretaria[] getGerentes() {
		return this.gerentes;
	}

	/**
	 * 
	 * @param gerentes
	 */
	public void setGerentes(Secretaria[] gerentes) {
		this.gerentes = gerentes;
	}

	public Almacen[] getAlmacenes() {
		return this.almacenes;
	}

	/**
	 * 
	 * @param almacen
	 */
	public void setAlmacenes(Almacen[] almacen) {
		this.almacenes = almacen;
	}

	public RegistroDeRechazo[] getRegistroRechazo() {
		return this.registroRechazo;
	}

	/**
	 * 
	 * @param registroRechazo
	 */
	public void setRegistroRechazo(RegistroDeRechazo[] registroRechazo) {
		this.registroRechazo = registroRechazo;
	}

	public RegistroDeEntrada[] getRegistroEntrada() {
		// TODO - implement EmpresaAcopio.getRegistroEntrada
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RegistroEntrada
	 */
	public void setRegistroEntrada(RegistroDeEntrada[] RegistroEntrada) {
		// TODO - implement EmpresaAcopio.setRegistroEntrada
		throw new UnsupportedOperationException();
	}

	public Vehiculo[] getVehiculos() {
		return this.vehiculos;
	}

	/**
	 * 
	 * @param vehiculos
	 */
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}

	/**
	 * 
	 * @param nombre
	 * @param secretaria
	 */
	public EmpresaAcopio(String nombre, Secretaria secretaria) {
		// TODO - implement EmpresaAcopio.EmpresaAcopio
		throw new UnsupportedOperationException();
	}

}