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
    
    // <editor-fold defaultstate="collapsed" desc="Atributos">               
    private String nombre;
    private Ganadero[] ganaderos;
    private Transportista[] transportistas;
    private AdministradorAcopio[] administradores;
    private Contable[] contables;
    private Secretaria[] secretarias;
    private ArrayList<Almacen> almacenes;
    private ArrayList<Silo> silos;
    private ArrayList<RegistroDeRechazo> registroRechazo;
    private ArrayList<RegistroDeEntrada> registroEntrada;
    private ArrayList<Cheque> cheque;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Trabajador> trabajadores;// </editor-fold>

    
     // <editor-fold defaultstate="collapsed" desc="Metodos de la misma empresa">               
    public EmpresaAcopio(String nombre) {
        this.nombre=nombre;
        this.administradores=new AdministradorAcopio[0];
        this.secretarias=new Secretaria[0];
        this.transportistas=new Transportista[0];
        this.contables=new Contable[0];
        this.ganaderos=new Ganadero[0];
        this.trabajadores=new ArrayList<>();
        
        this.registroEntrada=new  ArrayList<RegistroDeEntrada>();
        this.registroRechazo=new  ArrayList<RegistroDeRechazo>();
        this.cheque=new  ArrayList<Cheque>();
        
        this.vehiculos=new ArrayList<>();
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //</editor-fold>

    
     // <editor-fold defaultstate="collapsed" desc="Metodos para trabajadores">               
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

    public void deleteTrabajador(Long CI) throws TrabajadorNoEncontradoExcepcion{
        
        int posicion=-1;
        boolean inexistente=true;
        
        for(int i=0; i<this.trabajadores.size() && inexistente;i++){
            if(trabajadores.get(i).getCI()==CI){
                posicion=i;
                inexistente=false;
            }
        }
        
        if(inexistente)  throw new TrabajadorNoEncontradoExcepcion();
        
        else{
            trabajadores.remove(posicion);
        }
    }
    //</editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Metodos para Documentacion de empresa">               
    public RegistroDeRechazo[] getRegistroRechazo() {
            RegistroDeRechazo[] registros = new RegistroDeRechazo[registroRechazo.size()];
            for(int i=0 ; i< registroRechazo.size() ; i++){
                registros[i]=registroRechazo.get(i);
            }
            return registros;
    }

    public RegistroDeEntrada[] getRegistroEntrada() {
        RegistroDeEntrada[] registros = new RegistroDeEntrada[registroRechazo.size()];
            for(int i=0 ; i< registroEntrada.size() ; i++){
                registros[i]=registroEntrada.get(i);
            }
            return registros;
    }

    public Cheque[] getCheque() {
        Cheque[] registros = new Cheque[registroRechazo.size()];
            for(int i=0 ; i< cheque.size() ; i++){
                registros[i]=cheque.get(i);
            }
            return registros;
    }
    //</editor-fold>
    
    
    // <editor-fold defaultstate="collapsed" desc="Metodos de vehiculos">               
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
   // </editor-fold>
    
    
     // <editor-fold defaultstate="collapsed" desc="XD????">               
    
    /**
     * Annade un elemento a los registros de la Empresa.
     * 
     * @param <E>
     * @param elemento
     * @throws Exception 
     *
     */
    public void  addElement (Object elemento) throws Exception{
        if(elemento instanceof Vehiculo){
            addVehiculo((Vehiculo)elemento);
        }
        else if(elemento instanceof Trabajador){
            addTrabajador((Trabajador)elemento);
        }
        else if(elemento instanceof Almacen){
            almacenes.add((Almacen) elemento);
        }
        else if(elemento instanceof Silo){
            silos.add((Silo)elemento);
        }
        else if(elemento instanceof RegistroDeEntrada){
            registroEntrada.add((RegistroDeEntrada)elemento);
        }
        else if(elemento instanceof RegistroDeRechazo){
            registroRechazo.add((RegistroDeRechazo)elemento);
        }
        else if(elemento instanceof Cheque){
            cheque.add((Cheque)elemento);
        }
        else throw new Exception();
        
    }


    
    
    public Almacen[] getAlmacenes() {
            Almacen[] almacenes = new Almacen[registroRechazo.size()];
            for(int i=0 ; i< cheque.size() ; i++){
                almacenes[i] = this.almacenes.get(i);
            }
            return almacenes;
    }

    //</editor-fold>
}
