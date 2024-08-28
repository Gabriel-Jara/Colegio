
package colegio;

import java.util.HashSet;

/**
 * @author Gabriel Jara
 */
public class Colegio {


    public static void main(String[] args) {
//        HashSet<Materia> materiasDisponibles = new HashSet();
//        HashSet<Alumno> alumnosInscriptos = new HashSet();
        FormularioAlumnos alum = new FormularioAlumnos();
        FormularioInscripcion insc = new FormularioInscripcion();
        FormularioMateria form = new FormularioMateria();
        form.setVisible(true);
        
        
    }

}
