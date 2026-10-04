import java.util.ArrayList;

/**
 * Write a description of class Consultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Consulta extends Unidad {
    private static ArrayList<Persona> listaConsulta = new ArrayList<>();

    public Consulta() {
        
    }

    // Método para agregar una persona a la lista de consultas
    public static void agregarPersona(Persona persona) {
        listaConsulta.add(persona);
        System.out.println("Persona agregada a la lista de consultas: " + persona);
    }
}
