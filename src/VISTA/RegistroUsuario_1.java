
package VISTA;

import Controlador.ControladorRegistroUsuario;
import Modelo.ModeloRegistroUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import VISTA.CrearCuenta_2;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Action;
import VISTA.BuscarCuentas_3;

public class RegistroUsuario_1 extends javax.swing.JFrame {
         
     private BuscarCuentas_3 buscarCuentasInstance;     
    public static ArrayList<ModeloRegistroUsuario> listaClientes = new ArrayList<>();
        
    
   private String ultimoMensaje;
    public RegistroUsuario_1() {
      BuscarCuentas_3 buscarCuentas = null;
        initComponents();
        this.setTitle("Crear Cliente");
        this.setLocationRelativeTo(null);
        this.buscarCuentasInstance = buscarCuentas;
        
        
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCuiUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtApellidoUsuario = new javax.swing.JTextField();
        BtnCrearUsuario = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Crear cliente");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUI");

        TxtCuiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCuiUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellido");

        BtnCrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        BtnCrearUsuario.setText("Crear");
        BtnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TxtCuiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCuiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(BtnCrearUsuario)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void BtnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearUsuarioActionPerformed
 
  String cui = TxtCuiUsuario.getText();
    String nombre = TxtNombreUsuario.getText();
    String apellido = TxtApellidoUsuario.getText();
    
 
    if(cui.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) {
        mostrarMensajeError("Todos los campos son obligatorios");
        return;
      }
    
    /* if (buscarCuentasInstance != null) {
        buscarCuentasInstance.getControlador().registrarCliente(cui, nombre, apellido);
    }*/
    // Usar el método crearUsuario que incluye validación de duplicados
    if(crearUsuario(cui, nombre, apellido)) {
        borrarFormCliente();
        llenarNOMBRE();
        System.out.println(listaClientes);
    }
        
        
    }//GEN-LAST:event_BtnCrearUsuarioActionPerformed
   public void borrarFormCliente() {
        TxtCuiUsuario.setText("");
        TxtNombreUsuario.setText("");
        TxtApellidoUsuario.setText("");
       
    }
     
   public ArrayList<String> llenarNOMBRE() {
    ArrayList<String> nombres = new ArrayList<>();
    
    // Llenar la lista con los nombres de los clientes registrados
    for (ModeloRegistroUsuario c : listaClientes) {
        nombres.add(c.getNombre());
    }
    
    return nombres; 
}
   
   
      public ArrayList<String> llenarCui() {
    ArrayList<String> cuis = new ArrayList<>();
    
    // Llenar la lista con los cui de los clientes registrados
    for (ModeloRegistroUsuario c : listaClientes) {
        cuis.add(c.getCui());
    }
    
    return cuis; 
}
     
      
       public ArrayList<String> llenarApellido() {
    ArrayList<String> apellido = new ArrayList<>();
    
    // Llenar la lista con los apellidos de los clientes registrados
    for (ModeloRegistroUsuario c : listaClientes) {
        apellido.add(c.getApellido());
    }
    
    return apellido; 
}
      
    private void TxtCuiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCuiUsuarioActionPerformed
        
         
        
    }//GEN-LAST:event_TxtCuiUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuario_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCrearUsuario;
    public javax.swing.JTextField TxtApellidoUsuario;
    public javax.swing.JTextField TxtCuiUsuario;
    public javax.swing.JTextField TxtNombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

     public void setPantallaPrincipal(PantallaPrincipal pantalla1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getTxtApellidoUsuario() {
          return TxtApellidoUsuario;
    }
    
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
   
    public javax.swing.JTextField getTxtCuiUsuario() {
        return TxtCuiUsuario;
    }
    
     public javax.swing.JTextField getTxtNombreUsuario() {
        return TxtNombreUsuario;
    }
     
     // Método para crear un nuevo usuario
public boolean crearUsuario(String cui, String nombre, String apellido) {
    if (existeUsuario(cui)) {
        mostrarMensajeError("El CUI ya está registrado");
        return false;
    }
    
    if(cui.length() != 13) { // Validación de formato de CUI
        mostrarMensajeError("El CUI debe tener 13 dígitos");
        return false;
    }
    
    listaClientes.add(new ModeloRegistroUsuario(cui, nombre, apellido));
    mostrarMensajeExito("Cliente creado exitosamente");
    return true;
}

    // Verifica si un usuario ya existe
    public boolean existeUsuario(String cui) {
        return listaClientes.stream().anyMatch(usuario -> usuario.getCui().equals(cui));
    }

    // Buscar un usuario por su CUI
    public ModeloRegistroUsuario buscarUsuarioPorCUI(String cui) {
        return listaClientes.stream()
                .filter(usuario -> usuario.getCui().equals(cui))
                .findFirst()
                .orElse(null);
    }
     
/*    private boolean validarCampos() {
    return !TxtCuiUsuario.getText().isEmpty() &&
           !TxtNombreUsuario.getText().isEmpty() &&
           !TxtApellidoUsuario.getText().isEmpty();
}*/
    
    
    public void registrarCuenta(String cui, String cuenta) {
    for (ModeloRegistroUsuario usuario : listaClientes) {
        if (usuario.getCui().equals(cui)) {
            usuario.agregarCuenta(cuenta); // 🔹 Agrega la cuenta al usuario
            System.out.println("✅ Cuenta " + cuenta + " agregada a " + cui);
            return;
        }
    }
    System.out.println("❌ No se encontró el CUI: " + cui);
}
    
    
    
    
    
    
}
