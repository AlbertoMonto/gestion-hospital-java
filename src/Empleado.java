
/**
 * Write a description of class Empleados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado extends Persona
{
    // instance variables - replace the example below with your own
    private String ocupacion;
    private String especialidad;
    private String turno;
    /**
     * Constructor for objects of class Empleados
     */
    public Empleado(String dni,String nombre, int telefono, String puesto, String ocupacion, String especialidad,String turno)
    {
        // initialise instance variables
        super(dni,nombre,telefono,puesto);
        this.ocupacion= ocupacion;
        this.especialidad= especialidad;
        this.turno=turno;
    }
    
    public String getOcupacion()
    {
        // put your code here
        return ocupacion;
    }
    
     public void setOcupacion(String ocupacion)
    {
        // put your code here
        this.ocupacion = ocupacion;
    }
    
     public void setEspecialidad(String especialidad)
    {
        // put your code here
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad()
    {
        // put your code here
        return especialidad;
    }
    
     public void setTurno(String turno)
    {
        // put your code here
        this.turno = turno;
    }
    
    public String getTurno()
    {
        // put your code here
        return turno;
    }
    
    
    public String toString() {
        return "Empleado{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", telefono=" + getTelefono() +
                ", puesto='" + getPuesto() + '\'' +
                ", ocupacion=" + ocupacion +
                ", especialidad=" + especialidad +
                ", turno=" + turno +
                '}';
    }
}


   
