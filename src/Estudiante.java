
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    // instance variables - replace the example below with your own
    Sanitario sanitario;
    Cita cita;

    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String dni,String nombre, int telefono, String puesto,Sanitario sanitario,Cita cita)
    {
        // initialise instance variables
        super(dni,nombre,telefono,puesto);
        this.sanitario=sanitario;
        this.cita=cita;
        
        
        
    } 
    
    
    public Sanitario getSanitario()
    {
        // put your code here
        return sanitario;
    }
    
     public void setSanitario(Sanitario sanitario)
    {
        // put your code here
        this.sanitario = sanitario;
    } 
    
    public Cita getCita()
    {
        // put your code here
        return cita;
    }
    
     public void setCita(Cita Cita)
    {
        // put your code here
        this.cita = cita;
    } 
    

    
}
