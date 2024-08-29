
package colegio;

import java.util.HashSet;

/**
 * @author Gabriel Jara
 */
public class Colegio {


    public static void main(String[] args) {
        HashSet<Materia> materiasDisponibles = new HashSet();
        HashSet<Alumno> alumnosInscriptos = new HashSet();
        
        FormularioMateria mat= new FormularioMateria ();
        mat.setVisible(true);
        FormularioAlumnos alum = new FormularioAlumnos();

        alum.setVisible(true);
        FormularioInscripcion insc = new FormularioInscripcion();
        insc.setVisible(true);

        
//        Materia mat = new Materia(001,"Matematicas",1);
//        Materia mat1 = new Materia(002,"Lengua",2);
//        Materia mat2 = new Materia(003,"Lengua1",2);
//        Alumno al1= new Alumno (1001, "Lopez", "Martin");
//        Alumno al2= new Alumno (1002, "Martinez", "Brenda");
       
        
//        materiasDisponibles.add(mat);
//        materiasDisponibles.add(mat1);
//        materiasDisponibles.add(mat2);
//        alumnosInscriptos.add(al1);
//        alumnosInscriptos.add(al2);
        
        
//        insc.agregarMaterias(materiasDisponibles);
//        insc.agregarAlumno(alumnosInscriptos);
//        
        
    }

}
