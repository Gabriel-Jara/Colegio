
package colegio;

import java.util.HashSet;

/**
 *
 * @author Gabriel Jara
 */
public class InternalInscripcion extends javax.swing.JInternalFrame {
    private HashSet<Materia> listaMaterias;
    private HashSet<Alumno> listaAlumnos;
    
    public InternalInscripcion(HashSet materias, HashSet alumnos) {
        initComponents();
        this.listaMaterias = materias;
        this.listaAlumnos = alumnos;
        cargarMateriasYAlumnos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbx_materias = new javax.swing.JComboBox<>();
        cbx_alumnos = new javax.swing.JComboBox<>();
        bt_inscribir = new javax.swing.JButton();
        bt_salir = new javax.swing.JButton();
        lb_mensaje = new javax.swing.JLabel();

        jLabel1.setText("FORMULARIO DE INSCRIPCIÓN");

        jLabel2.setText("ELIJA UNA MATERIA");

        jLabel3.setText("ELIJA UN ALUMNO");

        cbx_materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_materiasActionPerformed(evt);
            }
        });

        bt_inscribir.setText("INSCRIBIR");
        bt_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inscribirActionPerformed(evt);
            }
        });

        bt_salir.setText("SALIR");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bt_inscribir)
                .addGap(54, 54, 54)
                .addComponent(bt_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbx_materias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbx_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbx_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbx_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lb_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salir)
                    .addComponent(bt_inscribir))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_materiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_materiasActionPerformed

    }//GEN-LAST:event_cbx_materiasActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inscribirActionPerformed
        Alumno alumno = (Alumno)cbx_alumnos.getSelectedItem();
        Materia materia = (Materia)cbx_materias.getSelectedItem();
        alumno.agregarMateria(materia);
        System.out.println(alumno.cantidadMaterias());
        lb_mensaje.setText("Se agregó la materia "+materia.getNombre()+" al alumno "+alumno.getNombre() + " " +alumno.getApellido());
    }//GEN-LAST:event_bt_inscribirActionPerformed

    public void cargarMateriasYAlumnos(){
        for (Materia elem : listaMaterias) {            
        cbx_materias.addItem(elem);
        }
        for (Alumno elem : listaAlumnos) {
            cbx_alumnos.addItem(elem);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_inscribir;
    private javax.swing.JButton bt_salir;
    private javax.swing.JComboBox<Alumno> cbx_alumnos;
    private javax.swing.JComboBox<Materia> cbx_materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_mensaje;
    // End of variables declaration//GEN-END:variables
}
