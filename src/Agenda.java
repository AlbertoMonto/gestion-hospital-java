import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

/**
 * Write a description of class Agenda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Agenda {
    private Persona persona;
    

    public Agenda(Persona persona) {
        this.persona = persona;
        
    }
    //Metodo para agregar una cita al sistema
    public void agregarCita(Paciente paciente,Sanitario sanitario, LocalDate fecha, LocalTime hora,ArrayList<Cita> citas) {
        if (existeCita(sanitario, fecha, hora, citas)) {
            System.out.println("No se puede agregar la cita. Ya existe una cita para el sanitario en la misma fecha y hora.");
        } else {
        Cita nuevaCita = new Cita(paciente,sanitario, fecha, hora);
        citas.add(nuevaCita);
        System.out.println("Cita agendada para " + fecha + " a las " + hora + " con " + paciente + ".");
        }
    } 
    //Metodo para visualizar las citas existentes en un dia
    public void citasEnFecha(LocalDate fecha, ArrayList<Cita> citas) {
        System.out.println("Citas para el " + fecha + ":");
        boolean encontrada = false;
        for (Cita cita : citas) {
            if (cita.getFecha().equals(fecha)) {
                System.out.println(cita.getHora() + " - " + cita.getPaciente());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No hay citas programadas para el " + fecha + ".");
        }
    }
    //Metodo para visualizar las citas existentes de un sanitario en concreto
    public static void mostrarCitasPorSanitario(Persona persona, ArrayList<Cita> citas) {
        System.out.println("Citas asignadas al sanitario " + persona.getNombre() + ":");
        boolean encontrada = false;
        for (Cita cita : citas) {
            if (cita.getSanitario().equals(persona)) {
                System.out.println("Fecha: " + cita.getFecha() + ", Hora: " + cita.getHora() + ", Paciente: " + cita.getPaciente().getNombre());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No hay citas asignadas a " + persona.getNombre() + ".");
        }
    }
    //Metodo para ver citas    
    public static void mostrarCitas(ArrayList<Cita> citas) {
        if (citas.isEmpty()) {
            System.out.println("No hay citas asignadas.");
            return;
        }

        System.out.println("Lista de citas:");
        for (int i = 0; i < citas.size(); i++) {
            Cita cita = citas.get(i);
            System.out.println("Cita " + (i + 1) + ":");
            System.out.println("Fecha: " + cita.getFecha() + ", Hora: " + cita.getHora() + ", Paciente: " + cita.getPaciente().getNombre());
        }
    }
    //Metodo para editar una cita
    public static void editarCita(int numeroCita, ArrayList<Cita> citas) {
        Scanner scanner = new Scanner(System.in);

        // Verificar si el número de cita está dentro de los límites válidos
        if (numeroCita > 0 && numeroCita <= citas.size()) {
                // Obtener la cita seleccionada
                Cita citaSeleccionada = citas.get(numeroCita - 1);
    
                // Mostrar la información actual de la cita
                System.out.println("Cita seleccionada para editar:");
                System.out.println("Fecha: " + citaSeleccionada.getFecha());
                System.out.println("Hora: " + citaSeleccionada.getHora());
                System.out.println("Paciente: " + citaSeleccionada.getPaciente().getNombre());
                System.out.println("Sanitario: " + citaSeleccionada.getSanitario().getNombre());
                Persona sanitario = citaSeleccionada.getSanitario();
                // Solicitar al usuario que ingrese los nuevos datos para la cita
                System.out.println("Ingrese la nueva fecha (YYYY-MM-DD):");
                String nuevaFechaStr = scanner.nextLine();
                LocalDate nuevaFecha = LocalDate.parse(nuevaFechaStr);
    
                System.out.println("Ingrese la nueva hora (HH:MM):");
                System.out.println("Recuerde que los minutos tienen que ser 00,15,30,45");
                String nuevaHoraStr = scanner.nextLine();
                LocalTime nuevaHora = LocalTime.parse(nuevaHoraStr);
                
                if (existeCita(sanitario, nuevaFecha, nuevaHora, citas)) {
                System.out.println("No se puede agregar la cita. Ya existe una cita para el sanitario en la misma fecha y hora.");
            } else {
                // Actualizar la cita con los nuevos datos
                citaSeleccionada.setFecha(nuevaFecha);
                citaSeleccionada.setHora(nuevaHora);

            System.out.println("Cita editada correctamente.");}
        } else {
            System.out.println("Número de cita inválido. No se pudo editar la cita.");
        }
    }
    
    //Metodo para comprobar si ya existe una cita a la misma hora con el mismo sanitario
    private static boolean existeCita(Persona sanitario, LocalDate fecha, LocalTime hora, ArrayList<Cita> citas) {
        for (Cita cita : citas) {
            if (cita.getSanitario().equals(sanitario) && cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                return true; // Hay una cita existente para el sanitario en la misma fecha y hora
            }
        }
        return false; // No hay citas existentes para el sanitario en la misma fecha y hora
    }
    
    
    
    

    
    
    
}
