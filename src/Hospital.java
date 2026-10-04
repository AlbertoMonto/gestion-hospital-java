import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital 
{
    //se inicializan los arraylist para guardar la informacion
    private static ArrayList<Persona> personas = new ArrayList<>();
    private static ArrayList<Cita> citas =new ArrayList<>();
    private static ArrayList<Paciente> habitaciones = new ArrayList<>(91);
        
    
    
    
    /**
     * Constructor for objects of class Hospital
     */
    public Hospital()
    {
        
    }

    //Método para la inicialización del programa
    public static void main(String[] args) 
    {
        //Instacio la clase de métodos para usar sus métodos propios
        Metodos metodos = new Metodos();
        //Inicializo el arraylist de las habitaciones
        for (int i = 0; i < 91; i++) {
            habitaciones.add(null);
        }
        
        int opcion = 0;
        
            while (opcion !=8){
                try{
                
                //Menu principal de la aplicación con la que esta se inicia
                System.out.println("-------------------------");
                System.out.println("      Menú principal     ");
                System.out.println("-------------------------");
                System.out.println("1: Alta personas");
                System.out.println("2: Citas");
                System.out.println("3: Alta y bajas ingresos");
                System.out.println("4: Expedientes");
                System.out.println("5: Busquedas");
                System.out.println("6: Calendario");
                System.out.println("7: Cargar datos");
                System.out.println("8: Salir");
                Scanner scanner = new Scanner(System.in);
                opcion = scanner.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("Alta personas");
                            metodos.altas(personas,citas);
                            break;
                        case 2:
                            System.out.println("Abriendo el menú de citas");
                            metodos.asignarCitas(citas);
                            break;
                        case 3:
                            System.out.println("La lista de habitaciones libres es la siguiente");
                            listarHabitaciones();
                            System.out.println("Quiere ingresar o dar el alta a un paciente ingresado?");
                            System.out.println("1-Ingreso");
                            System.out.println("2-Alta");
                            int eleccion=scanner.nextInt();
                            System.out.println("Ingrese el dni del paciente");
                            scanner.nextLine();
                            String dni=scanner.nextLine();
                            
                            Paciente pacienteIngresar = buscarPacientePorDni(dni);
                            
                            
                                switch(eleccion){
                                    case 1:
                                        if(pacienteIngresar.getIngresado()){
                                           System.out.println("El paciente ya esta ingresado"); 
                                        }
                                        else{
                                            System.out.println("Seleccione una de las habitaciones libres, a la que el paciente va a ingresar"); 
                                            int habitacion = scanner.nextInt();
                                                if(habitacion >0 && habitacion < 91 && habitaciones.get(habitacion) == null){
                                            habitaciones.add(habitacion, pacienteIngresar);
                                            pacienteIngresar.setIngresado(true);
                                            System.out.println("Paciente ingresado con exito"); 
                                        }
                                        else{
                                            System.out.println("Habitación no válida ingresada"); 
                                        }
                                        }
                                            
                                        break;
                                    case 2:
                                        if(!pacienteIngresar.getIngresado()){
                                           System.out.println("El paciente no esta ingresado"); 
                                        }
                                        else{
                                           habitaciones.remove(pacienteIngresar);
                                           System.out.println("Alta efectuada con exito"); 
                                            
                                            
                                        }
                                    
                                        break;
                                    default:
                                    
                                    break;
                                }
                            break;
                        case 4:
                            System.out.println("Inserte el dni de un paciente para mostrar su expediente");
                            scanner.nextLine();
                            dni =scanner.nextLine();
                            
                            verExpediente(dni);
                            System.out.println("Ahora introduzca lo que va a añadir al expediente");
                            String actualizar = scanner.nextLine();
                            actualizarExpediente(dni,actualizar);
                            
                            break;
                        case 5:
                            System.out.println("Busquedas");
                            System.out.println("Inserte el DNI de la persona a buscar");
                            scanner.nextLine();
                            dni = scanner.nextLine();
                            Persona Encontrada = buscarporDni(dni);
                                                    if (Encontrada != null) {
                                System.out.println("Persona encontrada:");
                                System.out.println(Encontrada.toString()); // Imprimir la persona utilizando toString()
                            } else {
                                System.out.println("Persona no encontrada para el DNI proporcionado.");
                            }


                            
                          
                            break;
                        case 6:
                            System.out.println("Calendarios");
                            scanner.nextLine();
                            System.out.println("Inserta el DNI del empleado a mostrar");
                            dni = scanner.nextLine();
                            System.out.println("Quieres ver o editar el calendario de este sanitario?");
                            System.out.println("1-Ver");
                            System.out.println("2-Ver y editar");
                            opcion = scanner.nextInt();
                            Persona personaEncontrada =buscarporDni(dni);
                            Agenda.mostrarCitasPorSanitario(personaEncontrada,citas);
                            if(opcion==1){
                               System.out.println(""); 
                            }else if(opcion==2){
                                System.out.println("Ingrese el numero de la ita que quiere ingresar"); 
                                int indice=scanner.nextInt();
                               Agenda.editarCita(indice,citas);
                            }else{
                                System.out.println("Inserta un numero valido");
                            }
                        
                            
                            
                            
                        case 7:
                            System.out.println("Cargando datos");
                            Datos.ingresarDatos(personas,citas,habitaciones);
                            break;
                        case 8:
                            System.out.println("Saliendo de la aplicacion");
                            break;
                        default:
                            
                            System.out.println("Opción inválida, Por favor, seleccione una opción válida.");
                            break;
                            
                    
                    }
        }
                catch(InputMismatchException e) {
                            System.out.println("Error: Por favor, ingrese un número entero.");
                            
                        }
        }    
        
    }
    
    //Metodo para buscar a una persona del sistema filtrando por su dni
    public static Persona buscarporDni(String dni){
        
            if (personas == null) {
                System.out.println("No se ha inicializado el arraylist");
            return null; // Retorna null si la lista de personas no está inicializada
        }

        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                return persona; // Retorna la persona si encuentra el DNI
            }
        }

        return null; // Retorna null si no encuentra ninguna persona con ese DNI
    }
    //Metodo para buscar a un paciente del sistema filtrando por su dni
    public static Paciente buscarPacientePorDni(String dni) {
        for (Persona persona : personas) {
            if (persona instanceof Paciente && persona.getDni().equals(dni)) {
                return (Paciente) persona; // Si es un paciente y el DNI coincide, devuelve el paciente
            }
        }
        return null; // Si no se encuentra ningún paciente con ese DNI, devuelve null
    }
    
   
    //Metodo para listar las habitaciones libres y ocupadas del hospital
    public static void listarHabitaciones() {
        System.out.println("Habitaciones libres:");
        for (int i = 1; i < habitaciones.size(); i++) {
            if (habitaciones.get(i) == null) {
                System.out.println("Habitación " + i + " está libre");
            } else{
               Paciente imprimir = habitaciones.get(i);
               System.out.println("Habitación " + i + ","+" Nombre:"+ imprimir.getNombre()+", Dni: "+ imprimir.getDni() ); 
            }
            
        }
    }
    //Metodo para listar los sanitarios registrados en el sistema
        public static void listarSanitarios() {
        System.out.println("Lista de Sanitarios:");
        for (Persona persona : personas) {
            if (persona instanceof Sanitario) {
                Sanitario sanitario = (Sanitario) persona; // Hacemos un casting a Sanitario
                System.out.println("Nombre: " + sanitario.getNombre());
                System.out.println("DNI: " + sanitario.getDni());
                System.out.println("Teléfono: " + sanitario.getTelefono());
                System.out.println("Puesto: " + sanitario.getPuesto());
                System.out.println("Ocupación: " + sanitario.getOcupacion());
                System.out.println("Especialidad: " + sanitario.getEspecialidad());
                System.out.println("Turno: " + sanitario.getTurno());
                System.out.println("Tipo: " + sanitario.getTipo());
                System.out.println("--------------------------");
            }
        }
    }
    //Metodo para ver el expediente de un paciente
    public static void verExpediente(String dni) {
                            Paciente buscado =buscarPacientePorDni(dni);
                            System.out.println("Expediente del paciente:"+ buscado.getNombre());
                            System.out.println(buscado.getExpediente());
                            
    }
    //Metodo para actualizar el expediente de un paciente
    public static void actualizarExpediente(String dni, String actualizar) {
                            Paciente buscado =buscarPacientePorDni(dni);
                            System.out.println(buscado.getExpediente());
                            buscado.setExpediente(buscado.getExpediente() + actualizar);
    }

}
