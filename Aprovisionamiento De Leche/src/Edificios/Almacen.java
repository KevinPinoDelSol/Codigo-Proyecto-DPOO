package Edificios;

public class Almacen {

    private Silo[] silos;
    private int id;

    /**
     * 
     * @param id
     */
    public Almacen(int id) {
        // TODO - implement Almacen.Almacen
        throw new UnsupportedOperationException();
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