/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Tienda;
import java.util.Scanner;

/**
 *
 * @author never
 */
public class ServiciosEjercicio6 {
    private Tienda tienda;

    public ServiciosEjercicio6(Tienda tienda) {
        this.tienda = tienda;
    }
    
    public void agregarProducto(String nombre, double precio) {
        tienda.getProductos().put(nombre, precio);
    }

    public void modificarPrecioProducto(String nombre, double nuevoPrecio) {
        if (tienda.getProductos().containsKey(nombre)) {
            tienda.getProductos().put(nombre, nuevoPrecio);
            System.out.println("Precio del producto '" + nombre + "' modificado exitosamente.");
        } else {
            System.out.println("El producto '" + nombre + "' no existe en la tienda.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (tienda.getProductos().containsKey(nombre)) {
            tienda.getProductos().remove(nombre);
            System.out.println("Producto '" + nombre + "' eliminado exitosamente.");
        } else {
            System.out.println("El producto '" + nombre + "' no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (tienda.getProductos().isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            for (String nombre : tienda.getProductos().keySet()) {
                double precio = tienda.getProductos().get(nombre);
                System.out.println("- " + nombre + ": $" + precio);
            }
        }
    }
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n------- Menú de la Tienda -------");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Precio de Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Productos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    agregarProducto(nombre, precio);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    scanner.nextLine();
                    String nombreModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = scanner.nextDouble();
                    modificarPrecioProducto(nombreModificar, nuevoPrecio);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    scanner.nextLine();
                    String nombreEliminar = scanner.nextLine();
                    eliminarProducto(nombreEliminar);
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
