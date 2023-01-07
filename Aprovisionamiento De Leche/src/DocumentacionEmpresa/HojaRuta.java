package DocumentacionEmpresa;

import Personas.*;
import java.io.Serializable;

public class HojaRuta implements Serializable {

    private final Ganadero[] ganaderos;
    private int ganaderoActual;
    
    private boolean ganaderosVisitados[];

    public boolean[] getGanaderosVisitados() {
        return ganaderosVisitados;
    }

    public void setGanaderosVisitados(int pos) {
        this.ganaderosVisitados[pos] = true;
    }
 

    public int getGanaderoActual() {
        return ganaderoActual;
    }

    public void setGanaderoActual(int ganaderoActual) {
        this.ganaderoActual = ganaderoActual;
    }
    /**
     * 
     * @param ganaderos
     */
    public HojaRuta(Ganadero[] ganaderos) {
        this.ganaderos=ganaderos;
        this.ganaderoActual=-1;
        this.ganaderosVisitados=new boolean[ganaderos.length];
    }
    public Ganadero getGanaderoInPos(int pos){
        return ganaderos[pos];
    }

}