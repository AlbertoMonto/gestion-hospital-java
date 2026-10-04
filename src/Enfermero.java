

/**
 * Write a description of class Enfermeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enfermero extends Sanitario 
{
    // instance variables - replace the example below with your own
  

    /**
     * Constructor for objects of class Enfermeria
     */
    public Enfermero(String dni,String nombre,int telefono,String puesto,String ocupacion, String especialidad, String tipo, String turno)
    {
        super(dni,nombre,telefono,puesto,ocupacion,especialidad,tipo,turno);
    }

    
    public String toString() {
        return "Enfermero{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", telefono=" + getTelefono() +
                ", puesto='" + getPuesto() + '\'' +
                ", ocupacion=" + getOcupacion() +
                ", especialidad=" + getEspecialidad() +
                ", turno=" + getTurno() +
                ", tipo=" + getTipo() +
                
                '}';
    }
    
}
