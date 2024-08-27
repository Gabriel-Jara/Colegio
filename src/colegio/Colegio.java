
package colegio;

import java.util.HashSet;

/**
 * @author Gabriel Jara
 */
public class Colegio {


    public static void main(String[] args) {
        HashSet<Materia> materiasDisponibles = new HashSet();
        HashSet<Materia> alumnosInscriptos = new HashSet();
        
        FormularioMateria form = new FormularioMateria();
        form.setVisible(true);
    }

}
