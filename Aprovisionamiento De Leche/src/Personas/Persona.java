package Personas;

public class Persona {

    private String Nombre;
    private long CI;
    private String Apellidos;
    
    public Persona(){}
    public Persona(String nombre, String apellidos, long CI){
        this.Nombre=nombre;
        this.Apellidos=apellidos;
        this.CI=CI;
    }

    public String getNombre() {
        return this.Nombre;
    }

    /**
     * 
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre=Nombre;
    }

    public long getCI() {
        return this.CI;
    }

    /**
     * 
     * @param CI
     */
    public void setCI(long CI) {
        this.CI=CI;
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    /**
     * 
     * @param Apellidos
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos=Apellidos;
    }

}