package Edificios;

import Excepciones.TrabajadorNoEncontradoExcepcion;
import Personas.*;
import DocumentacionEmpresa.*;
import Excepciones.UsuarioNoEncontradoExcepcion;
import Vehiculos.*;
import java.util.ArrayList;
import java.lang.Class;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private ArrayList<Vehiculo> vehiculos;
    private Cheque[] cheque;
    private ArrayList<Trabajador> trabajadores;

    
    
    public EmpresaAcopio(String nombre) {
        this.nombre=nombre;
        this.administradores=new AdministradorAcopio[0];
        this.secretarias=new Secretaria[0];
        this.transportistas=new Transportista[0];
        this.contables=new Contable[0];
        this.ganaderos=new Ganadero[0];
        this.trabajadores=new ArrayList<>();
        
        this.registroEntrada=new RegistroDeEntrada[0];
        this.registroRechazo=new RegistroDeRechazo[0];
        this.cheque=new Cheque[0];
        
        this.vehiculos=new ArrayList<>();
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public Trabajador[] getTrabajadores() {
        Trabajador[] todos =new Trabajador[trabajadores.size()];
        
        for(int i=0; i<trabajadores.size(); i++){
            todos[i]=trabajadores.get(i);
        }
        
        return todos;
    }
    
    public void addTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }

    public Trabajador[] getTrabajadoresPorTipo(Class clase){
        int cantidadDelTipo=0;
        
        for(int i=0;i<trabajadores.size();i++){
                if(clase.isInstance(trabajadores.get(i))){
                    cantidadDelTipo++;
                }
        }
        
        Trabajador[] trabajadoresDeEseTipo= new Trabajador[cantidadDelTipo];
        
        int posicionDelArreglo=0;
        
        for(int i=0;i<trabajadores.size();i++){
                if(clase.isInstance(trabajadores.get(i))){
                    trabajadoresDeEseTipo[posicionDelArreglo]=trabajadores.get(i);
                    posicionDelArreglo++;
                }
        }
        return trabajadoresDeEseTipo;
    }

    public Trabajador getTrabajadorByCI(int CI)throws TrabajadorNoEncontradoExcepcion {
        for(int i=0;i<trabajadores.size();i++){
            if(trabajadores.get(i).getCI()==CI){
                return trabajadores.get(i);
            }
        }
        throw new TrabajadorNoEncontradoExcepcion();
    }

    public void deleteTrabajador(int CI) throws TrabajadorNoEncontradoExcepcion{
        
        int posicion=-1;
        boolean inexistente=true;
        
        for(int i=0; i<this.trabajadores.size() && inexistente;i++){
            if(transportistas[i].getCI()==CI){
                posicion=i;
                inexistente=false;
            }
        }
        
        if(inexistente)  throw new TrabajadorNoEncontradoExcepcion();
        
        else{
            trabajadores.remove(posicion);
        }
    }
    
    
    
    
    public RegistroDeRechazo[] getRegistroRechazo() {
        return this.registroRechazo;
    }

    public RegistroDeEntrada[] getRegistroEntrada() {
        // TODO - implement EmpresaAcopio.getRegistroEntrada
        throw new UnsupportedOperationException();
    }

    public Cheque[] getCheque() {
        return cheque;
    }
    
    
    

    public Vehiculo[] getVehiculos() {
        Vehiculo[] arregloVehiculos=new Vehiculo[vehiculos.size()];
        
         for (int i = 0; i < vehiculos.size(); i++) {
             arregloVehiculos[i]=vehiculos.get(i);
         }
        
        return arregloVehiculos;
    }

    public CamionCisterna[] getCamionesCisterna() {
         int cantidadCamiones=0;
        
        for(int i=0;i<trabajadores.size();i++){
            if(vehiculos.get(i) instanceof CamionCisterna)
                cantidadCamiones++;
        }
        
        CamionCisterna[] camiones=new CamionCisterna[cantidadCamiones];
        
        int posicionArreglo=0;
         for(int i=0;i<trabajadores.size();i++){
            if(trabajadores.get(i) instanceof Transportista){
                camiones[posicionArreglo]=(CamionCisterna)vehiculos.get(i);
                posicionArreglo++;
            }
         }
         return camiones;
    }
    /**
     * @param nuevoVehiculo
     */
    public void addVehiculo(Vehiculo nuevoVehiculo) {
        vehiculos.add(nuevoVehiculo);
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
            System.out.print("Intento de añadir secretaria ");
            viejoArreglo=(E[]) this.secretarias;
            nuevoArreglo=(E[]) new Secretaria[this.secretarias.length+1];
}
        if(elemento instanceof Vehiculo){
            addVehiculo((Vehiculo)elemento);
        }
        else if(elemento instanceof Trabajador){
            addTrabajador((Trabajador)elemento);
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
        
    }


    
    
    public Almacen[] getAlmacenes() {
        return this.almacenes;
    }
}
