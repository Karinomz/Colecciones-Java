/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.en.java;

import Entidades.Pais;
import Servicios.ServiciosEjercicio5;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class JavaColecciones5 {
    public static void main(String[] args) {
        ServiciosEjercicio5 servicios = new ServiciosEjercicio5();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de países.");

        do {
            System.out.print("Ingrese un país: ");
            String nombrePais = scanner.nextLine();

            Pais pais = new Pais(nombrePais);
            servicios.agregarPais(pais);
        } while (servicios.deseaContinuar());

        servicios.mostrarPaisesGuardados();
        servicios.mostrarPaisesOrdenados();

        System.out.print("\nIngrese un país a eliminar: ");
        String paisEliminar = scanner.nextLine();
        servicios.eliminarPais(paisEliminar);

        scanner.close();
    }
}

