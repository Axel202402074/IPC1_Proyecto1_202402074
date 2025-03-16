
package VISTA;

import Modelo.ModeloPantallaPrincipal;
import Controlador.ControladorPantallaPrincipal;

public class PantallaPrincipal extends javax.swing.JFrame {
    

  

    public PantallaPrincipal() {
    
    initComponents();
    this.setTitle("Login");
    this.setLocationRelativeTo(null);
    
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnRegistroUsu = new javax.swing.JButton();
        btnCrearCue = new javax.swing.JButton();
        btnBuscarCue = new javax.swing.JButton();
        btnDepositos = new javax.swing.JButton();
        btnRetiros = new javax.swing.JButton();
        btnHistorialdetra = new javax.swing.JButton();
        btnGenReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido <Administrador>");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ayuda", "Datos del estudiante", "Generación de Bitácora" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnRegistroUsu.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRegistroUsu.setText("Registro de Usuario");
        btnRegistroUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistroUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistroUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUsuActionPerformed(evt);
            }
        });

        btnCrearCue.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnCrearCue.setText("Crear Cuenta");
        btnCrearCue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearCue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCueActionPerformed(evt);
            }
        });

        btnBuscarCue.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnBuscarCue.setText("Buscar cuentas asociadas de clientes");
        btnBuscarCue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarCue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCueActionPerformed(evt);
            }
        });

        btnDepositos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnDepositos.setText("Depositos");
        btnDepositos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDepositos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositosActionPerformed(evt);
            }
        });

        btnRetiros.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRetiros.setText("Retiros");
        btnRetiros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRetiros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirosActionPerformed(evt);
            }
        });

        btnHistorialdetra.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnHistorialdetra.setText("Historial de transacciones");
        btnHistorialdetra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorialdetra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistorialdetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialdetraActionPerformed(evt);
            }
        });

        btnGenReport.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnGenReport.setText("Generacion de reportes ");
        btnGenReport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistroUsu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrearCue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGenReport, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(btnRetiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHistorialdetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistroUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorialdetra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenReport, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCrearCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCueActionPerformed
        // TODO add your handling code here:
        CrearCuenta_2 nuevavista =new CrearCuenta_2();
        
        nuevavista.setVisible(true);
        
        
    }//GEN-LAST:event_btnCrearCueActionPerformed

    private void btnBuscarCueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCueActionPerformed
      
        
                BuscarCuentas_3 nuevavista =new BuscarCuentas_3();
            nuevavista.setVisible(true);
        
        
    }//GEN-LAST:event_btnBuscarCueActionPerformed

    private void btnRegistroUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUsuActionPerformed
        // TODO add your handling code here:
        
        RegistroUsuario_1 nuevavista =new RegistroUsuario_1();
        
        nuevavista.setVisible(true);
        
       
        
        
    }//GEN-LAST:event_btnRegistroUsuActionPerformed

    private void btnDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositosActionPerformed
        Depositos_4 nuevavista =new Depositos_4();
            nuevavista.setVisible(true);
    }//GEN-LAST:event_btnDepositosActionPerformed

    private void btnRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirosActionPerformed
         Retiros_5 nuevavista =new Retiros_5();
            nuevavista.setVisible(true);
    }//GEN-LAST:event_btnRetirosActionPerformed

    private void btnHistorialdetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialdetraActionPerformed
        Historial_6 nuevavista =new Historial_6();
            nuevavista.setVisible(true);
    }//GEN-LAST:event_btnHistorialdetraActionPerformed

    private void btnGenReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenReportActionPerformed
        
    }//GEN-LAST:event_btnGenReportActionPerformed

    
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCue;
    private javax.swing.JButton btnCrearCue;
    private javax.swing.JButton btnDepositos;
    private javax.swing.JButton btnGenReport;
    private javax.swing.JButton btnHistorialdetra;
    public javax.swing.JButton btnRegistroUsu;
    private javax.swing.JButton btnRetiros;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

public void configurarAccesos(ModeloPantallaPrincipal modelo) {
    if (!modelo.esAdministrador()) {
        btnRegistroUsu.setEnabled(false);  // Bloquea registro de usuarios
        btnGenReport.setEnabled(false);   // Bloquea generación de reportes
    }
  
}

}


