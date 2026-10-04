import java.util.ArrayList;

/**
 * Write a description of class UnidadEspecializada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnidadEspecializada extends Unidad {
    private static ArrayList<Persona> listaUnidadEspecializada = new ArrayList<>();

    public UnidadEspecializada() {
        
    }

    // Método para agregar una persona a la lista de unidad especializada
    public static void agregarPersona(Persona persona) {
        listaUnidadEspecializada.add(persona);
        System.out.println("Persona agregada a la lista de UnidadEspecializada: " + persona);
    }
}
