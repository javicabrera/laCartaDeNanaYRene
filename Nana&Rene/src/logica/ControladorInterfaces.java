package logica;


import BaseDeDatos.GestionExcel;
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
    private static Almacen almacen;
    private static GestionExcel ge;
        
    public ControladorInterfaces(Almacen almacen, GestionExcel ge){
        this.almacen = almacen;
        this.ge = ge;
        this.principal = new PaginaPrincipal();
        this.nuevoPedido = new NuevoPedido();
        this.gestionaPedido = new Pedidos();
        this.productos = new Productos();
        this.nuevoProducto = new NuevoProducto();
        this.editarProducto = new EditarProducto();
        this.materiasPrimas = new MateriasPrimas();
        this.editarMateriaPrima = new EditarMateriaPrima();
        this.registarMateriaPrima = new NuevaMateriaPrima();
        
    }
    
    public static void iniciarInterfaz(){
        ControladorInterfaces.principal.setLocationRelativeTo(null);
        ControladorInterfaces.principal.setVisible(true);
        ControladorInterfaces.principal.setAlmacen(almacen);
        ControladorInterfaces.principal.setGe(ge);
        ControladorInterfaces.principal.repaint();
    }
    
    public static void mostrarPrincipal(boolean b){
        ControladorInterfaces.principal.setVisible(b);
        ControladorInterfaces.principal.setAlmacen(almacen);
        ControladorInterfaces.principal.setGe(ge);
        ControladorInterfaces.principal.repaint();
    }
    
    public static void mostrarNuevoPedido(boolean b){
        ControladorInterfaces.nuevoPedido.setVisible(b);
        ControladorInterfaces.nuevoPedido.setAlmacen(almacen);
        ControladorInterfaces.nuevoPedido.repaint();
    }
    
    public static void mostrarGestionaPedido(boolean b){
        ControladorInterfaces.gestionaPedido.setVisible(b);
        ControladorInterfaces.gestionaPedido.setAlmacen(almacen);
        ControladorInterfaces.gestionaPedido.repaint();
    }
    
    public static void mostrarProductos(boolean b){
        ControladorInterfaces.productos.setVisible(b);
        ControladorInterfaces.productos.setAlmacen(almacen);
        ControladorInterfaces.productos.repaint();
    }
    
    public static void mostrarNuevoProducto(boolean b){
        ControladorInterfaces.nuevoProducto.setVisible(b);
        ControladorInterfaces.nuevoProducto.setAlmacen(almacen);
        ControladorInterfaces.nuevoProducto.repaint();
    }
    
    public static void mostrarEditarProducto(boolean b, Producto producto){
        ControladorInterfaces.editarProducto.setVisible(b);
        ControladorInterfaces.editarProducto.setProducto(producto);
        ControladorInterfaces.editarProducto.setAlmacen(almacen);
        ControladorInterfaces.editarProducto.repaint();
    }
    
    public static void mostrarMateriasPrimas(boolean b){
        ControladorInterfaces.materiasPrimas.setVisible(b);
        ControladorInterfaces.materiasPrimas.setAlmacen(almacen);
        ControladorInterfaces.materiasPrimas.repaint();
    }
    
    public static void mostrarEditarMateriaPrima(boolean b, MateriaPrima materia){
        ControladorInterfaces.editarMateriaPrima.setVisible(b);
        ControladorInterfaces.editarMateriaPrima.setMateria(materia);
        ControladorInterfaces.editarMateriaPrima.repaint();
    }
    
    public static void mostrarRegistrarMateriaPrima(boolean b){
        ControladorInterfaces.registarMateriaPrima.setVisible(b);
        ControladorInterfaces.registarMateriaPrima.setAlmacen(almacen);
        ControladorInterfaces.registarMateriaPrima.repaint();
    }

}
