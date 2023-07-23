/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.en.java;

import Servicios.ServiciosEjercicio4;

/**
 *
 * @author never
 */
public class JavaColecciones4 {
    public static void main(String[] args) {
        ServiciosEjercicio4 servicios = new ServiciosEjercicio4();
        servicios.ejecutarBucle();
        System.out.println("Todas las películas:");
        servicios.mostrarPeliculas();

        System.out.println("\nPelículas con duración mayor a 1 hora:");
        servicios.mostrarPeliculasMayor1Hora();

        System.out.println("\nPelículas ordenadas por duración (de mayor a menor):");
        servicios.ordenarPeliculasPorDuracionMayorAMenor();

        System.out.println("\nPelículas ordenadas por duración (de menor a mayor):");
        servicios.ordenarPeliculasPorDuracionMenorAMayor();

        System.out.println("\nPelículas ordenadas por título:");
        servicios.ordenarPeliculasPorTitulo();

        System.out.println("\nPelículas ordenadas por director:");
        servicios.ordenarPeliculasPorDirector();
    }
}

