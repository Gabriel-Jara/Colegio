/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package colegio;

/**
 *
 * @author Gabriel Jara
 */
public class InternalAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalAlumnos
     */
    public InternalAlumnos() {
        initComponents();
        txt_legajo.setEnabled(false);
        txt_apellido.setEnabled(false);
        txt_nombreAlumno.setEnabled(false);
        bt_guardarAlumno.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_apellido = new javax.swing.JTextField();
        txt_nombreAlumno = new javax.swing.JTextField();
        bt_nuevoAlumno = new javax.swing.JButton();
        bt_guardarAlumno = new javax.swing.JButton();
        bt_salirAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_legajo = new javax.swing.JTextField();

        bt_nuevoAlumno.setText("NUEVO");
        bt_nuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoAlumnoActionPerformed(evt);
            }
        });

        bt_guardarAlumno.setText("GUARDAR");
        bt_guardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarAlumnoActionPerformed(evt);
            }
        });

        bt_salirAlumno.setText("SALIR");
        bt_salirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setText("FORMULARIO DE ALUMNOS");

        jLabel2.setText("LEGAJO");

        jLabel3.setText("APELLIDO");

        jLabel4.setText("NOMBRE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_legajo)
                            .addComponent(txt_apellido)
                            .addComponent(txt_nombreAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(bt_guardarAlumno)
                        .addGap(32, 32, 32)
                        .addComponent(bt_nuevoAlumno)
                        .addGap(35, 35, 35)
                        .addComponent(bt_salirAlumno)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_legajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_guardarAlumno)
                    .addComponent(bt_nuevoAlumno)
                    .addComponent(bt_salirAlumno))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_nuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoAlumnoActionPerformed
        txt_legajo.setEnabled(true);
        txt_apellido.setEnabled(true);
        txt_nombreAlumno.setEnabled(true);
        bt_guardarAlumno.setEnabled(true);
    }//GEN-LAST:event_bt_nuevoAlumnoActionPerformed

    private void bt_guardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarAlumnoActionPerformed

    }//GEN-LAST:event_bt_guardarAlumnoActionPerformed

    private void bt_salirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirAlumnoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bt_salirAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_guardarAlumno;
    private javax.swing.JButton bt_nuevoAlumno;
    private javax.swing.JButton bt_salirAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_legajo;
    private javax.swing.JTextField txt_nombreAlumno;
    // End of variables declaration//GEN-END:variables
}
