package logica;


import InterfazGrafica.EditarMateriaPrima;
import InterfazGrafica.EditarProducto;
import InterfazGrafica.MateriasPrimas;
import InterfazGrafica.Pedidos;
import InterfazGrafica.NuevoPedido;
import InterfazGrafica.NuevoProducto;
import InterfazGrafica.PaginaPrincipal;
import InterfazGrafica.Productos;
import InterfazGrafica.NuevaMateriaPrima;

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
    private static Pedidos gestionaPedido;
    private static Productos productos;
    private static NuevoProducto nuevoProducto;
    private static EditarProducto editarProducto;
    private static MateriasPrimas materiasPrimas;
    private static EditarMateriaPrima editarMateriaPrima;
    private static NuevaMateriaPrima registarMateriaPrima;
        
    public ControladorInterfaces(Almacen almacen){
        this.principal = new PaginaPrincipal();
        this.nuevoPedido = new NuevoPedido();
        this.gestionaPedido = new Pedidos();
        this.gestionaPedido.setAlmacen(almacen);
        this.productos = new Productos();
        this.productos.setAlmacen(almacen);
        this.nuevoProducto = new NuevoProducto();
        this.editarProducto = new EditarProducto();
        this.materiasPrimas = new MateriasPrimas();
        this.materiasPrimas.setAlmacen(almacen);
        this.editarMateriaPrima = new EditarMateriaPrima();
        this.registarMateriaPrima = new NuevaMateriaPrima();
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
    
    public static void mostrarProductos(boolean b){
        ControladorInterfaces.productos.setVisible(b);
        ControladorInterfaces.productos.repaint();
    }
    
    public static void mostrarNuevoProducto(boolean b){
        ControladorInterfaces.nuevoProducto.setVisible(b);
        ControladorInterfaces.nuevoProducto.repaint();
    }
    
    public static void mostrarEditarProducto(boolean b, Producto producto){
        ControladorInterfaces.editarProducto.setVisible(b);
        ControladorInterfaces.editarProducto.setProducto(producto);
        ControladorInterfaces.editarProducto.repaint();
    }
    
    public static void mostrarMateriasPrimas(boolean b){
        ControladorInterfaces.materiasPrimas.setVisible(b);
        ControladorInterfaces.materiasPrimas.repaint();
    }
    
    public static void mostrarEditarMateriaPrima(boolean b, MateriaPrima materia){
        ControladorInterfaces.editarMateriaPrima.setVisible(b);
        ControladorInterfaces.editarMateriaPrima.setMateria(materia);
        ControladorInterfaces.editarMateriaPrima.repaint();
    }
    
    public static void mostrarRegistrarMateriaPrima(boolean b){
        ControladorInterfaces.registarMateriaPrima.setVisible(b);
        ControladorInterfaces.registarMateriaPrima.repaint();
    }

}
