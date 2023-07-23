package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class ServiciosEjercicio3 {
    private List<Alumnos> listaAlumnos; // Lista para almacenar los objetos Alumnos
    Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    
    public ServiciosEjercicio3() {
        listaAlumnos = new ArrayList<>(); // Inicializar la lista de alumnos en el constructor
    }
    // Esto significa que, en el momento de crear un objeto de la clase ServiciosEjercicio3, 
    //la lista de alumnos ya está preparada para recibir y almacenar instancias de la clase Alumnos.
    
    public void crearAlumno(){
        boolean crearAlumnos=true;
        
        while(crearAlumnos){
            System.out.print("Ingrese el nombre del alumno: ");
            String nombreAlumno = scanner.nextLine();
            List<Integer> notasAlumno = new ArrayList<>(); // Lista para almacenar las notas del alumno
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = Integer.parseInt(scanner.nextLine()); // Leer la nota desde la entrada del usuario
                //esta línea de código permite al usuario ingresar un valor numérico
                //como una cadena de texto, y luego lo convierte en un número entero
                //que puede ser utilizado en el programa para realizar operaciones 
                //matemáticas o cualquier otro propósito.
                notasAlumno.add(nota);   
            }
            
            Alumnos alumno = new Alumnos(nombreAlumno, notasAlumno);
            listaAlumnos.add(alumno);

            System.out.print("¿Desea crear otro alumno? (Si/No): ");
            char respuesta = scanner.nextLine().toUpperCase().charAt(0);
            crearAlumnos = respuesta == 'S';
        }
        
    }
   
    
    public double calcularNotaFinal(String nombreAlumno) {
        boolean alumnoEncontrado = false;
        for (Alumnos alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                //se está comparando el nombre del objeto alumno
                //con el nombre del alumno ingresado por el usuario en el método
                List<Integer> notas = alumno.getNotas(); // Obtener la lista de notas del alumno
                
                if (notas.isEmpty()) { // es una expresión que se utiliza para verificar si la lista notas está vacía o no.
                    return 0.0; // Si el alumno no tiene notas, retornar 0.0 como nota final
                }

                int sum = 0;
                for (int nota : notas) { // for each
                    sum += nota; // Sumar las notas del alumno
                }

                double notaFinal = (double) sum / notas.size();
                //(double) sum: En esta parte, (double) es un "casting" que convierte
                //la variable sum de tipo entero a tipo double. Esto se hace para asegurarse
                //de que la división de sum entre notas.size() se realice como una división
                //de números de punto flotante (con decimales) y no como una división entera
                //(que truncaría el resultado).
                System.out.println("La nota final de " + alumno.getNombre() + " es: " + notaFinal);
                alumnoEncontrado = true;
                break; //se ejecuta para salir del bucle, ya que no es necesario
                //seguir buscando más alumnos una vez que se encontró el alumno buscado.
            }
        }

        if (!alumnoEncontrado) {
            System.out.println("El alumno no se encuentra en la lista.");
            return 0.0;
        }

        return 0.0; //Si el alumno no tiene notas registradas: Nota 0.0
                    //Si el alumno no se encuentra en la lista: Nota 0.0
    }
        
    public void mostrarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados en la lista.");
        } else {
            System.out.println("\nLista de Alumnos:");
            for (Alumnos alumno : listaAlumnos) {
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Notas: " + alumno.getNotas());
                
            }
        }
    }

    
 }
