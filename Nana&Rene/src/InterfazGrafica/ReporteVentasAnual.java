/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import logica.ControladorInterfaces;
import logica.MateriaPrima;
import logica.Almacen;
import logica.Cliente;
import logica.Pedido;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author elias
 */
public class ReporteVentasAnual extends javax.swing.JFrame {
    /**
     * Creates new form PaginaPrincipalFX
     */
    
    public ReporteVentasAnual() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bVolver = new javax.swing.JButton();
        bGenerar = new javax.swing.JButton();
        txtSelecPeriodo = new javax.swing.JLabel();
        periodo = new javax.swing.JComboBox<>();
        txtIngresAno = new javax.swing.JLabel();
        anoConsulta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, 50));

        bGenerar.setText("Generar");
        bGenerar.setToolTipText("Guardar este cliente");
        bGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(bGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 100, 50));

        txtSelecPeriodo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtSelecPeriodo.setText("Seleccione periodo:");
        getContentPane().add(txtSelecPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Semestral", "Mensual" }));
        periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoActionPerformed(evt);
            }
        });
        getContentPane().add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, -1));

        txtIngresAno.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtIngresAno.setText("Ingrese año:");
        getContentPane().add(txtIngresAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        anoConsulta.setToolTipText("Ingrese número telefónico");
        anoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(anoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 490, 240));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("REPORTES VENTAS");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(433, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_bVolverActionPerformed

    private void bGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenerarActionPerformed
        
        DefaultCategoryDataset datosGrafica = new DefaultCategoryDataset();
        
        //Falta agregar datos a datosGrafica de la siguiente manera
        
        int cantidadDeDatos=1; //Meses, Productos, etc
        
        for (int i = 0; i < cantidadDeDatos; i++){
            datosGrafica.setValue(1000, "Enero", "");
        }

        //Acá se crea la gráfica (datos estáticos en la gráfica y se añaden los datos para cada barra al agregar datosGrafica)
        JFreeChart grafica = ChartFactory.createBarChart("Ventas "+anoConsulta.getText() , "Mes", "Pesos Chilenos", datosGrafica);
        
        ChartPanel panelGrafica = new ChartPanel(grafica);
        jPanel1.add(panelGrafica);
        
        //Acá se indica la posición y el tamaño de la gráfica dentro del JPanel
        panelGrafica.setBounds(5, 5, 480, 230);
                                   
    }//GEN-LAST:event_bGenerarActionPerformed

    private void periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoActionPerformed

    private void anoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteVentasAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteVentasAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteVentasAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteVentasAnual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteVentasAnual().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoConsulta;
    private javax.swing.JButton bGenerar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel background;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JComboBox<String> periodo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtIngresAno;
    private javax.swing.JLabel txtSelecPeriodo;
    // End of variables declaration//GEN-END:variables
}
