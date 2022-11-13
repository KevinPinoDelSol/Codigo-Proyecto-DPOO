package Personas;

import Edificios.*;
import Vehiculos.*;

public class Secretaria extends Usuario {

    /**
     * 
     * @param nombre
     */
    public void CambiarNombreEmpresa(String nombre) {
        super.getEmpresaAsignada().setNombre(nombre);
    }

    public void EliminarUsuario(int CI) {
        // TODO - implement Secretaria.EliminarUsuario
        throw new UnsupportedOperationException();
    }

    public void RegistrarVehiculoAlSistema(Vehiculo nuevo) throws Exception {
        getEmpresaAsignada().addElement(nuevo);
    }

    public void RegistrarAlmacenAlSistema(Almacen nuevo) throws Exception {
                getEmpresaAsignada().addElement(nuevo);

    }

    public void registrarSiloAlSistema(Silo nuevo, int idAlmacen) throws Exception {
        getEmpresaAsignada().addElement(nuevo);
    }

    /**
     * 
     * @param CI
     */
   // public void GestionarUsuario(int CI) {
     //   Usuario a=getEmpresaAsignada().getUserByCI();
    //}

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param entrada
     * @param empresa
     * @param contrasenna
     */
    public Secretaria(String nombre, int CI, String apellidos, String entrada, EmpresaAcopio empresa, String contrasenna) {
        super( nombre,  apellidos,  CI,  entrada,  empresa, contrasenna);
    }

}