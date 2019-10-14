/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import logica.Almacen;
import logica.Pedido;
import logica.ControladorInterfaces;
import logica.ControladorPedido;
import logica.EnviaCorreo;

/**
 *
 * @author elias
 */
public class VistaPedidos extends javax.swing.JFrame {
    private Almacen almacen;
    private ControladorPedido cp;
    private static DefaultTableModel modeloTabla;
    
    /**
     * Creates new form PaginaPrincipalFX
     */
    public VistaPedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cp = new ControladorPedido(almacen);
        modeloTabla = (DefaultTableModel) tablaPedidos.getModel();
        //Sólo permite seleccionar un elemento de la tabla
        tablaPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
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
        btnCancelar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnAbono = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        panelSuperior = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear.setText("+ Crear");
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

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancel16.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar Pedido");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 30, 30));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/next16.png"))); // NOI18N
        btnSiguiente.setToolTipText("Cambiar Estado");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 30, 30));

        btnAbono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/abono16.png"))); // NOI18N
        btnAbono.setToolTipText("Abonar");
        btnAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 30, 30));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info16.png"))); // NOI18N
        btnInfo.setToolTipText("Ver detalle de pedido");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 30, 30));

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Fecha Retiro", "Precio Total", "Por Pagar", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tablaPedidos);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 630, 300));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("PEDIDOS");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(558, Short.MAX_VALUE))
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
        ControladorInterfaces.mostrarNuevoPedido(true);
        ControladorInterfaces.mostrarGestionaPedido(false);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ControladorInterfaces.mostrarGestionaPedido(false);
        ControladorInterfaces.mostrarPrincipal(true);      
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed

        cp = new ControladorPedido(almacen);
        if(obtieneFilaSeleccionada()>=0){
            Pedido pedido = almacen.getPedidos().get(obtieneFilaSeleccionada());

            String estado = pedido.getEstado();
            String nuevo = "";
            switch (estado){
                case "Pendiente":
                    nuevo = "En proceso";
                    int caso = cp.elaborarPedido(pedido);
                    if(caso == 0){
                        aumentarEstadoPedido();
                    }
                    else if (caso == 1){
                        JOptionPane.showMessageDialog(this, "No se puede realizar "
                                + "el pedido, no se ha abonado el 50%.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else if (caso == 2){
                        JOptionPane.showMessageDialog(this, "No se puede realizar "
                                + "el pedido, no hay suficiente materia prima.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else if (caso == 3){
                        JOptionPane.showMessageDialog(this, "No se puede realizar "
                                + "el pedido, no se ha abonado el 50% ni hay suficiente "
                                + "materia prima.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "En proceso":
                    nuevo = "Finalizado";
                    aumentarEstadoPedido();
                    pedido.setEstado(nuevo);
                    String correo = pedido.getCorreoCliente();
                    String valorAPagar = String.valueOf(pedido.getPrecioTotal()-pedido.getPrecioAbonado());
                    String fechaRetiro = pedido.getFechaRetiro().toString();
                    EnviaCorreo.enviar(correo , valorAPagar, fechaRetiro);
                    break;
                case "Finalizado":
                    nuevo = "Retirado";
                    aumentarEstadoPedido();
                    pedido.setEstado(nuevo);
                    break;
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(obtieneFilaSeleccionada()>=0){
            if(JOptionPane.showConfirmDialog(this, "¿Desea cancelar el pedido?", 
                    "Cancelar Pedido", 0)==0){
                cancelarPedido();
                cp = new ControladorPedido(almacen);

                    Pedido pedido = almacen.getPedidos().get(obtieneFilaSeleccionada());
                    boolean abono = cp.cancelarPedido(pedido);
                    int abonado = pedido.getPrecioAbonado();
                    if (abono){
                        JOptionPane.showMessageDialog(this,"Se debe devolver el abono de: $"
                                + abonado + ".", "Cancelar Pedido", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"No se devuelve abono.",""
                                + "Cancelar Pedido", JOptionPane.INFORMATION_MESSAGE);
                    }
                    ArrayList<Pedido> aux = almacen.getPedidos();
                    
                    almacen.setPedidos(aux);
            }
        }
        else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

        if(obtieneFilaSeleccionada()>=0){
            Pedido pedido = almacen.getPedidos().get(obtieneFilaSeleccionada());
            ControladorInterfaces.mostrarDetallePedido(true, pedido);
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoActionPerformed
        if(obtieneFilaSeleccionada()>=0){
            try{
                int abono = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese valor a abonar: ", 
                    "Abonar", JOptionPane.QUESTION_MESSAGE));
                int totalAbono = this.almacen.getPedidos().get(obtieneFilaSeleccionada()).getPrecioAbonado()+abono;
                if(totalAbono<=this.almacen.getPedidos().get(obtieneFilaSeleccionada()).getPrecioTotal()){
                    ArrayList<Pedido> pedidos = this.almacen.getPedidos();
                    pedidos.get(obtieneFilaSeleccionada()).setPrecioAbonado(totalAbono);
                    this.almacen.setPedidos(pedidos);
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "El abono no puede ser mayor al total",
                    "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Debe ingresar un número válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        setAlmacen(almacen);
    }//GEN-LAST:event_btnAbonoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPedidos().setVisible(true);
            }
        });
    }

    public static void anadirFila(String cliente, String fechaRetiro, int precio, String porPagar,String estado) {
        
        Object[] row = {cliente, fechaRetiro, "$"+precio, porPagar, estado};
        
        modeloTabla.addRow(row);
    }
    
    private int obtieneFilaSeleccionada(){
        
        return tablaPedidos.getSelectedRow();
    }
    
    public void aumentarEstadoPedido(){
        
        int fila = tablaPedidos.getSelectedRow();
        
        if (fila==-1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (modeloTabla.getValueAt(fila, 3).equals("Pendiente")) {
            modeloTabla.setValueAt("En Proceso", fila, 3);
        }
        
        else if (modeloTabla.getValueAt(fila, 3).equals("En Proceso")) {
            modeloTabla.setValueAt("Finalizado", fila, 3);
        }
        else if (modeloTabla.getValueAt(fila, 3).equals("Finalizado")) {
            modeloTabla.setValueAt("Retirado", fila, 3);
        }
    }
    
    private void cancelarPedido(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPedidos.getModel();
        
        int fila = tablaPedidos.getSelectedRow();
        
        if (fila==-1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pedido",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        modeloTabla.setValueAt("Cancelado", fila, 3);
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
        
        modeloTabla.setRowCount(0);
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String textoPorPagar;
        for(Pedido p: this.almacen.getPedidos()){
            int porPagar = p.getPrecioTotal()-p.getPrecioAbonado();
            textoPorPagar="$"+String.valueOf(porPagar);
            if (porPagar==0)
                textoPorPagar="Pagado";
                
            anadirFila(p.getNombreCliente(), simpleDateFormat.format(p.getFechaRetiro()),p.getPrecioTotal(), textoPorPagar, p.getEstado());
        }
        
    }
    
    /*private void reiniciaTabla(){
        modeloTabla.setRowCount(0);
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for(Pedido p: this.almacen.getPedidos()){
            anadirFila(p.getNombreCliente(), simpleDateFormat.format(p.getFechaRetiro()),p.getPrecioTotal(), p.getPrecioTotal()-p.getPrecioAbonado(), p.getEstado());
        }
    }*/

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAbono;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

}
