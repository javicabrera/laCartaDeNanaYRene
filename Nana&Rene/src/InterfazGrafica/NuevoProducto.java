/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import logica.Almacen;
import logica.ControladorInterfaces;
import logica.Producto;
import logica.MateriaPrima;


/**
 *
 * @author elias
 */
public class NuevoProducto extends javax.swing.JFrame {
    private HashMap<MateriaPrima,Integer> materias;
    private InfoPanel infoPanel;
    private Almacen almacen;

    /**
     * Creates new form PaginaPrincipalFX
     */
    public NuevoProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        materias = new HashMap<>();
        
        infoPanel = new InfoPanel();
        panelMateriasPrimas.setLayout(new GridLayout(0,1));
        panelMateriasPrimas.setPreferredSize(new Dimension(180,250));
        panelMateriasPrimas.add(infoPanel.getPanelDatos());
    }
    
    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
        for(MateriaPrima materia: almacen.getMateriasPrimas()){
            boxMateriaPrima.addItem(materia.getNombre());
        }
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
        txtPrecioVenta = new javax.swing.JLabel();
        txtTiempoElab = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        txtMateriaPrima = new javax.swing.JLabel();
        precioVenta = new javax.swing.JTextField();
        tiempoElab = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        boxMateriaPrima = new javax.swing.JComboBox<>();
        panelMateriasPrimas = new javax.swing.JPanel();
        txtMateriasPrimas = new javax.swing.JPanel();
        materiasPrimas = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        btnAgregarMPrima = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtNombre.setText("Nombre:");
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        txtPrecioVenta.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtPrecioVenta.setText("Precio de Venta:");
        getContentPane().add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        txtTiempoElab.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtTiempoElab.setText("Tiempo de Elaboración:");
        getContentPane().add(txtTiempoElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        txtCantidad.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtCantidad.setText("Cantidad:");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, 20));

        txtMateriaPrima.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtMateriaPrima.setText("Materia Prima:");
        getContentPane().add(txtMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        precioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaActionPerformed(evt);
            }
        });
        getContentPane().add(precioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 350, -1));
        getContentPane().add(tiempoElab, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 350, -1));
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 80, -1));

        boxMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMateriaPrimaActionPerformed(evt);
            }
        });
        getContentPane().add(boxMateriaPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, -1));

        panelMateriasPrimas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelMateriasPrimasLayout = new javax.swing.GroupLayout(panelMateriasPrimas);
        panelMateriasPrimas.setLayout(panelMateriasPrimasLayout);
        panelMateriasPrimasLayout.setHorizontalGroup(
            panelMateriasPrimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMateriasPrimasLayout.setVerticalGroup(
            panelMateriasPrimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        getContentPane().add(panelMateriasPrimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 180, 190));

        txtMateriasPrimas.setBackground(new java.awt.Color(255, 255, 255));

        materiasPrimas.setText("Materias Primas");

        javax.swing.GroupLayout txtMateriasPrimasLayout = new javax.swing.GroupLayout(txtMateriasPrimas);
        txtMateriasPrimas.setLayout(txtMateriasPrimasLayout);
        txtMateriasPrimasLayout.setHorizontalGroup(
            txtMateriasPrimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtMateriasPrimasLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(materiasPrimas)
                .addGap(39, 39, 39))
        );
        txtMateriasPrimasLayout.setVerticalGroup(
            txtMateriasPrimasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMateriasPrimasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(materiasPrimas)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(txtMateriasPrimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 180, 30));

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

        btnAgregarMPrima.setText("+");
        btnAgregarMPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMPrimaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarMPrima, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 40, 30));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 350, -1));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("NUEVO PRODUCTO");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(429, Short.MAX_VALUE))
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

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        materias = new HashMap<>();
        precioVenta.setText("");
        tiempoElab.setText("");
        nombre.setText("");
        ControladorInterfaces.mostrarNuevoProducto(false);
        ControladorInterfaces.mostrarProductos(true);
    }//GEN-LAST:event_bVolverActionPerformed

    private void boxMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMateriaPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMateriaPrimaActionPerformed

    private void btnAgregarMPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMPrimaActionPerformed
        String nombreMateria = (String) boxMateriaPrima.getSelectedItem();
        MateriaPrima materia = null;
        for(MateriaPrima m : almacen.getMateriasPrimas()){
            if(m.getNombre().equals(materia)){
                materia = m;
                break;
            }
        }
        try{
            int cant = Integer.parseInt(cantidad.getText());
            materias.put(materia, cant);
            infoPanel.agregaProductoOrMatPrima(nombreMateria, cant);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        super.paintComponents(this.getGraphics());
    }//GEN-LAST:event_btnAgregarMPrimaActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        
        String nombreProd = nombre.getText();
        boolean flag1 = true;
        boolean flag2 = true;
        if (nombreProd.equals("") || nombreProd == null){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.","Error", 
                    JOptionPane.ERROR_MESSAGE);
            flag1 = false;
        }
        if(materias.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos una materia"
                    + "prima.","Error", 
                    JOptionPane.ERROR_MESSAGE);
            flag2 = false;
        }
        if (flag1 && flag2){
            try{
                int precio = Integer.parseInt(precioVenta.getText());
                int tiempo = Integer.parseInt(tiempoElab.getText());
                Producto p = new Producto(nombreProd, precio, tiempo, materias);
                ArrayList<Producto> prodAux = almacen.getProductos();
                prodAux.add(p);
                almacen.setProductos(prodAux);
                JOptionPane.showMessageDialog(this, "Guardado exitosamente",
                        "Guardado", JOptionPane.INFORMATION_MESSAGE);
                materias = new HashMap<>();
                precioVenta.setText("");
                tiempoElab.setText("");
                nombre.setText("");
                ControladorInterfaces.mostrarNuevoProducto(false);
                ControladorInterfaces.mostrarProductos(true);
                
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Debe ingresar un numero válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new NuevoProducto().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> boxMateriaPrima;
    private javax.swing.JButton btnAgregarMPrima;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel materiasPrimas;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelMateriasPrimas;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JTextField tiempoElab;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtMateriaPrima;
    private javax.swing.JPanel txtMateriasPrimas;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecioVenta;
    private javax.swing.JLabel txtTiempoElab;
    // End of variables declaration//GEN-END:variables
}
