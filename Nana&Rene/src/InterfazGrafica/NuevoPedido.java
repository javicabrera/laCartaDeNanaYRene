/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.ControladorInterfaces;
import logica.Pedido;
import logica.Producto;


/**
 *
 * @author elias
 */
public class NuevoPedido extends javax.swing.JFrame {
    private HashMap<String,Integer> productos;

    /**
     * Creates new form PaginaPrincipalFX
     */
    public NuevoPedido() {
        initComponents();
        productos = new HashMap<>();
        Producto p1 = new Producto("Torta", 2500, 3000);
        Producto p2 = new Producto("Pie de limon", 3000, 5000);
        boxProductos.addItem(p1.getNombre());
        boxProductos.addItem(p2.getNombre());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProducto = new javax.swing.JLabel();
        txtFechaSolicitud = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JLabel();
        txtCliente = new javax.swing.JLabel();
        txtNCliente = new javax.swing.JLabel();
        txtNumero = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        txtFechaRetiro = new javax.swing.JLabel();
        txtPrecioAbonado = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        fSolicitud = new javax.swing.JTextField();
        precioAbonado = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        descuento = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        fRetiro = new javax.swing.JTextField();
        boxProductos = new javax.swing.JComboBox<>();
        correo = new javax.swing.JTextField();
        boxCliente = new javax.swing.JComboBox<>();
        panelResumen = new javax.swing.JPanel();
        txtResumenPedido = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        precioTotal = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProducto.setText("Producto:");
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 40));

        txtFechaSolicitud.setText("Fecha Solicitud:");
        getContentPane().add(txtFechaSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtPrecioTotal.setText("Precio Total:");
        getContentPane().add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtDescuento.setText("Descuento:");
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 20));

        txtCliente.setText("Cliente:");
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 356, -1, 30));

        txtNCliente.setText("Nombre:");
        getContentPane().add(txtNCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 50));

        txtNumero.setText("Numero: ");
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 456, -1, 20));

        txtCantidad.setText("Cantidad");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, 20));

        txtFechaRetiro.setText("Fecha Retiro:");
        getContentPane().add(txtFechaRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        txtPrecioAbonado.setText("Precio Abonado:");
        getContentPane().add(txtPrecioAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 40));

        txtCorreo.setText("Correo:");
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, 30));

        fSolicitud.setText("dd/MM/aaaa");
        fSolicitud.setToolTipText("");
        fSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSolicitudActionPerformed(evt);
            }
        });
        getContentPane().add(fSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, -1));

        precioAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioAbonadoActionPerformed(evt);
            }
        });
        getContentPane().add(precioAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 190, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 320, -1));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 170, -1));
        getContentPane().add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 190, -1));
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 80, -1));

        fRetiro.setText("dd/MM/aaaa");
        getContentPane().add(fRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 190, -1));

        boxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProductosActionPerformed(evt);
            }
        });
        getContentPane().add(boxProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, -1));
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 240, -1));

        boxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 300, -1));

        panelResumen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelResumenLayout = new javax.swing.GroupLayout(panelResumen);
        panelResumen.setLayout(panelResumenLayout);
        panelResumenLayout.setHorizontalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        panelResumenLayout.setVerticalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(panelResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 180, 240));

        txtResumenPedido.setText("Resumen Pedido");
        getContentPane().add(txtResumenPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 100, 50));

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 100, 50));

        precioTotal.setText("3500");
        getContentPane().add(precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        btnAgregarProducto.setText("+");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 50, 30));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO PEDIDO");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(297, Short.MAX_VALUE))
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

        getContentPane().add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo600x600.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSolicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fSolicitudActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed

        ControladorInterfaces.mostrarNuevoPedido(false);
        ControladorInterfaces.mostrarGestionaPedido(true);
        
    }//GEN-LAST:event_bVolverActionPerformed

    private void boxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxProductosActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        String producto = (String) boxProductos.getSelectedItem();
        //buscar producto que coincide con nombre
        
        try{
            int cant = Integer.parseInt(cantidad.getText());
            productos.put(producto, cant);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
//        }
//        int total = 0;
//        for(Producto prod: productos.keySet()){
//            total+=prod.getPrecio();
//        }
//        precioTotal.setText(String.valueOf(total);
        
        
        
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        boolean flag2 = false;
        Date DateSolicitud = null;
        Date DateRetiro = null;
        int abono = 0;
        int dcto = 0;
        
        try{
            abono = Integer.parseInt(precioAbonado.getText());
            dcto = Integer.parseInt(descuento.getText());
            flag = true;
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
     
            try {
                DateSolicitud =  new SimpleDateFormat("dd/MM/yyyy").parse(this.fSolicitud.getText());
                DateRetiro =  new SimpleDateFormat("dd/MM/yyyy").parse(this.fRetiro.getText());
                flag2 = true;
            } catch (ParseException ex) {
                Logger.getLogger(NuevoPedido.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Debe ingresar una fecha válida",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (flag && flag2){
                                
//                Pedido p = new Pedido(productos, DateSolicitud, DateRetiro,
//                        Integer.parseInt(precioTotal.getText()),dcto,nombre.getText(), correo.getText(),
//                        numero.getText(), abono);
                System.out.println("Productos: ");
                for (Entry entry: productos.entrySet()) {
                    System.out.println(entry.getKey() + " - Cantidad: "+ entry.getValue());
                }
                System.out.println("Fecha solicitud: " + DateSolicitud);
                System.out.println("Precio abonado: " + abono);
                System.out.println("Descuento: " + dcto);
                System.out.println("Fecha retiro: " + DateRetiro);
                System.out.println("Nombre cliente: " + nombre.getText());
                System.out.println("Correo: " + correo.getText());
                System.out.println("Numero: " + numero.getText());
                PaginaPrincipal.agregarPedido(nombre.getText());
                ControladorInterfaces.mostrarNuevoPedido(false);
                ControladorInterfaces.mostrarGestionaPedido(true);
            }
        
        
        
        
    }//GEN-LAST:event_bGuardarActionPerformed

    private void precioAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioAbonadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioAbonadoActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPedido().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> boxCliente;
    private javax.swing.JComboBox<String> boxProductos;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField descuento;
    private javax.swing.JTextField fRetiro;
    private javax.swing.JTextField fSolicitud;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JPanel panelResumen;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField precioAbonado;
    private javax.swing.JLabel precioTotal;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtDescuento;
    private javax.swing.JLabel txtFechaRetiro;
    private javax.swing.JLabel txtFechaSolicitud;
    private javax.swing.JLabel txtNCliente;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtPrecioAbonado;
    private javax.swing.JLabel txtPrecioTotal;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JLabel txtResumenPedido;
    // End of variables declaration//GEN-END:variables
}
