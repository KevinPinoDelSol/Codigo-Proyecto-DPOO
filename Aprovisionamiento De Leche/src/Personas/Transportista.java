package Personas;

import Vehiculos.*;
import DocumentacionEmpresa.*;
import Edificios.*;
import Interfaces.*;
import Excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Transportista extends Usuario implements RecepcionDeLeche {

    private Vehiculo VehiculoAsignado;
    private HojaRuta RutaAsignada;

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param entrada
     * @param empresa
     * @param contrasenna
     */
    public Transportista(String nombre, int CI, String apellidos, String entrada, EmpresaAcopio empresa, String contrasenna,Vehiculo VehiculoAsignado,HojaRuta RutaAsignada) {
        super(nombre,apellidos,CI,entrada,empresa,contrasenna);
        this.VehiculoAsignado=VehiculoAsignado;
        this.RutaAsignada=RutaAsignada;
        
    }

    public void estadotransportita(int pos){
      this.RutaAsignada.setGanaderoActual(pos);
    }
    
    @Override
    public void ControlDeCalidad(boolean calidad,int litros) throws EspacioInsuficienteEnElCamionExcepcion {
        if (litros<((CamionCisterna)VehiculoAsignado).getCapacidadMaximaLitros()-((CamionCisterna)VehiculoAsignado).getContenidoActualLitros()){
            
            if (calidad) {
                RecibirLeche(litros);
            }
            else{
                RechazarLeche(litros);
            }
        }
        else{
            throw new EspacioInsuficienteEnElCamionExcepcion();
        }
    }

    @Override
    public void RechazarLeche(int  litros) {
        this.RutaAsignada.setGanaderosVisitados(this.RutaAsignada.getGanaderoActual());
        RegistroDeRechazo nuevoRegistro=new RegistroDeRechazo(null, null,litros, RutaAsignada.getGanaderoInPos(RutaAsignada.getGanaderoActual()), this, getEmpresaAsignada());
        try {
            this.getEmpresaAsignada().addElement(nuevoRegistro);
        } catch (Exception ex) {
            Logger.getLogger(Transportista.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void RecibirLeche(int litros) {
        this.RutaAsignada.setGanaderosVisitados(this.RutaAsignada.getGanaderoActual());
        ((CamionCisterna)VehiculoAsignado).CargarLeche(litros);
        RegistroDeEntrada nuevoRegistro=new RegistroDeEntrada(null, null, litros, (Trabajador)RutaAsignada.getGanaderoInPos(RutaAsignada.getGanaderoActual()),(Trabajador) this, this.getEmpresaAsignada());
        try {
            this.getEmpresaAsignada().addElement(nuevoRegistro);
        } catch (Exception ex) {
            Logger.getLogger(Transportista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}