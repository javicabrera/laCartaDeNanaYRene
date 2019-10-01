/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import javax.swing.JPanel;
import logica.ControladorInterfaces;

/**
 *
 * @author elias
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipalFX
     */
    public PaginaPrincipal() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSeleccioneOpcion = new javax.swing.JLabel();
        txtUPedidos = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnMateriasPrimas = new javax.swing.JButton();
        btnClientesHabituales = new javax.swing.JButton();
        btnElaborarReportes = new javax.swing.JButton();
        btnOtros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSeleccioneOpcion.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        txtSeleccioneOpcion.setText("Seleccione una Opción");
        getContentPane().add(txtSeleccioneOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        txtUPedidos.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtUPedidos.setText("Últimos Pedidos");
        getContentPane().add(txtUPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btnProductos.setText("Productos");
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 160, 100));

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 160, 100));

        btnMateriasPrimas.setText("Materias Primas");
        btnMateriasPrimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasPrimasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMateriasPrimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, 100));

        btnClientesHabituales.setText("Clientes Habituales");
        getContentPane().add(btnClientesHabituales, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 160, 100));

        btnElaborarReportes.setText("Elaborar Reportes");
        btnElaborarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElaborarReportesActionPerformed(evt);
            }
        });
        getContentPane().add(btnElaborarReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 160, 100));

        btnOtros.setText("Otras Opciones...");
        getContentPane().add(btnOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 160, 100));

        jList1.setBackground(new java.awt.Color(242, 242, 242));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 540));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("LA CARTA DE NANÁ Y RENÉ");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(icon)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(18, 18, 18))
        );

        getContentPane().add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo600x600.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed

        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarGestionaPedido(true);
        
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnMateriasPrimasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasPrimasActionPerformed
        
    }//GEN-LAST:event_btnMateriasPrimasActionPerformed

    private void btnElaborarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElaborarReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElaborarReportesActionPerformed

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
    private javax.swing.JLabel background;
    private javax.swing.JButton btnClientesHabituales;
    private javax.swing.JButton btnElaborarReportes;
    private javax.swing.JButton btnMateriasPrimas;
    private javax.swing.JButton btnOtros;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JLabel icon;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtSeleccioneOpcion;
    private javax.swing.JLabel txtUPedidos;
    // End of variables declaration//GEN-END:variables
}
