/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class ServiciosEjercicio4 {
    private List<Peliculas> listaPeliculas;
    
    public ServiciosEjercicio4() {
        listaPeliculas = new ArrayList<>();
    }
    
    public void ejecutarBucle(){
        Scanner scanner = new Scanner(System.in);
         char respuesta;

        do {
            System.out.println("Ingrese el título de la película:");
            String titulo = scanner.nextLine();

            System.out.println("Ingrese el director de la película:");
            String director = scanner.nextLine();

            System.out.println("Ingrese la duración de la película en minutos:");
            int duracion = Integer.parseInt(scanner.nextLine());

            Peliculas pelicula = new Peliculas(titulo, director, duracion);
            agregarPelicula(pelicula);

            System.out.println("¿Desea agregar otra película? (s/n)");
            respuesta = scanner.nextLine().toLowerCase().charAt(0);
        } while (respuesta == 's');

        scanner.close();
    }
    
    public void agregarPelicula(Peliculas pelicula) {
        listaPeliculas.add(pelicula);
    }
    
    public void mostrarPeliculas() {
        for (Peliculas pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }
    public void mostrarPeliculasMayor1Hora() {
        for (Peliculas pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 60) {
                System.out.println(pelicula);
            }
        }
    }
    public void ordenarPeliculasPorDuracionMenorAMayor() {
        listaPeliculas.sort(Comparator.comparingInt(Peliculas::getDuracion));
        mostrarPeliculas();
    }
    
    public void ordenarPeliculasPorDuracionMayorAMenor() {
        listaPeliculas.sort(Comparator.comparingInt(Peliculas::getDuracion).reversed());
        mostrarPeliculas();
    }
    
    // Método para ordenar las películas por director alfabéticamente y mostrarlas
    public void ordenarPeliculasPorDirector() {
        listaPeliculas.sort(Comparator.comparing(Peliculas::getDirector));
        mostrarPeliculas();
    }
    
    public void ordenarPeliculasPorTitulo() {
        listaPeliculas.sort(Comparator.comparing(Peliculas::getTitulo));
        mostrarPeliculas();
    }
    
    
}

