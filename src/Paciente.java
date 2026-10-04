
/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    // instance variables - replace the example below with your own
    String expediente;
    boolean ingresado;
    

    /**
     * Constructor for objects of class Paciente
     */
    public Paciente(String dni,String nombre, int telefono, String puesto, String expediente, boolean ingresado)
    {
        // initialise instance variables
        super(dni,nombre,telefono,puesto);
        this.expediente= expediente;
        this.ingresado = ingresado;
    }
    
    
    public String getExpediente()
    {
        // put your code here
        return expediente;
    }
    
    public void setExpediente(String expediente)
    {
        // put your code here
        this.expediente=expediente;
    }
    public boolean getIngresado()
    {
        // put your code here
        return ingresado;
    }
    
    public void setIngresado(boolean ingresado)
    {
        // put your code here
        this.ingresado=ingresado;
    }

    public String toString() {
        return "Paciente{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", telefono=" + getTelefono() +
                ", puesto='" + getPuesto() + '\'' +
                '}';
    }
    
}
