import java.util.ArrayList;

/**
 * Write a description of class Consultas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administracion extends Unidad {
    private static ArrayList<Persona> listaAdministracion = new ArrayList<>();

    public Administracion() {
        
    }

    // Método para agregar una persona a la lista de administracion
    public static void agregarPersona(Persona persona) {
        listaAdministracion.add(persona);
        System.out.println("Persona agregada a la lista de administracion: " + persona);
    }
}
