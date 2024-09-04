
package colegio;

import java.util.HashSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author Gabriel Jara
 */
public class InternalMostrarMaterias extends javax.swing.JInternalFrame {
private HashSet<Alumno>listaAlumnos;
DefaultListModel modelo = new DefaultListModel(); //Crea modelo para utilizar en lista. Se lo asocia en línea 19
 
    public InternalMostrarMaterias(HashSet<Alumno>lista) {
        initComponents();
        this.listaAlumnos = lista;
        cargarAlumnos();
        listado.setModel(modelo); // Se asocia el modelo (creado en linea 13) al listado para poder cargarle elementos
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JList<>();
        cbx_alumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jLabel2.setText("Seleccione alumno:");

        jLabel3.setText("Lista de materias inscriptas");

        jScrollPane1.setViewportView(listado);

        cbx_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_alumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addGap(81, 81, 81)
                            .addComponent(cbx_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jLabel3))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("MATERIAS INSCRIPTAS DEL ALUMNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_alumnosActionPerformed
        Alumno alumno = (Alumno)cbx_alumnos.getSelectedItem();
        HashSet<Materia>lista = alumno.getListaMaterias();
        modelo.removeAllElements(); // Se utiliza para borrar los elementos que ya estaban en el listado cada vez que se seleccione otro alumno.
        for (Materia materia : lista) {
            modelo.addElement(materia); // Se cargan al listado las materias del alumno seleccionado en el combobox.
        }
    }//GEN-LAST:event_cbx_alumnosActionPerformed

public void cargarAlumnos(){
    for (Alumno listaAlumno : listaAlumnos) {
        cbx_alumnos.addItem(listaAlumno);
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbx_alumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Materia> listado;
    // End of variables declaration//GEN-END:variables
}
