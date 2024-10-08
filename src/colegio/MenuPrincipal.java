
package colegio;

import java.util.HashSet;

/**
 *
 * @author Gabriel Jara
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private HashSet<Alumno> listaAlumnos = new HashSet();
    private HashSet<Materia> listaMaterias  = new HashSet();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        desktop_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_cargarAlumno = new javax.swing.JMenuItem();
        menu_verMaterias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_cargarMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_inscripcionMaterias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal del Colegio");
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(575, 588));

        desktop_principal.setPreferredSize(new java.awt.Dimension(421, 323));

        javax.swing.GroupLayout desktop_principalLayout = new javax.swing.GroupLayout(desktop_principal);
        desktop_principal.setLayout(desktop_principalLayout);
        desktop_principalLayout.setHorizontalGroup(
            desktop_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
        desktop_principalLayout.setVerticalGroup(
            desktop_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(desktop_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(desktop_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setBackground(new java.awt.Color(153, 204, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Alumnos");

        menu_cargarAlumno.setBackground(new java.awt.Color(204, 255, 255));
        menu_cargarAlumno.setForeground(new java.awt.Color(0, 0, 255));
        menu_cargarAlumno.setText("Cargar Alumnos");
        menu_cargarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cargarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(menu_cargarAlumno);

        menu_verMaterias.setBackground(new java.awt.Color(204, 255, 255));
        menu_verMaterias.setForeground(new java.awt.Color(0, 0, 255));
        menu_verMaterias.setText("Materias asignadas");
        menu_verMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_verMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(menu_verMaterias);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(153, 204, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Materias");

        menu_cargarMaterias.setBackground(new java.awt.Color(204, 255, 255));
        menu_cargarMaterias.setForeground(new java.awt.Color(0, 0, 255));
        menu_cargarMaterias.setText("Agregar materias");
        menu_cargarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cargarMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(menu_cargarMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(153, 204, 255));
        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Inscripción");

        menu_inscripcionMaterias.setBackground(new java.awt.Color(204, 255, 255));
        menu_inscripcionMaterias.setForeground(new java.awt.Color(0, 0, 255));
        menu_inscripcionMaterias.setText("Inscribir en materias");
        menu_inscripcionMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_inscripcionMateriasActionPerformed(evt);
            }
        });
        jMenu3.add(menu_inscripcionMaterias);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_cargarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cargarAlumnoActionPerformed
        desktop_principal.removeAll();
        desktop_principal.repaint();
        InternalAlumnos formCargaAlumnos = new InternalAlumnos(listaAlumnos);
        desktop_principal.add(formCargaAlumnos);
        formCargaAlumnos.setVisible(true);
    }//GEN-LAST:event_menu_cargarAlumnoActionPerformed

    private void menu_cargarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cargarMateriasActionPerformed
        desktop_principal.removeAll();
        desktop_principal.repaint();
        InternalMateria formCargaMateria = new InternalMateria(listaMaterias);
        desktop_principal.add(formCargaMateria);
        formCargaMateria.setVisible(true);
    }//GEN-LAST:event_menu_cargarMateriasActionPerformed

    private void menu_inscripcionMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_inscripcionMateriasActionPerformed
       desktop_principal.removeAll();
        desktop_principal.repaint();
        InternalInscripcion formInscripcion = new InternalInscripcion(listaMaterias,listaAlumnos);
        desktop_principal.add(formInscripcion);
        formInscripcion.setVisible(true);
    }//GEN-LAST:event_menu_inscripcionMateriasActionPerformed

    private void menu_verMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_verMateriasActionPerformed
       desktop_principal.removeAll();
        desktop_principal.repaint();
        InternalMostrarMaterias formMostrarMaterias = new InternalMostrarMaterias(listaAlumnos);
        desktop_principal.add(formMostrarMaterias);
        formMostrarMaterias.setVisible(true);
    }//GEN-LAST:event_menu_verMateriasActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    public void cargarListaAlumnos(HashSet<Alumno> lista){
        this.listaAlumnos = lista;
    }
    
    public void cargarListaMaterias(HashSet<Materia> lista){
        this.listaMaterias = lista;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop_principal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menu_cargarAlumno;
    private javax.swing.JMenuItem menu_cargarMaterias;
    private javax.swing.JMenuItem menu_inscripcionMaterias;
    private javax.swing.JMenuItem menu_verMaterias;
    // End of variables declaration//GEN-END:variables
}
