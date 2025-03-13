import java.util.ArrayList;
import java.util.Scanner;
import clases.Estudiantes;

public class SistemaRegistroEsrtudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiantes> estudiantes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- Sistema de Registro de Estudiantes ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante por matrícula");
            System.out.println("4. Eliminar estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = scanner.nextLine();

                    estudiantes.add(new Estudiantes(nombre, edad, matricula, carrera));
                    System.out.println("Estudiante registrado con éxito.");
                    break;
                
                case 2:
                    if (estudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        System.out.println("\n--- Lista de Estudiantes ---");
                        for (Estudiantes estudiante : estudiantes) {
                            System.out.println("Nombre: " + estudiante.nombre);
                            System.out.println("Edad: " + estudiante.edad);
                            System.out.println("Matrícula: " + estudiante.matricula);
                            System.out.println("Carrera: " + estudiante.carrera);
                            System.out.println("-----------------------------");
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("Ingrese la matrícula a buscar: ");
                    String matriculaBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Estudiantes estudiante : estudiantes) {
                        if (estudiante.matricula.equals(matriculaBuscar)) {
                            System.out.println("Nombre: " + estudiante.nombre);
                            System.out.println("Edad: " + estudiante.edad);
                            System.out.println("Matrícula: " + estudiante.matricula);
                            System.out.println("Carrera: " + estudiante.carrera);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                
                case 4:
                    System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
                    String matriculaEliminar = scanner.nextLine();
                    boolean eliminado = estudiantes.removeIf(est -> est.matricula.equals(matriculaEliminar));
                    if (eliminado) {
                        System.out.println("Estudiante eliminado con éxito.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
