
/**
 * Write a description of class Mecicina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medico extends Sanitario 
{
    

    /**
     * Constructor for objects of class Mecicina
     */
    public Medico(String dni,String nombre,int telefono,String puesto,String ocupacion,String especialidad, String tipo,String turno)
    {
        super(dni,nombre,telefono,puesto,ocupacion,especialidad,tipo,turno);
    }
    
    public String toString() {
        return "Medico{" +
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
