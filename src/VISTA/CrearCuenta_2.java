
package VISTA;

import Modelo.ModeloCrearCuenta;
import Modelo.ModeloRegistroUsuario;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import VISTA.RegistroUsuario_1;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;


public class CrearCuenta_2 extends javax.swing.JFrame{
    
    ArrayList <String>  listaClientes = new ArrayList<String>();
   public static  ArrayList<String>     listaCuentas = new ArrayList<String>();
    
    public CrearCuenta_2() {    
        initComponents();
    this.setTitle("Crear Cuenta");
    this.setLocationRelativeTo(null);
     // Asegurar que se llenen los clientes
     cargarClientesEnComboBox(); 

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboidcliente = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente");

        cboidcliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboidcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboidclienteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Crear");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cboidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        String clienteSeleccionado = (String) cboidcliente.getSelectedItem();
        
        if (clienteSeleccionado == null || clienteSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    // Extraer el CUI del cliente seleccionado (asumimos que está antes del '-')
        String cui = clienteSeleccionado.split(" - ")[0].trim();
        
    // Contar cuántas cuentas tiene el cliente seleccionado
    int cuentasDelCliente = contarCuentas(clienteSeleccionado);
    System.out.println("Cuentas del cliente: " + cuentasDelCliente); // Depuración
        
    if (cuentasDelCliente >= 3) {
        // Mostrar mensaje de advertencia si ya tiene 3 cuentas
        JOptionPane.showMessageDialog(this, 
            "No es posible crear más cuentas para el cliente seleccionado", 
            "Advertencia", 
            JOptionPane.WARNING_MESSAGE);
    } else {
        // Crear la cuenta
        int numeroCuenta = cuentasDelCliente + 1;
        String nuevaCuenta = "D2D025" + numeroCuenta + " " + clienteSeleccionado;

        listaCuentas.add(nuevaCuenta); // Agregar la cuenta a la lista

        // *** Agregar la cuenta al usuario en ModeloRegistroUsuario ***
        ModeloRegistroUsuario usuario = buscarUsuarioPorCUI(cui);
        if (usuario != null) {
            usuario.getListaCuentas().add(nuevaCuenta); // Asignar la cuenta al usuario
            System.out.println("Cuenta agregada correctamente a " + cui);
        } else {
            System.out.println("Error: Usuario no encontrado en ModeloRegistroUsuario.");
        }
        
        JOptionPane.showMessageDialog(this, 
            "Cuenta creada exitosamente", 
            "Información", 
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed
// Método para contar cuántas cuentas tiene un cliente en la lista
    private int contarCuentas(String cliente) {
        int contador = 0;
        for (String cuenta : listaCuentas) {
        String[] partes = cuenta.split(" "); // Dividir la cuenta en partes
        if (partes.length > 1 && cuenta.endsWith(cliente)) { // Comprobar si el cliente está al final
                contador++;
            }
        }
    System.out.println("Total de cuentas para el cliente '" + cliente + "': " + contador); // Depuración
        return contador;
    }

    private void cargarClientesEnComboBox() {
           RegistroUsuario_1 obj = new RegistroUsuario_1(); 
           ArrayList<String> cui = obj.llenarCui(); 
           ArrayList<String> nombre = obj.llenarNOMBRE();

           DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();

           if (cui.size() == nombre.size()) {
               for (int i = 0; i < cui.size(); i++) {
                   String cliente = cui.get(i) + " - " + nombre.get(i);
            listaClientes.add(cliente); // Agregar a la listaClientes
                   modelo.addElement(cliente);
               }
    } else {
        System.out.println("Error: Las listas cui y nombre tienen diferentes tamaños.");
           }

           cboidcliente.setModel(modelo);
       }



    private void cboidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboidclienteActionPerformed
    String seleccionado = (String) cboidcliente.getSelectedItem();
    System.out.println("Cliente seleccionado: " + seleccionado);
    }//GEN-LAST:event_cboidclienteActionPerformed
    

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
            java.util.logging.Logger.getLogger(CrearCuenta_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cboidcliente;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


public javax.swing.JComboBox<String> getComboClientes() {
    return cboidcliente;
}

public void actualizarListaClientes(List<String> clientes) {
    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
    for (String cliente : clientes) {
        modelo.addElement(cliente);
    }
    cboidcliente.setModel(modelo);
    cboidcliente.repaint();
    cboidcliente.revalidate();
}

public String getClienteSeleccionado() {
    return (String) cboidcliente.getSelectedItem();
}

public void mostrarMensaje(String mensaje, String tipo) {
    int tipoMensaje = tipo.equals("error") ? JOptionPane.ERROR_MESSAGE : JOptionPane.INFORMATION_MESSAGE;
    JOptionPane.showMessageDialog(this, mensaje, tipo, tipoMensaje);
}

public void addCrearCuentaListener(ActionListener listener) {
    jButton1.addActionListener(listener);
}



public void mostrarCuentasCliente(List<ModeloCrearCuenta.Cuenta> cuentas) {
    StringBuilder sb = new StringBuilder();
    for (ModeloCrearCuenta.Cuenta cuenta : cuentas) {
        sb.append("Cuenta ID: ").append(cuenta.getId())
          .append(" - Saldo: ").append(cuenta.getSaldo())
          .append("\n");
}
    JOptionPane.showMessageDialog(this, sb.toString(), "Cuentas del Cliente", JOptionPane.INFORMATION_MESSAGE);
}

 private ModeloRegistroUsuario buscarUsuarioPorCUI(String cui) {
        for (ModeloRegistroUsuario usuario : RegistroUsuario_1.listaClientes) {
            if (usuario.getCui().equals(cui)) {
                return usuario;
            }
        }
    return null; // Usuario no encontrado
    }



}
