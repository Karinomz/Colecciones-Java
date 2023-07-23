/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones.en.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class JavaColecciones1 {
    public static void main(String[] args) {
        ArrayList<String> guardarPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.print("Ingrese la raza del perro (o escriba 'salir' para finalizar): ");
            String razaPerro = scanner.nextLine();

            if (razaPerro.equalsIgnoreCase("salir")) {
                salir = true;
            } else {
                guardarPerros.add(razaPerro);
            }
        }

        System.out.println("\nRazas de perros guardadas:");
        for (String raza : guardarPerros) {
            System.out.println(raza);
        }
    }
}
