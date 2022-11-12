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
    private Secretaria[] secretarias;
    private Almacen[] almacenes;
    private RegistroDeRechazo[] registroRechazo;
    private RegistroDeEntrada[] registroEntrada;
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
            return this.secretarias;

        }

	/**
	 * 
	 * @param gerentes
	 */
        public void setGerentes(Secretaria[] gerentes) {
            this.secretarias = gerentes;
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
        return this.registroEntrada;
    }

	/**
	 * 
	 * @param RegistroEntrada
	 */
    public void setRegistroEntrada(RegistroDeEntrada[] RegistroEntrada) {
        this.registroEntrada=RegistroEntrada;
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
        this.nombre=nombre;
        this.secretarias=new Secretaria[1];
        this.secretarias[0]=secretaria;
    }
    
    public <E> void  addElement (E elemento) throws Exception{
        E[] nuevoArreglo;
        E[] viejoArreglo;
        if(elemento instanceof Secretaria){
            viejoArreglo=(E[]) this.secretarias;
            nuevoArreglo=(E[]) new Secretaria[this.secretarias.length+1];
        }
        else if(elemento instanceof Transportista){
            viejoArreglo=(E[]) this.transportistas;
            nuevoArreglo=(E[]) new Transportista[this.transportistas.length+1];
        }
        else if(elemento instanceof Ganadero){
            viejoArreglo=(E[]) this.ganaderos;
            nuevoArreglo=(E[]) new Ganadero[this.ganaderos.length+1];
        }
        else if(elemento instanceof Contable){
            viejoArreglo=(E[]) this.contables;
            nuevoArreglo=(E[]) new Contable[this.contables.length+1];
        }
        else if(elemento instanceof Vehiculo){
            viejoArreglo=(E[]) this.vehiculos;
            nuevoArreglo=(E[]) new Vehiculo[this.vehiculos.length+1];
        }
        else if(elemento instanceof AdministradorAcopio){
            viejoArreglo=(E[]) this.administradores;
            nuevoArreglo=(E[]) new AdministradorAcopio[this.administradores.length+1];
        }
        else if(elemento instanceof Almacen){
            viejoArreglo=(E[]) this.almacenes;
            nuevoArreglo=(E[]) new Almacen[this.almacenes.length+1];
        }
        else if(elemento instanceof RegistroDeEntrada){
            viejoArreglo=(E[]) this.registroEntrada;
            nuevoArreglo=(E[]) new RegistroDeEntrada[this.registroEntrada.length+1];
        }
        else if(elemento instanceof RegistroDeRechazo){
            viejoArreglo=(E[]) this.registroRechazo;
            nuevoArreglo=(E[]) new RegistroDeRechazo[this.registroRechazo.length+1];
        }
        else throw new Exception();
        
        System.arraycopy(viejoArreglo, 0, nuevoArreglo, 0, viejoArreglo.length);
        nuevoArreglo[nuevoArreglo.length-1]=elemento;
        
    }
}