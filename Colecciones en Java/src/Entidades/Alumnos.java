
package Entidades;

import java.util.List;

/**
 *
 * @author never
 */
public class Alumnos {
    private String nombre;
    private List<Integer> notas;

    public Alumnos() {
    }

    public Alumnos(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }
   
}
