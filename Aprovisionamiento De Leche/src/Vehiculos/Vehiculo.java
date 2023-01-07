package Vehiculos;

import java.io.Serializable;

public class Vehiculo implements Serializable{

    private int id;

    public Vehiculo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString(){
        String clase=this.getClass().toString();
        clase=clase.substring(clase.indexOf(".")+1);
        return clase+"  id:"+this.id;
    }
}