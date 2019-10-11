/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.ControladorInterfaces;
import logica.Almacen;
import logica.Cliente;


/**
 *
 * @author elias
 */
public class VistaNuevoCliente extends javax.swing.JFrame {
    private Almacen almacen;

    /**
     * Creates new form PaginaPrincipalFX
     */
    public VistaNuevoCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        bVolver = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtNombre.setText("Nombre:");
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoKeyPressed(evt);
            }
        });
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 510, -1));

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, 50));

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 100, 50));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 510, -1));

        txtTelefono.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtTelefono.setText("Numero Telefónico:");
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        txtCorreo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtCorreo.setText("Correo Electrónico:");
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 510, -1));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO CLIENTE");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(470, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(18, 18, 18))
        );

        getContentPane().add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoLargo.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @author renecsc
     * @param evt 
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        ControladorInterfaces.mostrarNuevoCliente(false);
        ControladorInterfaces.mostrarClientes(true);

        correo.setText("");
        nombre.setText("");
        telefono.setText("");
    }//GEN-LAST:event_bVolverActionPerformed

    /**
     * @author renecsc
     * @param evt 
     */
    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed

        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        String nombreC = null;
        String correoC = null;
        String telefonoC = null;
        
        if(nombre.getText().length() == 0)
        {
            flag1 = false;
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(!correo.getText().matches("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un correo válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            flag2 =false;
        }
        if(!(telefono.getText().length() == 9 && telefono.getText().charAt(0) == '9')){
            JOptionPane.showMessageDialog(this, "Ingrese un número de teléfono válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            flag3 = false;
        }

        if (flag1 && flag2 && flag3)
        {
            String[] tel = telefono.getText().split("");
            String nuevoTelefono = "";
            for(int i = 0; i < tel.length; i++)
            {
                if(i == 0)
                {
                    nuevoTelefono = tel[i]+"-";
                }
                else{
                    nuevoTelefono+= tel[i];
                }
            }
            Cliente c = new Cliente(nombre.getText(), correo.getText(), nuevoTelefono);
            
            ArrayList<Cliente> aux = almacen.getClientes();
            aux.add(c);
            almacen.setClientes(aux);
            JOptionPane.showMessageDialog(this, "Guardado exitosamente","Guardado", JOptionPane.INFORMATION_MESSAGE);
            
            correo.setText("");
            nombre.setText("");
            telefono.setText("");
            
            ControladorInterfaces.mostrarNuevoCliente(false);
            ControladorInterfaces.mostrarClientes(true);
        }                      
    }//GEN-LAST:event_bGuardarActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyPressed
        
    }//GEN-LAST:event_correoKeyPressed

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
            java.util.logging.Logger.getLogger(VistaNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaNuevoCliente().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel background;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTelefono;
    // End of variables declaration//GEN-END:variables
}
