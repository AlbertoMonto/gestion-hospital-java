import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Write a description of class Cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cita {
    private Persona paciente;
    private Persona sanitario;
    private LocalDate fecha;
    private LocalTime hora;
    
    

    public Cita(Persona paciente,Persona sanitario, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.sanitario = sanitario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Persona getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Persona paciente) {
        this.paciente=paciente;
    }
    
    public Persona getSanitario() {
        return sanitario;
    }
    
    public void setSanitario(Persona sanitario) {
        this.sanitario=sanitario;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha=fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
    
    public void setHora(LocalTime hora) {
        this.hora=hora;
    }
    
    
    
    @Override
    public String toString() {
        return "Cita{" +
                "El paciente con DNI='" + paciente.getDni()+
                ",ha concertado una cita el='" + fecha  +
                ", a las '" + hora + 
                ", con el  sanitario'" + sanitario.getNombre()+".}";
                
    }
}