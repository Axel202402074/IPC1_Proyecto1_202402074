
package VISTA;

import Controlador.ControladorBuscarCuentas;
import Modelo.ModeloRegistroUsuario;
import Modelo.ModeloBuscarCuentas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.*;

public class BuscarCuentas_3 extends javax.swing.JFrame {
  
 private DefaultTableModel tbldatos = new DefaultTableModel();
   private DefaultTableModel tbldatos2 = new DefaultTableModel();

    
ArrayList<ModeloRegistroUsuario> listaClientes = RegistroUsuario_1.listaClientes;
ArrayList<String> listaCuentas = new ArrayList<String>(); // Depende de dónde guardes las cuentas
    
    
    private DefaultTableModel modelClientes = new DefaultTableModel();
    private DefaultTableModel modelCuentasAsociadas = new DefaultTableModel();
    private ControladorBuscarCuentas controlador;
    private DefaultTableModel modelmovs = new DefaultTableModel();
    private DefaultTableModel modelmovs1 = new DefaultTableModel();
     private BuscarCuentas_3 buscarCuentasInstance;
  

        public BuscarCuentas_3() {
        this(new ArrayList<>());
    }

        public BuscarCuentas_3(ArrayList<ModeloRegistroUsuario> listaClientes) {
        initComponents();
        String[] titulo = new String[]{"CUI", "Nombre", "Apellido"};
        tbldatos.setColumnIdentifiers(titulo);
        tblCuentas.setModel(tbldatos);
        
     
     
            modelmovs1.addColumn("Cuentas asociadas");
            tblcuentasAsociadas.setModel(modelmovs1);
        
        
            this.setTitle("Ver clientes");
            this.setLocationRelativeTo(null);
            this.controlador = new ControladorBuscarCuentas();
            
            agregardat();
         
     
            

            
        }

    
    

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuentas = new javax.swing.JTable();
        txtcui = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblcuentasAsociadas = new javax.swing.JTable();
        btnBuscarCuentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        tblCuentas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tblCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblCuentas);
        if (tblCuentas.getColumnModel().getColumnCount() > 0) {
            tblCuentas.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tblCuentas.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tblCuentas.getColumnModel().getColumn(2).setHeaderValue("Title 3");
        }

        txtcui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUI");

        tblcuentasAsociadas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tblcuentasAsociadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(tblcuentasAsociadas);

        btnBuscarCuentas.setText("Buscar cuentas asociadas");
        btnBuscarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCuentasActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcui)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuiActionPerformed
      
    }//GEN-LAST:event_txtcuiActionPerformed

    private void btnBuscarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCuentasActionPerformed
         String cuiIngresado = txtcui.getText().trim(); // Obtener CUI ingresado y eliminar espacios en blanco

    System.out.println("Lista de CUI registrados: " + listaClientes+listaCuentas);
    System.out.println("CUI ingresado: " + cuiIngresado);

                    boolean encontrado = false;
                for (ModeloRegistroUsuario usuario : listaClientes) {
                    if (usuario.getCui().equals(cuiIngresado)) {
                        encontrado = true;

                        break;
    }
    }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "El CUI ingresado no está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
    }                                                

    agregarcuentas(cuiIngresado);
    }//GEN-LAST:event_btnBuscarCuentasActionPerformed
  
  
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
            java.util.logging.Logger.getLogger(BuscarCuentas_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCuentas_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCuentas_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCuentas_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCuentas_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCuentas;
    public javax.swing.JTable tblcuentasAsociadas;
    private javax.swing.JTextField txtcui;
    // End of variables declaration//GEN-END:variables
    
public void agregarcuentas(String cuiIngresado) {
    // Limpiar la tabla antes de agregar nuevas cuentas
    modelmovs1.setRowCount(0);

    // Buscar cuentas asociadas al CUI
    List<String> cuentas = obtenerCuentasAsociadas(cuiIngresado);

    System.out.println("Cuentas encontradas para CUI " + cuiIngresado + ": " + cuentas); // Depuración

    for (String cuenta : cuentas) {
        modelmovs1.addRow(new Object[]{cuenta});
    }

    // Forzar actualización de la tabla
    tblcuentasAsociadas.setModel(modelmovs1);
    tblcuentasAsociadas.revalidate();
    tblcuentasAsociadas.repaint();
}


private List<String> obtenerCuentasAsociadas(String cui) {
    List<String> cuentasAsociadas = new ArrayList<>();

    for (ModeloRegistroUsuario usuario : listaClientes) {
        System.out.println("Verificando usuario con CUI: " + usuario.getCui()); // 🔹 Depuración
        if (usuario.getCui().equals(cui)) {
            System.out.println("Usuario encontrado. Cuentas asignadas: " + usuario.getListaCuentas()); // 🔹 Depuración
            cuentasAsociadas = usuario.getListaCuentas();
            break;
        }
    }

    System.out.println("Cuentas obtenidas para CUI " + cuentasAsociadas); // 🔹 Depuración Final
    return cuentasAsociadas;
}

    private void cargarCuentasAsociadas(List<String> cuentas) {
        modelCuentasAsociadas.setRowCount(0);
        for (String cuenta : cuentas) {
            modelCuentasAsociadas.addRow(new Object[]{cuenta});
        }
    }

    private String getClienteCui() {
        txtcui.getText();
        return txtcui.getText();
    }

    
    public void agregardat() {
   ArrayList<ModeloRegistroUsuario> clientes = RegistroUsuario_1.listaClientes; 

DefaultTableModel modelo = (DefaultTableModel) tblCuentas.getModel(); 
modelo.setRowCount(0); // Limpiar tabla antes de agregar datos

for (ModeloRegistroUsuario usuario : clientes) {
    modelo.addRow(new Object[] { usuario.getCui(), usuario.getNombre(), usuario.getApellido() });
}

tblCuentas.setModel(modelo); // Asegurar que la tabla tenga el modelo actualizado
    }
    
}
