import java.util.ArrayList;

/**
 * Write a description of class Consultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Urgencias extends Unidad {
    private static ArrayList<Persona> listaUrgencias = new ArrayList<>();

    public Urgencias() {
        
    }

    // Método para agregar una persona a la lista de urgencias
    public static void agregarPersona(Persona persona) {
        listaUrgencias.add(persona);
        System.out.println("Persona agregada a la lista de urgencias: " + persona);
    }
}

