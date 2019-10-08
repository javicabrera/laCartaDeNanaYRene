/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import BaseDeDatos.GestionExcel;
import java.io.File;
import javax.swing.DefaultListModel;
import logica.Almacen;
import logica.ControladorInterfaces;
import logica.Pedido;

/**
 *
 * @author elias
 */
public class PaginaPrincipal extends javax.swing.JFrame {
    private static DefaultListModel model;
    private Almacen almacen;
    private GestionExcel ge;
    /**
     * Creates new form PaginaPrincipalFX
     */
    public PaginaPrincipal() {
        this.setLocationRelativeTo(null);
        //pedidos = new ArrayList<>();
        initComponents();
        this.model = new DefaultListModel();
        listaPedidos.setModel(this.model);
 
    }
    
    public static void agregarPedido(String s){
        PaginaPrincipal.model.addElement(s);
        
    }
    
    public void setAlmacen(Almacen almacen){
        this.almacen = almacen;
        for(Pedido p: almacen.getPedidos()){
            String cliente = p.getNombreCliente();
            String estado = "Estado: " + p.getEstado();
            PaginaPrincipal.agregarPedido(cliente);
            PaginaPrincipal.agregarPedido(estado);
        }
    }

    public void setGe(GestionExcel ge){
        this.ge = ge;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUPedidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPedidos = new javax.swing.JList<>();
        btnProductos = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnMateriasPrimas = new javax.swing.JButton();
        btnClientesHabituales = new javax.swing.JButton();
        btnElaborarReportes = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        SalirYExportar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUPedidos.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtUPedidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUPedidos.setText("Resumen Pedidos:");
        getContentPane().add(txtUPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, -1));

        listaPedidos.setBackground(new java.awt.Color(242, 242, 242));
        listaPedidos.setModel(new javax.swing.AbstractListModel<String>() {

            String[] strings = {"item 1"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }

        });
        jScrollPane1.setViewportView(listaPedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 220, 330));

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 200, 50));

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 200, 50));

        btnMateriasPrimas.setText("Materias Primas");
        btnMateriasPrimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasPrimasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMateriasPrimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 200, 50));

        btnClientesHabituales.setText("Clientes Habituales");
        getContentPane().add(btnClientesHabituales, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 200, 50));

        btnElaborarReportes.setText("Elaborar Reportes");
        btnElaborarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarReportesActionPerformed(evt);
            }
        });
        getContentPane().add(btnElaborarReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 200, 50));

        btnOtros.setText("Otras Opciones...");
        getContentPane().add(btnOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 200, 50));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("LA CARTA DE NANÁ Y RENÉ");

        SalirYExportar.setText("Salir");
        SalirYExportar.setActionCommand("SalirYExportar");
        SalirYExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirYExportar(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(SalirYExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SalirYExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        SalirYExportar.getAccessibleContext().setAccessibleName("SalirYExportar");

        getContentPane().add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoLargo.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 780, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed

        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarGestionaPedido(true);
        
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnMateriasPrimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasPrimasActionPerformed
        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarMateriasPrimas(true);
    }//GEN-LAST:event_btnMateriasPrimasActionPerformed

    private void btnElaborarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElaborarReportesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarProductos(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void SalirYExportar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirYExportar

        ge.setMateriasPrimas(almacen.getMateriasPrimas());
        ge.setPedidos(almacen.getPedidos());
        ge.setProductos(almacen.getProductos());
        
        File tProductos = new File("testProductos.xlsx");
        ge.exportarProductos(tProductos);
        File tPedidos = new File("testPedidos.xlsx");
        ge.exportarPedido(tPedidos);
        File tMateriasPrimas = new File("testMateriasPrimas.xlsx");
        ge.exportarMateriasPrimas(tMateriasPrimas);
        System.exit(0);
    }//GEN-LAST:event_SalirYExportar

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirYExportar;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnClientesHabituales;
    private javax.swing.JButton btnElaborarReportes;
    private javax.swing.JButton btnMateriasPrimas;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPedidos;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtUPedidos;
    // End of variables declaration//GEN-END:variables
}
