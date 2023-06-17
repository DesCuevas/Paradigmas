/*Ejercicio de laboratorio 6.1.2. Cuevas Romero Desire, Hernández Méndez Gerardo Antonio. 3BV2.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        List<Persona> registros = new ArrayList<>();

        while (opcion != 5) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar Estudiante");
            System.out.println("2. Ingresar Docente");
            System.out.println("3. Ingresar PAAE");
            System.out.println("4. Ver registros");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del estudiante: ");
                    String idEstudiante = scanner.nextLine();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Ingrese el CURP del estudiante: ");
                    String curpEstudiante = scanner.nextLine();
                    System.out.print("Ingrese el domicilio del estudiante: ");
                    String domicilioEstudiante = scanner.nextLine();

                    registros.add(new Estudiante(idEstudiante, nombreEstudiante, curpEstudiante, domicilioEstudiante));
                    break;

                case 2:
                    System.out.print("Ingrese el ID del docente: ");
                    String idDocente = scanner.nextLine();
                    System.out.print("Ingrese el nombre del docente: ");
                    String nombreDocente = scanner.nextLine();
                    System.out.print("Ingrese el CURP del docente: ");
                    String curpDocente = scanner.nextLine();
                    System.out.print("Ingrese el domicilio del docente: ");
                    String domicilioDocente = scanner.nextLine();

                    registros.add(new Docente(idDocente, nombreDocente, curpDocente, domicilioDocente));
                    break;

                case 3:
                    System.out.print("Ingrese el ID del PAAE: ");
                    String idPAAE = scanner.nextLine();
                    System.out.print("Ingrese el nombre del PAAE: ");
                    String nombrePAAE = scanner.nextLine();
                    System.out.print("Ingrese el CURP del PAAE: ");
                    String curpPAAE = scanner.nextLine();
                    System.out.print("Ingrese el domicilio del PAAE: ");
                    String domicilioPAAE = scanner.nextLine();

                    registros.add(new PAAE(idPAAE, nombrePAAE, curpPAAE, domicilioPAAE));
                    break;

                case 4:
                    System.out.println("Registros ingresados:");
                    System.out.println("Estudiantes:");
                    for (Persona persona : registros) {
                        if (persona instanceof Estudiante) {
                            System.out.println("ID: " + persona.getID());
                            System.out.println("Nombre: " + persona.getNombre());
                            System.out.println("CURP: " + persona.getCURP());
                            System.out.println("Domicilio: " + persona.getDomicilio());
                            System.out.println();
                        }
                    }
                    
                    System.out.println("Docentes:");
                    for (Persona persona : registros) {
                        if (persona instanceof Docente) {
                            System.out.println("ID: " + persona.getID());
                            System.out.println("Nombre: " + persona.getNombre());
                            System.out.println("CURP: " + persona.getCURP());
                            System.out.println("Domicilio: " + persona.getDomicilio());
                            System.out.println();
                        }
                    }
                    
                    System.out.println("PAAEs:");
                    for (Persona persona : registros) {
                        if (persona instanceof PAAE) {
                            System.out.println("ID: " + persona.getID());
                            System.out.println("Nombre: " + persona.getNombre());
                            System.out.println("CURP: " + persona.getCURP());
                            System.out.println("Domicilio: " + persona.getDomicilio());
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }
}