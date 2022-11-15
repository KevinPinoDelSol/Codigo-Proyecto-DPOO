package Interfaces;

import Excepciones.EspacioInsuficienteEnElCamionExcepcion;

public interface RecepcionDeLeche {

    public void ControlDeCalidad(boolean calidad,int litros) throws EspacioInsuficienteEnElCamionExcepcion;

    void RechazarLeche(int litros);

    void RecibirLeche(int litros);

}