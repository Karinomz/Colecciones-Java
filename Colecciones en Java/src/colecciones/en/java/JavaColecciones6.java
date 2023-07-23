/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.en.java;

import Entidades.Tienda;
import Servicios.ServiciosEjercicio6;

/**
 *
 * @author never
 */
public class JavaColecciones6 {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        ServiciosEjercicio6 servicios = new ServiciosEjercicio6(tienda);
        servicios.mostrarMenu();
    
    }
}
