package Edificios;

import Personas.*;
import DocumentacionEmpresa.*;
import Excepciones.UsuarioNoEncontradoExcepcion;
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
    private Cheque[] cheque;

    public Cheque[] getCheque() {
        return cheque;
    }

    public void setCheque(Cheque[] cheque) {
        this.cheque = cheque;
    }

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

    public Secretaria[] getSecretarias() {
        return this.secretarias;
    }

    /**
     *        
     * @param secretarias
     */
    public void setSecretarias(Secretaria[] secretarias) {
        this.secretarias=secretarias;
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
     * @param registroEntrada
     */
    public void setRegistroEntrada(RegistroDeEntrada[] registroEntrada) {
        this.registroEntrada=registroEntrada;
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
    
    /**
     * Annade un elemento a los registros de la Empresa.
     * 
     * @param <E>
     * @param elemento
     * @throws Exception 
     * 
     */
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
        else if(elemento instanceof Cheque){
            viejoArreglo=(E[]) this.cheque;
            nuevoArreglo=(E[]) new Cheque[this.cheque.length+1];
        }
        else throw new Exception();
        
        System.arraycopy(viejoArreglo, 0, nuevoArreglo, 0, viejoArreglo.length);
        nuevoArreglo[nuevoArreglo.length-1]=elemento;
        
    }
    
    public Usuario getUserByCI(int CI) throws UsuarioNoEncontradoExcepcion{
        for(int i=0;i<this.secretarias.length;i++){
            if(secretarias[i].getCI()==CI) return secretarias[i];
        }
        for(int i=0;i<this.transportistas.length;i++){
            if(transportistas[i].getCI()==CI) return transportistas[i];
        }
        for(int i=0;i<this.contables.length;i++){
            if(contables[i].getCI()==CI) return contables[i];
        }
        for(int i=0;i<this.administradores.length;i++){
            if(administradores[i].getCI()==CI) return administradores[i];
        }
        throw new UsuarioNoEncontradoExcepcion();
    }
}
