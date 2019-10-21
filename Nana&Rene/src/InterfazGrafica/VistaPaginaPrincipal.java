/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import BaseDeDatos.GestionExcel;
import java.awt.Component;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.timer.Timer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import logica.Almacen;
import logica.ControladorInterfaces;
import logica.Pedido;

/**
 *
 * @author elias
 */
public class VistaPaginaPrincipal extends javax.swing.JFrame {
    private static DefaultListModel model;
    private Almacen almacen;
    private GestionExcel ge;
    /**
     * Creates new form PaginaPrincipalFX
     */
    
    class ListEntry{
        private Pedido pedido;
        private ImageIcon icono;

        public ListEntry(Pedido pedido, ImageIcon icono) {
           this.pedido = pedido;
           this.icono = icono;
        }

        public Pedido getPedido() {
           return pedido;
        }

        public ImageIcon getIcono() {
           return icono;
        }

        @Override
        public String toString() {
            String pattern = "dd-MM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
           return "<html>"+ pedido.getNombreCliente() + 
                              "<br>Estado: " + pedido.getEstado() + 
                              "<br>Fecha Retiro: " + simpleDateFormat.
                                      format(pedido.getFechaRetiro()) + 
                              "<br>___________________________</span></html>";
        }
    }
    
    class ListEntryCellRenderer extends JLabel implements ListCellRenderer{
        private JLabel label;
  
        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                                                      int index, boolean isSelected,
                                                      boolean cellHasFocus) {
           ListEntry entry = (ListEntry) value;

           setText(entry.toString());
           setIcon(entry.getIcono());  
           setEnabled(list.isEnabled());
           setFont(list.getFont());

           return this;
        }
    }   
    
    public VistaPaginaPrincipal() {
        this.setLocationRelativeTo(null);
        initComponents();
        this.model = new DefaultListModel();
        listaPedidos.setModel(this.model);
        listaPedidos.setCellRenderer(new ListEntryCellRenderer());
 
    }
    
    public static void agregarPedido(ListEntry p)
    {
        VistaPaginaPrincipal.model.addElement(p);
        
    }
    
    public void setAlmacen(Almacen almacen){
        VistaPaginaPrincipal.model.clear();
        this.almacen = almacen;
        for(Pedido p: this.almacen.getPedidos()){
            ImageIcon icon = null;
            if(!p.getEstado().equals("Cancelado") && !p.getEstado().equals("Retirado") 
                    && !p.getEstado().equals("Finalizado") ){
                Date fechaActual = new Date();
                TimeUnit timeUnit = TimeUnit.DAYS;
                long diffInMillies = p.getFechaRetiro().getTime() - fechaActual.getTime();
                int diferencia = (int) timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
                if(diferencia>7){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario+7.png"));
                }
                else if(diferencia==7){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario7.png"));
                }
                else if(diferencia==6){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario6.png"));
                }
                else if(diferencia==5){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario5.png"));
                }
                else if(diferencia==4){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario4.png"));
                }
                else if(diferencia==3){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario3.png"));
                }
                else if(diferencia==2){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario2.png"));
                }
                else if(diferencia==1){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Calendario1.png"));
                }
                else if(diferencia<=0){
                    icon = new ImageIcon(getClass().getResource("/Recursos/Warning.png"));
                }
                VistaPaginaPrincipal.agregarPedido(new ListEntry(p,icon));
            }
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
        btnReporteVentas = new javax.swing.JButton();
        btnReporteProductos = new javax.swing.JButton();
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
        getContentPane().add(txtUPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        listaPedidos.setBackground(new java.awt.Color(242, 242, 242));
        listaPedidos.setModel(new javax.swing.AbstractListModel<String>() {

            String[] strings = {"item 1"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }

        });
        listaPedidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listaPedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 330));

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Productos.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 200, 50));

        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Pedidos.png"))); // NOI18N
        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 200, 50));

        btnMateriasPrimas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Leche.png"))); // NOI18N
        btnMateriasPrimas.setText("Materias Primas");
        btnMateriasPrimas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasPrimasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMateriasPrimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 200, 50));

        btnClientesHabituales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Clientes.png"))); // NOI18N
        btnClientesHabituales.setText("Clientes");
        btnClientesHabituales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesHabitualesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientesHabituales, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 200, 50));

        btnReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Reportes.png"))); // NOI18N
        btnReporteVentas.setText("Reporte Ventas");
        btnReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 200, 50));

        btnReporteProductos.setText("Reporte Productos");
        btnReporteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporteProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 200, 50));

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

    private void btnReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteVentasActionPerformed
        // TODO add your handling code here:
        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarReporteVentas(true);
    }//GEN-LAST:event_btnReporteVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarProductos(true);
        
    }//GEN-LAST:event_btnProductosActionPerformed

    private void SalirYExportar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirYExportar
        ControladorInterfaces.mostrarProxy(true, "Exportando datos");
        ge.setMateriasPrimas(almacen.getMateriasPrimas());
        ge.setPedidos(almacen.getPedidos());
        ge.setProductos(almacen.getProductos());
        ge.setClientes(almacen.getClientes());
        
        System.out.println("PRODUCTOS");
        File tProductos = new File("Productos.xlsx");        
        ge.exportarProductos(tProductos);
        System.out.println("PEDIDOS");
        File tPedidos = new File("Pedidos.xlsx");
        ge.exportarPedido(tPedidos);
        System.out.println("MATERIAS PRIMAS");
        File tMateriasPrimas = new File("MateriasPrimas.xlsx");
        ge.exportarMateriasPrimas(tMateriasPrimas);
        System.out.println("CLIENTES");
        File tClientes = new File("Clientes.xlsx");
        ge.exportarClientes(tClientes);
        System.exit(0);
    }//GEN-LAST:event_SalirYExportar

    private void btnClientesHabitualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesHabitualesActionPerformed
        // TODO add your handling code here:
        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarClientes(true);
    }//GEN-LAST:event_btnClientesHabitualesActionPerformed

    private void btnReporteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteProductosActionPerformed
        // TODO add your handling code here:
        ControladorInterfaces.mostrarPrincipal(false);
        ControladorInterfaces.mostrarReporteProductos(true);
    }//GEN-LAST:event_btnReporteProductosActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPaginaPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirYExportar;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnClientesHabituales;
    private javax.swing.JButton btnMateriasPrimas;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReporteProductos;
    private javax.swing.JButton btnReporteVentas;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPedidos;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtUPedidos;
    // End of variables declaration//GEN-END:variables
}
