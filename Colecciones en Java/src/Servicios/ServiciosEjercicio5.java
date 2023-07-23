/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author never
 */
public class ServiciosEjercicio5 {
    private Set<Pais> paises;
    Scanner scanner = new Scanner(System.in);
    public ServiciosEjercicio5() {
        paises = new HashSet<>();
    }
    
    public void agregarPais(Pais pais) {
        paises.add(pais);
    }
    
    public void mostrarPaisesGuardados() {
        System.out.println("\nPaíses guardados:");
        for (Pais pais: paises) {
            System.out.println(pais.getNombre());
        }
    }
    public void mostrarPaisesOrdenados() {
        Set<Pais> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("\nPaíses ordenados alfabéticamente:");
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
    }
    
    public void eliminarPais(String nombrePais) {
        Iterator<Pais> iterator = paises.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                iterator.remove();
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("\nPaís eliminado. Países restantes:");
            mostrarPaisesOrdenados();
        } else {
            System.out.println("\nEl país ingresado no se encuentra en el conjunto.");
        }
    }
    public boolean deseaContinuar() {
        System.out.print("\n¿Desea ingresar otro país? (Si/No): ");
        char respuesta = scanner.nextLine().toLowerCase().charAt(0);
        return respuesta == 's';
    }
}
