
package colegio;

import java.util.HashSet;

/**
 *
 * @author Gabriel Jara
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> listaMaterias = new HashSet();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        listaMaterias.add(m);
    }
    
    public int cantidadMaterias(){
        return listaMaterias.size();
    }

    @Override
    public String toString() {
        return legajo + "- " + apellido + " " + nombre;
    }

    public HashSet<Materia> getListaMaterias() {
        return listaMaterias;
    }
    
}
