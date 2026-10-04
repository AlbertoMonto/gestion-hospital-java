import java.util.ArrayList;

/**
 * Write a description of class Consultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultaExterna extends Unidad {
    private static ArrayList<Persona> listaConsultaExterna= new ArrayList<>(); 

    public ConsultaExterna() {
        
    }

    // Método para agregar una persona a la lista de consultas externas
    public static void agregarPersona(Persona persona) {
        listaConsultaExterna.add(persona);
        System.out.println("Persona agregada a la lista de consultas externas: " + persona.getNombre());
    }
}
