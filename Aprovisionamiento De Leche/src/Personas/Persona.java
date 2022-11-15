package Personas;

public class Persona {

    private String Nombre;
    private int CI;
    private String Apellidos;
    
    public Persona(String nombre, String apellidos, int CI){
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

    public int getCI() {
        return this.CI;
    }

    /**
     * 
     * @param CI
     */
    public void setCI(int CI) {
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