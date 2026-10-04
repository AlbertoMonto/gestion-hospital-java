
/**
 * Write a description of class Sanitario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sanitario extends Empleado
{
    // instance variables - replace the example below with your own
    private String tipo;
    

    /**
     * Constructor for objects of class Sanitario
     */
    public Sanitario(String dni,String nombre,int telefono,String puesto,String ocupacion, String especialidad, String tipo, String turno)
    {
        super(dni,nombre,telefono,puesto,ocupacion,especialidad,turno);
        this.tipo= tipo;
        
    }

    public String getTipo()
    {
        // put your code here
        return tipo;
    }
    
    public void setTipo(String tipo)
    {
        // put your code here
        this.tipo = tipo;
    }
    
    public String toString() {
        return "Empleado{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", telefono=" + getTelefono() +
                ", puesto='" + getPuesto() + '\'' +
                ", ocupacion=" + getOcupacion() +
                ", especialidad=" + getEspecialidad() +
                ", turno=" + getTurno() +
                ", tipo=" + tipo +
                '}';
    }
    
    
    
    
}
