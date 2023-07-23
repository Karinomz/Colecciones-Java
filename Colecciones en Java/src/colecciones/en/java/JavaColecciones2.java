/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.
 */
package colecciones.en.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class JavaColecciones2 {
    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.print("Ingrese la raza del perro (o escriba 'salir' para finalizar): ");
            String razaPerro = scanner.nextLine();

            if (razaPerro.equalsIgnoreCase("salir")) {
                salir = true; // Si el usuario ingresa "salir", cambia la variable a true y sale del bucle
            } else {
                razasPerros.add(razaPerro); // Agrega la raza del perro al ArrayList
            }
        }

        System.out.println("\nRazas de perros guardadas:");
        for (String raza : razasPerros) {
            System.out.println(raza); // Muestra todas las razas ingresadas por el usuario
        }

        System.out.print("\nIngrese el perro que desea eliminar: ");
        String perroEliminar = scanner.nextLine();

        // Utilizamos un Iterator para recorrer el ArrayList y buscar el perro ingresado por el usuario
        Iterator<String> iterator = razasPerros.iterator();
        while (iterator.hasNext()) {
            String raza = iterator.next();
            if (raza.equalsIgnoreCase(perroEliminar)) {
                iterator.remove(); // Si encuentra el perro, lo elimina del ArrayList
            }
        }

        Collections.sort(razasPerros); // Ordena la lista alfabéticamente

        System.out.println("\nRazas de perros después de eliminar y ordenar:");
        if (razasPerros.isEmpty()) {
            System.out.println("La lista de razas está vacía."); // Si la lista está vacía, muestra un mensaje
        } else {
            for (String raza : razasPerros) {
                System.out.println(raza); // Muestra todas las razas actualizadas después de eliminar y ordenar
            }
        }
    }
    }


