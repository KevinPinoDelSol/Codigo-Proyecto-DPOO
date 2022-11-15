package Edificios;

public class Almacen {

    private Silo[] silos;
    private int id;

    /**
     * 
     * @param id
     */
    public Almacen(int id) {
        this.id=id;
        silos=new Silo[0];
    }

    public Silo[] getSilos() {
        return this.silos;
    }

    /**
     * 
     * @param silos
     */
    public void setSilos(Silo[] silos) {
        this.silos = silos;
    }

    public int getId() {
        return this.id;
    }

    /**
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

}