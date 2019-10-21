/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import logica.ControladorInterfaces;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import logica.Almacen;
import logica.Pedido;
import logica.Producto;

/**
 *
 * @author elias, Javiera Méndez
 */
public class ReporteProductos extends javax.swing.JFrame {
    private Almacen almacen;
    private ArrayList<Pedido> pedidos;
    /**
     * Creates new form PaginaPrincipalFX
     */
    public ReporteProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pedidos= new ArrayList<Pedido>();
    }

    public void setAlmacen(Almacen almacen) 
    {
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

        bVolver = new javax.swing.JButton();
        bGenerar = new javax.swing.JButton();
        txtSelecPeriodo = new javax.swing.JLabel();
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
        txtSelecPeriodo.setText("Reporte de los 10 Productos más vendidos en la última semana:");
        getContentPane().add(txtSelecPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 670, 250));

        panelSuperior.setBackground(new java.awt.Color(153, 197, 175));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo64x64.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("REPORTES PRODUCTOS");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addContainerGap(374, Short.MAX_VALUE))
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
        ControladorInterfaces.mostrarReporteProductos(false);
        ControladorInterfaces.mostrarPrincipal(true);
    }//GEN-LAST:event_bVolverActionPerformed

    private void bGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenerarActionPerformed
        DefaultCategoryDataset datosGrafica = new DefaultCategoryDataset();
        
        //Falta agregar datos a datosGrafica de la siguiente manera
        
        int cantidadDeDatos=1; //Meses, Productos, etc
        
        for (int i = 0; i < cantidadDeDatos; i++){
            datosGrafica.setValue(1000, "Panesito de Alfombra", "");
        }
        productosMasVendidos();
        //Acá se crea la gráfica (datos estáticos en la gráfica y se añaden los datos para cada barra al agregar datosGrafica)
        JFreeChart grafica = ChartFactory.createBarChart("" , "Producto", "Cantidad", datosGrafica);
        
        ChartPanel panelGrafica = new ChartPanel(grafica);
        jPanel1.add(panelGrafica);
        
        //Acá se indica la posición y el tamaño de la gráfica dentro del JPanel
        panelGrafica.setBounds(5, 5, 660, 240);       
        
        
    }//GEN-LAST:event_bGenerarActionPerformed

    private class ProductoFinalizado
    {
        private String nombre;
        private int cantidad;
        
        public ProductoFinalizado(String nombre, int cantidad)
        {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        public String getNombre() 
        {
            return nombre;
        }

        public void setNombre(String nombre)
        {
            this.nombre = nombre;
        }

        public int getCantidad() 
        {
            return cantidad;
        }

        public void setCantidad(int cantidad) 
        {
            this.cantidad = cantidad;
        }
        
        public void aumentarCantidad(int c)
        {
            cantidad += c;
        }
    }
       
    private void productosMasVendidos()
    {
        System.out.println(almacen.getPedidos().size());
        for(int i=0;i<almacen.getPedidos().size();i++){
            pedidos.add(almacen.getPedidos().get(i));
        } 
        System.out.println(pedidos.size());
        ArrayList<ProductoFinalizado> finalizados = new ArrayList<ProductoFinalizado>();
        System.out.println(pedidos.size());
        for(int i = 0; i < pedidos.size(); i++)
        {
            Pedido p = pedidos.get(i);
            if(p.getEstado().equals("Retirado"))
            {
                HashMap<Producto, Integer> prod = p.getProductos();
                for (Map.Entry<Producto, Integer> entry : prod.entrySet())
                {                   
                    int cantidad = entry.getValue();
                    Producto producto = entry.getKey();
                    String nombre = producto.getNombre();
                    System.out.println(nombre+" "+cantidad);
                    boolean loEncontro = false;
                    
                    for(int j = 0; j < finalizados.size(); j++)
                    {
                        ProductoFinalizado producto2 =  finalizados.get(j);
                        if(nombre.equals(producto2.getNombre()))
                        {
                            loEncontro = true;
                            producto2.aumentarCantidad(cantidad);
                        }
                    }
                    
                    if(loEncontro == false)
                    {
                        finalizados.add(new ProductoFinalizado(nombre, cantidad));
                    }
                }
            }
        }
        System.out.println("acaaaa"); 
        System.out.println(finalizados.size());
        
        for(int i = 0; i < finalizados.size(); i++)
        {
            for(int j=0; j<finalizados.size();j++){
                ProductoFinalizado aux=  finalizados.get(j);
                finalizados.remove(j);
                finalizados.add(i, aux);
            }
    
        }
    }
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
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGenerar;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel background;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtSelecPeriodo;
    // End of variables declaration//GEN-END:variables
}
