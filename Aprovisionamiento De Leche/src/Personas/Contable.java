package Personas;

import DocumentacionEmpresa.*;
import Edificios.*;

public class Contable extends Usuario {

    /**
     *Realiza la emision de un Cheque a un Registro de entrada.
     * @param registroEntrada
     * registro que se va a pagar.
     * @param precioUnitario
     * precio al que se pretende pagar el litro de leche
     * @throws RegistroDeEntradaYaPagadoExcepcion
     * Si ya el registro se pago pero el metodo fue llamado.
     */
    public void PagarGanadero(RegistroDeEntrada registroEntrada, double precioUnitario) throws RegistroDeEntradaYaPagadoExcepcion {
        if(registroEntrada.isPagado()==false)throw new RegistroDeEntradaYaPagadoExcepcion();
        Cheque nuevoCheque=new Cheque(registroEntrada, precioUnitario);
        this.getEmpresaAsignada().addElement(nuevoCheque);
    }

    /**
     * 
     * @param nombre
     * @param CI
     * @param apellidos
     * @param fechaDeEntrada
     * @param empresa
     * @param contrasenna
     */
    public Contable(String nombre, int CI, String apellidos, String fechaDeEntrada, EmpresaAcopio empresa, String contrasenna) {
        super( nombre,  apellidos,  CI,  fechaDeEntrada,  empresa, contrasenna);

    }

}