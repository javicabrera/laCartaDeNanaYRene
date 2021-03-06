/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import logica.Almacen;
import logica.ControladorInterfaces;
import logica.Pedido;
import logica.Producto;

/**
 *
 * @author elias
 */
public class VistaProductos extends javax.swing.JFrame {
    private Almacen almacen;
    private DefaultTableModel modeloTabla;
    
    /**
     * Creates new form PaginaPrincipalFX
     */
    public VistaProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Sólo permite seleccionar un elemento de la tabla
        tablaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modeloTabla = (DefaultTableModel) tablaProductos.getModel();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear.setText("+ Crear");
        btnCrear.setToolTipText("Crear nuevo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 120, 70));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 120, 70));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/basurero16.png"))); // NOI18N
        btnBorrar.setToolTipText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 30, 30));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/edit16.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 160, 30, 30));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/TresPuntos.png"))); // NOI18N
        btnInfo.setToolTipText("Ver detalle producto");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 30, 30));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio Venta", "Tiempo Elaboración (hrs)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setToolTipText("");
        jScrollPane.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 630, 300));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("PRODUCTOS");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(510, Short.MAX_VALUE))
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
                .addGap(17, 17, 17))
        );

        getContentPane().add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoLargo.jpg"))); // NOI18N
        background.setText("Volver");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        ControladorInterfaces.mostrarProductos(false);
        ControladorInterfaces.mostrarNuevoProducto(true);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ControladorInterfaces.mostrarProductos(false);
        ControladorInterfaces.mostrarPrincipal(true);      
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if(obtieneFilaSeleccionada()>=0){
            Producto producto = almacen.getProductos().get(obtieneFilaSeleccionada());
            ControladorInterfaces.mostrarProductos(false);
            ControladorInterfaces.mostrarEditarProducto(true, producto, obtieneFilaSeleccionada());
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if(obtieneFilaSeleccionada()>=0){
            if(JOptionPane.showConfirmDialog(this, "¿Desea eliminar el producto?", 
                    "Eliminar Producto", 0)==0){
                almacen.getProductos().get(obtieneFilaSeleccionada()).setDisponible(false);
                borrarFila(obtieneFilaSeleccionada());
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

        if(obtieneFilaSeleccionada()>=0){
            Producto producto = almacen.getProductos().get(obtieneFilaSeleccionada());
            ControladorInterfaces.mostrarDetalleProducto(true, producto);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto",
                "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
    }
    
    public void anadirFila(String nombre, int precioVenta, Double tiempoElab) {
        
        Object[] row = {nombre, "$"+precioVenta, tiempoElab};
        
        
        modeloTabla.addRow(row);
    }
    
    public void borrarFila(int fila){
         
         modeloTabla.removeRow(fila);
    }
   
    
    private int obtieneFilaSeleccionada(){
        
        return tablaProductos.getSelectedRow();
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        modeloTabla.setRowCount(0);
        this.almacen = almacen;
        for(Producto p: this.almacen.getProductos()){
            if(p.isDisponible()){
                anadirFila(p.getNombre(),p.getPrecioVenta(),p.getTiempoElaboracion());
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables


}
