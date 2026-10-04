import java.util.ArrayList;

/**
 * Write a description of class Consultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formacion extends Unidad {
    private static ArrayList<Persona> listaFormacion = new ArrayList<>();

    public Formacion() {
        
    }

    // Método para agregar una persona a la lista de urgencias
    public static void agregarPersona(Persona persona) {
        listaFormacion.add(persona);
        System.out.println("Estudiante agregado a la lista de formacion: " + persona);
    }
}

