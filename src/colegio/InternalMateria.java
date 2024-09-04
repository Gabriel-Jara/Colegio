package colegio;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Jara
 */
public class InternalMateria extends javax.swing.JInternalFrame {

    private HashSet<Materia> listaMaterias;

    /**
     * Creates new form InternalMateria
     */
    public InternalMateria(HashSet lista) {
        initComponents();
        bt_guardar.setEnabled(false);
        txt_codigo.setEnabled(false);
        txt_nombreMateria.setEnabled(false);
        txt_anio.setEnabled(false);
        listaMaterias = lista;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_anio = new javax.swing.JTextField();
        bt_nuevo = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        bt_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombreMateria = new javax.swing.JTextField();

        bt_nuevo.setText("NUEVO");
        bt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoActionPerformed(evt);
            }
        });

        bt_guardar.setText("GUARDAR");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        bt_salir.setText("SALIR");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        jLabel1.setText("FORMULARIO DE MATERIAS");

        jLabel2.setText("CÓDIGO DE MATERIA");

        jLabel3.setText("NOMBRE DE LA MATERIA");

        jLabel4.setText("AÑO AL QUE PERTENECE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(bt_guardar)
                        .addGap(32, 32, 32)
                        .addComponent(bt_nuevo)
                        .addGap(35, 35, 35)
                        .addComponent(bt_salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_guardar)
                    .addComponent(bt_nuevo)
                    .addComponent(bt_salir))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoActionPerformed
        bt_guardar.setEnabled(true);
        txt_codigo.setEnabled(true);
        txt_nombreMateria.setEnabled(true);
        txt_anio.setEnabled(true);
        bt_nuevo.setEnabled(false);
    }//GEN-LAST:event_bt_nuevoActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        if (!validarCamposVacios()) {
            
        int codigo = Integer.parseInt(txt_codigo.getText());
        String nombre = txt_nombreMateria.getText();
        int anio = Integer.parseInt(txt_anio.getText());
        Materia materiaNueva = new Materia(codigo,nombre,anio);
        this.listaMaterias.add(materiaNueva);
         bt_nuevo.setEnabled(true);
         txt_anio.setText("");
         txt_codigo.setText("");
         txt_nombreMateria.setText("");
         bt_guardar.setEnabled(false);
         txt_codigo.setEnabled(false);
        txt_nombreMateria.setEnabled(false);
        txt_anio.setEnabled(false);
        }
          else{
         JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_bt_salirActionPerformed

     public boolean validarCamposVacios(){
       return txt_anio.getText().equals("")||txt_codigo.getText().equals("")||txt_nombreMateria.getText().equals("");
       
    }
    public void setListaMaterias(HashSet<Materia> lista) {
        this.listaMaterias = lista;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton bt_nuevo;
    private javax.swing.JButton bt_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_anio;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombreMateria;
    // End of variables declaration//GEN-END:variables
}
