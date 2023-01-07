/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocumentacionEmpresa;

import java.io.Serializable;

/**
 *
 * @author Kevin
 */
public class Cheque implements Serializable{
    private RegistroDeEntrada registroCorrespondiente;
    private double precioUnitarioLitro;

    public Cheque(RegistroDeEntrada registroCorrespondiente, double precioUnitarioLitro) {
        this.registroCorrespondiente = registroCorrespondiente;
        this.precioUnitarioLitro = precioUnitarioLitro;
        this.registroCorrespondiente.setPagado(true);
    }

    public RegistroDeEntrada getRegistroCorrespondiente() {
        return registroCorrespondiente;
    }

    public void setRegistroCorrespondiente(RegistroDeEntrada registroCorrespondiente) {
        this.registroCorrespondiente = registroCorrespondiente;
    }

    public double getPrecioUnitarioLitro() {
        return precioUnitarioLitro;
    }

    public void setPrecioUnitarioLitro(double precioUnitarioLitro) {
        this.precioUnitarioLitro = precioUnitarioLitro;
    }
    
    
    public double getPrecioTotal() {
        return precioUnitarioLitro*this.registroCorrespondiente.getCantidadLitros();
    }

}
