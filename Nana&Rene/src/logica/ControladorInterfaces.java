package logica;


import InterfazGrafica.GestionaPedido;
import InterfazGrafica.NuevoPedido;
import InterfazGrafica.PaginaPrincipal;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class ControladorInterfaces {
    private static PaginaPrincipal principal;
    private static NuevoPedido nuevoPedido;
    private static GestionaPedido gestionaPedido;
        
    public ControladorInterfaces(){
        this.principal = new PaginaPrincipal();
        this.nuevoPedido = new NuevoPedido();
        this.gestionaPedido = new GestionaPedido();
        
    }
    
    public static void iniciarInterfaz(){
        ControladorInterfaces.principal.setLocationRelativeTo(null);
        ControladorInterfaces.principal.setVisible(true);
        ControladorInterfaces.principal.repaint();
    }
    
    public static void mostrarPrincipal(boolean b){
        ControladorInterfaces.principal.setVisible(b);
        ControladorInterfaces.principal.repaint();
    }
    
    public static void mostrarNuevoPedido(boolean b){
        ControladorInterfaces.nuevoPedido.setVisible(b);
        ControladorInterfaces.nuevoPedido.repaint();
    }
    
    public static void mostrarGestionaPedido(boolean b){
        ControladorInterfaces.gestionaPedido.setVisible(b);
        ControladorInterfaces.gestionaPedido.repaint();
    }
}
