import java.util.ArrayList;

/**
 * Write a description of class HospitalDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Datos
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class HospitalDemo
     */
    public Datos()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void ingresarDatos(ArrayList<Persona> personas, ArrayList<Cita> citas, ArrayList<Paciente> habitaciones)
    {
        
       
        
        personas.add(new Enfermero("11111111A","María Gonzalez", 693655665, "Empleados", "Sanitario","Enfermedades cardiovasculares","Enfermeria","tarde"));
        personas.add(new Enfermero("22222222B","Pedro Martinez", 693416965, "Empleados", "Sanitario","Aparato digestivo","Enfermeria","tarde"));
        personas.add(new Medico("33333333C","David Gutierrez", 694567890, "Empleados", "Sanitario","Psiquiatria","Medicina","mañana"));
        personas.add(new Medico("44444444D","Enrique Gonzalez", 691235485, "Empleados", "Sanitario","","Medicina","noche"));
        personas.add(new Paciente("55555555E","Carlos Benitez", 123354650, "Paciente", "", false));
        personas.add(new Paciente("66666666F","Elena Fernandez", 333333333, "Paciente", "", false));
        
        
    
                         
               
    }
}
