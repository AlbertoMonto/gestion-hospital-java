import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.*;

/**
 * Write a description of class Menus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Metodos
{   
    
    private Persona persona;
    private Cita cita;
    
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Menus
     */
    public Metodos( )
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void altas(ArrayList<Persona> personas,ArrayList<Cita> citas)
    {
                int opcion = 0;
                while (opcion !=4){
        
        
                System.out.println("----------------------------------------");
                System.out.println("      Menú de alta de usuarios     ");
                System.out.println("----------------------------------------");
                System.out.println("Seleccione que quiere dar de alta");
                System.out.println("1- Empleado");
                System.out.println("2- Estudiante");
                System.out.println("3- Paciente");
                System.out.println("4- Volver al menú principal");
                Scanner scanner = new Scanner(System.in);
                opcion = scanner.nextInt();
                try{
                    
                
                
                
                    switch(opcion){
                        case 1:
                            System.out.println("Alta empleados");
                            altaEmpleados(personas);
                            break;
                        case 2:
                            System.out.println("Alta estudiantes");
                            altaEstudiantes(personas,citas);
                            break;
                        case 3:
                            System.out.println("Alta pacientes");
                            altaPacientes(personas);
                            break;
                        case 4:
                            System.out.println("Volviendo al menu principal");
                            break;
                        default:
                            
                            System.out.println("Opción inválida, Por favor, seleccione una opción válida.");
                            return;
                            
                    
                    }
        }
                catch(InputMismatchException e) {
                            System.out.println("Error: Por favor, ingrese un número entero.");
                            
                        }
        }    
    }
    
    
    
    
    
    //Metodo para dar de alta a empleados
    public static void altaEmpleados(ArrayList<Persona> personas){
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Introduce el tipo de empleado entre los siguientes");
        System.out.println("Elige el numero entre el 1 y el 3");
        System.out.println("1-Enfermeria");
        System.out.println("2-Medicina");
        System.out.println("3-Gerencia");
        
        
        int opcion= scanner.nextInt();
            
        try{
                switch(opcion){
            case 1: 
            scanner.nextLine();
            System.out.println("Introduce el dni del empleado");
            String dn = scanner.nextLine();
            String dni = dn.toUpperCase();
            if (!DNIValido(dni)){
                System.out.println("DNI introducido inválido");
            }else{
            System.out.println("Introduce el nombre del empleado");
            String nombre = scanner.nextLine();
            System.out.println("Introduce el telefono del empleado");
            int telefono = scanner.nextInt();
            
            
            String puesto = "Empleado";
            String turno="";  
                String tipo = "Enfermero";
                String ocupacion = "Sanitario";
                System.out.println("Elige el turno del empleado");
                System.out.println("1-Mañana");
                System.out.println("2-Tarde");
                System.out.println("3-Noche");
                
                int elec= scanner.nextInt();
                
                    switch(elec){
                        case 1:
                            turno= "mañana";
                            break;
                        case 2:
                            turno= "tarde";
                            break;
                        case 3:
                            turno= "noche";
                            break;
                        default:
                            System.out.println("Opción inválida, Por favor, seleccione una opción válida.");
                            return;
                    }
                
                
                
                String especialidad="";
                
                 System.out.println("De que especialidad es?");
                 System.out.println("1-Aparato digestivo");
                 System.out.println("2-Cardiología");
                 System.out.println("3-Cirugía general");
                 System.out.println("4-Dermatología");
                 System.out.println("5-Medicina interna");
                 System.out.println("6-Oncologia");
                 System.out.println("7-Oftalmología");
                 System.out.println("8-Psiquiatría");
                 System.out.println("9-Traumatología");
                 System.out.println("10-Diabetes");
                 System.out.println("11-Enfermedades cardiovasculares");
                 System.out.println("12-Ninguna");
                 System.out.println("Recuerda que si es de la unidad de consultas externas sera de la 1 a la 9");
                 System.out.println("Recuerda que si es de la unidad especializada sera de diabetes o de enfermedades cardiovasculares");
                 scanner.nextLine();
                 opcion = scanner.nextInt();
                    switch(opcion){
                        case 1:
                            especialidad="Aparato digestivo";
                                break;
                        case 2:
                            especialidad="Cardiología";
                                break;
                        case 3:
                            especialidad="Cirugía general";
                                break;
                        case 4:
                            especialidad="Dermatología";
                                break;
                        case 5:
                            especialidad="Medicina interna";
                                break;
                        case 6:
                            especialidad="Oncologia";
                                break;
                        case 7:
                            especialidad="Oftalmología";
                                break;
                        case 8:
                            especialidad="Psiquiatría";
                                break;
                        case 9:
                            especialidad="Traumatología";
                                break;
                        case 10: 
                            especialidad="Diabetes";
                        case 11: 
                            especialidad="Enfermedades cardiovasculares";
                                break;
                        case 12: 
                            especialidad="Enfermedades cardiovasculares";
                                break;
                        default:
                            System.out.println("Ingrese un numero válido");
                    }
                
                Persona nuevaPersona = new Enfermero(dni,nombre, telefono, puesto, ocupacion, especialidad, tipo,turno);
                personas.add(nuevaPersona);
                System.out.println("A que unidad la quieres agregar?");
                System.out.println("1-Unidad Especializada");
                System.out.println("2-Consultas");
                System.out.println("3-Consultas Externas");
                System.out.println("4-Urgencias");
                
                
                int caso = scanner.nextInt();
                
                    switch (caso) {
                        case 1:
                            Consulta.agregarPersona(nuevaPersona);
                            break;
                        case 2:
                            UnidadEspecializada.agregarPersona(nuevaPersona);
                            break;
                        case 3:
                            ConsultaExterna.agregarPersona(nuevaPersona);
                            break;
                        case 4:
                            Urgencias.agregarPersona(nuevaPersona);
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida (1, 2 o 3).");
                            return; // Salir del método si la opción no es válida
                    
                    }
                 new Agenda(nuevaPersona);
                 
                }      
                break;
            
            //FIN ENFERMERO    
                
            case 2:
                
                
                scanner.nextLine();
                System.out.println("Introduce el dni del empleado");
                dn = scanner.nextLine();
                dni = dn.toUpperCase();
                if (!DNIValido(dni)){
                System.out.println("DNI introducido inválido");
                }else{
                System.out.println("Introduce el nombre del empleado");
                String nombre = scanner.nextLine();
                System.out.println("Introduce el telefono del empleado");
                int telefono = scanner.nextInt();
                
            
                String puesto = "Empleado";
                String turno="";   
                String tipo = "Medico";
                String ocupacion = "Sanitario";
                System.out.println("Elige el turno del empleado");
                System.out.println("1-Mañana");
                System.out.println("2-Tarde");
                System.out.println("3-Noche");
                int elec= scanner.nextInt();
                
                    switch(elec){
                        case 1:
                            turno= "mañana";
                            break;
                        case 2:
                            turno= "tarde";
                            break;
                        case 3:
                            turno= "noche";
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida (1, 2 o 3).");
                            return; // Salir del método si la opción no es válida
                    }
                 String especialidad = "";
                 System.out.println("De que especialidad es?");
                 System.out.println("1-Aparato digestivo");
                 System.out.println("2-Cardiología");
                 System.out.println("3-Cirugía general");
                 System.out.println("4-Dermatología");
                 System.out.println("5-Medicina interna");
                 System.out.println("6-Oncologia");
                 System.out.println("7-Oftalmología");
                 System.out.println("8-Psiquiatría");
                 System.out.println("9-Traumatología");
                 System.out.println("10-Diabetes");
                 System.out.println("11-Enfermedades cardiovasculares");
                 System.out.println("12-Ninguna");
                 System.out.println("Recuerda que si es de la unidad de consultas externas sera de la 1 a la 9");
                 System.out.println("Recuerda que si es de la unidad especializada sera de diabetes o de enfermedades cardiovasculares");
                 scanner.nextLine();
                 opcion = scanner.nextInt();
                    switch(opcion){
                        case 1:
                            especialidad="Aparato digestivo";
                                break;
                        case 2:
                            especialidad="Cardiología";
                                break;
                        case 3:
                            especialidad="Cirugía general";
                                break;
                        case 4:
                            especialidad="Dermatología";
                                break;
                        case 5:
                            especialidad="Medicina interna";
                                break;
                        case 6:
                            especialidad="Oncologia";
                                break;
                        case 7:
                            especialidad="Oftalmología";
                                break;
                        case 8:
                            especialidad="Psiquiatría";
                                break;
                        case 9:
                            especialidad="Traumatología";
                                break;
                        case 10: 
                            especialidad="Diabetes";
                        case 11: 
                            especialidad="Enfermedades cardiovasculares";
                                break;
                        case 12: 
                            especialidad="Enfermedades cardiovasculares";
                                break;
                        default:
                            System.out.println("Ingrese un numero válido");
                    }
                 Persona nuevaPersona = new Medico(dni,nombre, telefono, puesto, ocupacion, especialidad, tipo, turno);
                personas.add(nuevaPersona); 
                 System.out.println("A que unidad la quieres agregar?");
                 System.out.println("1-Unidad Especializada");
                 System.out.println("2-Consultas"); 
                 System.out.println("3-Consultas Externas");
                 System.out.println("4-Urgencias");
                
                int caso = scanner.nextInt();
                
                    switch (caso) {
                        case 1:
                            Consulta.agregarPersona(nuevaPersona);
                            break;
                        case 2:
                            UnidadEspecializada.agregarPersona(nuevaPersona);
                            break;
                        case 3:
                            ConsultaExterna.agregarPersona(nuevaPersona);
                            break;
                        case 4:
                            Urgencias.agregarPersona(nuevaPersona);
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida (1, 2 o 3).");
                            return; // Salir del método si la opción no es válida
                        
                                } 
                   
                    new Agenda(nuevaPersona);
                }
                                break;     
                             
                    
               
            //FIN MEDICO    
                
            case 3:
                
                
                scanner.nextLine();
                System.out.println("Introduce el dni del empleado");
                dn = scanner.nextLine();
                dni = dn.toUpperCase();
                if (!DNIValido(dni)){
                System.out.println("DNI introducido inválido");
                    }else{
                System.out.println("Introduce el nombre del empleado");
                String nombre = scanner.nextLine();
                System.out.println("Introduce el telefono del empleado");
                int telefono = scanner.nextInt();
                
                
                String puesto = "Empleado";
                String turno="";   
                String ocupacion = "Gerencia";
                 
                 System.out.println("Selecciona el servicio del empleado");
                 System.out.println("1-Dirección");
                 System.out.println("2-Documentación clínica y archivo");
                 System.out.println("3-Contabilidad y facturación");
                 System.out.println("4-Recursos humanos");
                 System.out.println("5-Mantenimiento");
                 System.out.println("6-Limpieza y seguridad");
                 String especialidad="";
                 
                 int numero =scanner.nextInt();;
                 switch (numero) {
                        case 1:
                            especialidad= "direccion";
                            break;
                        case 2:
                            especialidad= "Documentacion clinica y archivo";
                            break;
                        case 3:
                            especialidad= "Contabilidad y facturacion";
                            break;
                        case 4:
                            especialidad= "Recursos humanos";
                            break;
                        case 5:
                            especialidad= "Mantenimiento";
                            break;
                        case 6:
                            especialidad= "Limpieza y facturacion";
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida (1, 2 o 3).");
                            return; // Salir del método si la opción no es válida
                    
                    }
                    System.out.println("Ingrese la lista de tareas que va a realizar el empleado");
                    scanner.nextLine();
                    String lista= scanner.nextLine();
                    System.out.println("Elige el turno del empleado");
                    System.out.println("1-Mañana");
                    System.out.println("2-Tarde");
                    int elec= scanner.nextInt();
                    
                    switch(elec){
                        case 1:
                            turno= "mañana";
                            break;
                        case 2:
                            turno= "tarde";
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, selecciona una opción válida (1 o 2 ).");
                            return;
                    }
                 
                 Persona nuevaPersona = new Gerencia(dni,nombre, telefono, puesto, ocupacion, especialidad,turno,lista);
                 personas.add(nuevaPersona);
                 Administracion.agregarPersona(nuevaPersona);
                }
                 break;
  
                 default:
                            
                 System.out.println("Opción inválida, Por favor, seleccione una opción válida.");
                 break;
                 
    }
        }catch(InputMismatchException e) {
                            System.out.println("Error: Por favor, ingrese un número entero.");
                            
                        }

                    
}

    //Metodo para dar de alta a estudiantes
    public static void altaEstudiantes(ArrayList<Persona> personas, ArrayList<Cita> citas){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el dni del estudiante");
        String dn = scanner.nextLine();
        String dni = dn.toUpperCase();
        if (!DNIValido(dni)){
                System.out.println("DNI introducido inválido");
            }else{
        System.out.println("Ingresa el nombre y apellidos del paciente");
        String nombre= scanner.nextLine();
        System.out.println("Ingresa el telefono del estudiante");
        int telefono= scanner.nextInt();
        String puesto = "estudiante";
        Estudiante nuevaPersona = new Estudiante(dni,nombre,telefono,puesto,null,null); 
        System.out.println("Elija entre asignarle a un sanitario o a una cita ya agendada");
        System.out.println("1-Cita");
        System.out.println("2-Medico o enfermero");
        int opcion = scanner.nextInt();
        boolean salir=false;
        while(!salir){
        switch(opcion){
            case 1: 
                System.out.println("Elija una de las siguientes citas");
                Agenda.mostrarCitas(citas);
                System.out.println("Ingrese el número de la cita que desea asignar:");
                int numCita = scanner.nextInt();

                // Verificar si el número de cita ingresado es válido
                if (numCita > 0 && numCita <= citas.size()) {
                    // Obtener la cita seleccionada
                    Cita citaSeleccionada = citas.get(numCita - 1);

                    // Asignar la cita al estudiante
                    nuevaPersona.setCita(citaSeleccionada);
                    System.out.println("Cita asignada al estudiante correctamente.");
                } else {
                    System.out.println("Número de cita inválido. No se pudo asignar la cita.");
                }
                
                salir = true;
                break;
            
            case 2:
                System.out.println("Elija entre los siguientes sanitarios introduciendo su dni.");
                System.out.println("Recuerda que los estudiantes solo pueden tener clases por la mañana o por la tarde, elija un sanitario de uno de estos turnos.");
                Hospital.listarSanitarios();
                scanner.nextLine();
                dni = scanner.nextLine();
                Persona sanitario=Hospital.buscarporDni(dni);
                if (sanitario != null && sanitario instanceof Sanitario) {
                    // Asignar el sanitario al estudiante
                    nuevaPersona.setSanitario((Sanitario) sanitario);
                    System.out.println("Sanitario asignado al estudiante correctamente.");
                } else {
                    System.out.println("No se encontró ningún sanitario con el DNI proporcionado.");
                }
                salir = true;
                break;
            default:
                            
                System.out.println("Opción inválida, Por favor, seleccione una opción válida.");
            }
                 break;
        }
        personas.add(nuevaPersona);
        Formacion.agregarPersona(nuevaPersona);
    }
    }
    //Metodo para dar de alta a pacientes
    public static void altaPacientes(ArrayList<Persona> personas){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el dni del paciente");
        String dn = scanner.nextLine();
        String dni = dn.toUpperCase();
        if (!DNIValido(dni)){
                System.out.println("DNI introducido inválido");
            }else{
        System.out.println("Ingresa el nombre y apellidos del paciente");
        String nombre= scanner.nextLine();
        System.out.println("Ingresa el telefono del paciente");
        int telefono= scanner.nextInt();
        String puesto = "paciente";
        System.out.println("Ingrese el expediente del paciente");
        scanner.nextLine();
        String expediente= scanner.nextLine();
        boolean ingresado = false;
        Persona nuevaPersona= new Paciente(dni,nombre, telefono, puesto, expediente, ingresado);
        personas.add(nuevaPersona);
        }
    }
    
    //Metodo para asignar las citas de un paciente a un sanitario
    public void asignarCitas(ArrayList<Cita> citas) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("      Menú de asignación de citas a pacientes     ");
        System.out.println("----------------------------------------");
        System.out.println("Tenga en cuenta las necesidades del paciente y la especialidad del sanitario para su eleccion");
        System.out.println("Ingrese el dni del paciente");
        String dni = scanner.nextLine();
        Persona paciente;
        paciente = Hospital.buscarporDni(dni);
        if (paciente == null) {
            System.out.println("Paciente no encontrado.");
            return;
        }
        
        System.out.println("Ingrese el año de la cita (minimo 2024):");
        
        int ano = scanner.nextInt();
        if(ano<2024){
            System.out.println("Año no válido");
        }else{
        System.out.println("Ingrese el mes de la cita (ej. 5 para mayo):");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el día de la cita (ej. 3):");
        int dia = scanner.nextInt();

        System.out.println("Ingrese la hora de la cita (0 a 23):");
        int hora = scanner.nextInt();

        System.out.println("Ingrese los minutos de la cita (0, 15, 30, 45):");
        int minutos = scanner.nextInt();

        // Validar que los minutos ingresados sean válidos (0, 15, 30, 45)
        if (minutos != 0 && minutos != 15 && minutos != 30 && minutos != 45) {
            System.out.println("Error: Los minutos deben ser 0, 15, 30 o 45.");
            return; // Salir del método si los minutos son inválidos
        }

        // Crear LocalDate para la fecha de la cita
        LocalDate fechaCita = LocalDate.of(ano, mes, dia);

        // Crear LocalTime para la hora de la cita
        LocalTime horaCita = LocalTime.of(hora, minutos);
        
        System.out.println("Ingrese el dni entre los sanitarios disponibles");
        Hospital.listarSanitarios();
        scanner.nextLine();
        dni= scanner.nextLine();
        Persona sanitario;
        sanitario = Hospital.buscarporDni(dni);
            if (existeCita(sanitario,fechaCita,horaCita,citas)){
              System.out.println("Ya hay una cita agendada para este sanitario a esta hora");  
            }else{
                Cita nuevaCita =new Cita(paciente,sanitario,fechaCita,horaCita);
                citas.add(nuevaCita);
                // Formatear fecha y hora para mostrar en el mensaje
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String fechaFormateada = fechaCita.format(formatter);
                String horaFormateada = horaCita.format(DateTimeFormatter.ofPattern("HH:mm"));
                
        
                System.out.println("La cita se ha programado para el " + fechaFormateada + " a las " + horaFormateada);
        
                
            }    
        }
    }
    //Metodo para comprobar si existe una cita y asi no crear 2 citas a la misma hora
    private static boolean existeCita(Persona sanitario, LocalDate fecha, LocalTime hora, ArrayList<Cita> citas) {
        for (Cita cita : citas) {
            if (cita.getSanitario().equals(sanitario) && cita.getFecha().equals(fecha) && cita.getHora().equals(hora)) {
                return true; // Hay una cita existente para el sanitario en la misma fecha y hora
            }
        }
        return false; // No hay citas existentes para el sanitario en la misma fecha y hora
    }
    //Metodo para comprobar que un dni tiene 8 numeros y una letra
    public static boolean DNIValido(String dni) {
        // Expresión regular para validar un DNI
        String regex = "^\\d{8}[A-Za-z]$";  // Patrón: 8 dígitos seguidos de una letra

        // Compilar la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Crear un objeto Matcher para el string dado
        Matcher matcher = pattern.matcher(dni);
        
        // Comprobar si el string coincide con el patrón
        return matcher.matches();
    }
}
