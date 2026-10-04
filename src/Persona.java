
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String dni;
    private String nombre;
    private int telefono;
    private String puesto;
    

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String dni,String nombre, int telefono, String puesto) {
        this.dni=dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
    }

    
    public String getDni()
    {
        // put your code here
        return dni;
    }
    
     public void setDni(String dni)
    {
        // put your code here
        this.dni = dni;
    } 
    
    
     public String getNombre()
    {
        // put your code here
        return nombre;
    }
    
     public void setNombre(String nombre)
    {
        // put your code here
        this.nombre = nombre;
    }
    
    public int getTelefono()
    {
        // put your code here
        return telefono;
    }
    
    public void setTelefono(int telefono)
    {
        // put your code here
        this.telefono = telefono;
    }
    
    public String getPuesto()
    {
        // put your code here
        return puesto;
    }
    
    public void setPuesto(String puesto)
    {
        // put your code here
        this.puesto = puesto;
    }
    
     @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", puesto='" + puesto + '\'' +
                '}';
    }
    

}
