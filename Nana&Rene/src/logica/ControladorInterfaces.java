package logica;


import BaseDeDatos.GestionExcel;
import InterfazGrafica.ReporteProductos;
import InterfazGrafica.ReporteVentas;
import InterfazGrafica.VistaDetallePedido;
import InterfazGrafica.VistaClientes;
import InterfazGrafica.VistaEditarCliente;
import InterfazGrafica.VistaEditarMateriaPrima;
import InterfazGrafica.VistaEditarProducto;
import InterfazGrafica.VistaMateriasPrimas;
import InterfazGrafica.VistaPedidos;
import InterfazGrafica.VistaNuevoPedido;
import InterfazGrafica.VistaNuevoProducto;
import InterfazGrafica.VistaPaginaPrincipal;
import InterfazGrafica.VistaProductos;
import InterfazGrafica.VistaNuevaMateriaPrima;
import InterfazGrafica.VistaNuevoCliente;
import InterfazGrafica.VistaDetalleProducto;
import InterfazGrafica.VistaHistorialCliente;

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
    private static VistaPaginaPrincipal principal;
    private static VistaNuevoPedido nuevoPedido;
    private static VistaPedidos gestionaPedido;
    private static VistaProductos productos;
    private static VistaNuevoProducto nuevoProducto;
    private static VistaEditarProducto editarProducto;
    private static VistaMateriasPrimas materiasPrimas;
    private static VistaEditarMateriaPrima editarMateriaPrima;
    private static VistaNuevaMateriaPrima registarMateriaPrima;
    private static VistaDetallePedido vistaDetallePedido;
    private static VistaHistorialCliente vistaHistorialCliente;
    private static VistaDetalleProducto vistaDetalleProducto;
    private static VistaClientes clientes;
    private static VistaEditarCliente editarCliente;
    private static VistaNuevoCliente nuevoCliente;
    private static ReporteVentas reporteVentas;
    private static ReporteProductos reporteProductos;
    private static Almacen almacen;
    private static GestionExcel ge;
        
    public ControladorInterfaces(Almacen almacen, GestionExcel ge){
        this.almacen = almacen;
        this.ge = ge;
        this.principal = new VistaPaginaPrincipal();
//        this.principal.setAlmacen(almacen);
//        this.principal.setGe(ge);
        this.nuevoPedido = new VistaNuevoPedido();
        //this.nuevoPedido.setAlmacen(almacen);
        this.gestionaPedido = new VistaPedidos();
        //this.gestionaPedido.setAlmacen(almacen);
        this.productos = new VistaProductos();
        //this.productos.setAlmacen(almacen);
        this.nuevoProducto = new VistaNuevoProducto();
        //this.nuevoProducto.setAlmacen(almacen);
        this.editarProducto = new VistaEditarProducto();
        //this.editarProducto.setAlmacen(almacen);
        this.materiasPrimas = new VistaMateriasPrimas();
        //this.materiasPrimas.setAlmacen(almacen);
        this.editarMateriaPrima = new VistaEditarMateriaPrima();
        this.registarMateriaPrima = new VistaNuevaMateriaPrima();
        //this.registarMateriaPrima.setAlmacen(almacen);
        this.vistaDetallePedido = new VistaDetallePedido();
        this.vistaDetalleProducto = new VistaDetalleProducto();
        this.clientes = new VistaClientes();
        this.editarCliente = new VistaEditarCliente();
        this.nuevoCliente = new VistaNuevoCliente();
        this.vistaHistorialCliente = new VistaHistorialCliente();
        this.reporteVentas = new ReporteVentas();
        this.reporteProductos = new ReporteProductos();
        
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
    
    public static void mostrarEditarProducto(boolean b, Producto producto, int fila){
        ControladorInterfaces.editarProducto.setVisible(b);
        ControladorInterfaces.editarProducto.setProducto(producto);
        ControladorInterfaces.editarProducto.setFila(fila);
        ControladorInterfaces.editarProducto.setAlmacen(almacen);
        ControladorInterfaces.editarProducto.repaint();
    }
    
    public static void mostrarMateriasPrimas(boolean b){
        ControladorInterfaces.materiasPrimas.setVisible(b);
        ControladorInterfaces.materiasPrimas.setAlmacen(almacen);
        ControladorInterfaces.materiasPrimas.repaint();
    }
    
    public static void mostrarEditarMateriaPrima(boolean b, MateriaPrima materia,
            int fila){
        ControladorInterfaces.editarMateriaPrima.setVisible(b);
        ControladorInterfaces.editarMateriaPrima.setMateria(materia);
        ControladorInterfaces.editarMateriaPrima.setFila(fila);
        ControladorInterfaces.editarMateriaPrima.repaint();
    }
    
    public static void mostrarRegistrarMateriaPrima(boolean b){
        ControladorInterfaces.registarMateriaPrima.setVisible(b);
        ControladorInterfaces.registarMateriaPrima.setAlmacen(almacen);
        ControladorInterfaces.registarMateriaPrima.repaint();
    }
    
    public static void mostrarDetallePedido(boolean b, Pedido pedido){
        ControladorInterfaces.habilitarGestionaPedido(false);
        ControladorInterfaces.vistaDetallePedido.setVisible(b);
        ControladorInterfaces.vistaDetallePedido.inicializaTabla(pedido);
        ControladorInterfaces.vistaDetallePedido.repaint();
    }
    
    public static void mostrarHistorialCliente(boolean b, Cliente cliente){
        ControladorInterfaces.habilitarClientes(false);
        ControladorInterfaces.vistaHistorialCliente.setVisible(b);
        ControladorInterfaces.vistaHistorialCliente.inicializaTabla(cliente);
        ControladorInterfaces.vistaHistorialCliente.repaint();
    }
    
    public static void mostrarDetalleProducto(boolean b, Producto producto){
        ControladorInterfaces.habilitarGestionaProducto(false);
        ControladorInterfaces.vistaDetalleProducto.setVisible(b);
        ControladorInterfaces.vistaDetalleProducto.inicializaTabla(producto);
        ControladorInterfaces.vistaDetalleProducto.repaint();
    }
    
    public static void habilitarClientes(boolean b){
        ControladorInterfaces.clientes.enable(b);
    }
    
    public static void habilitarGestionaPedido(boolean b){
        ControladorInterfaces.gestionaPedido.enable(b);
    }
    
    public static void habilitarGestionaProducto(boolean b){
        ControladorInterfaces.productos.enable(b);
    }

    
    public static void mostrarClientes(boolean b){
        ControladorInterfaces.clientes.setVisible(b);
        ControladorInterfaces.clientes.setAlmacen(almacen);
        ControladorInterfaces.clientes.repaint();
    }
    
    public static void mostrarEditarCliente(boolean b, Cliente cliente, int fila){
        ControladorInterfaces.editarCliente.setVisible(b);
        ControladorInterfaces.editarCliente.setCliente(cliente);
        ControladorInterfaces.editarCliente.setFila(fila);
        ControladorInterfaces.editarCliente.setAlmacen(almacen);
        ControladorInterfaces.editarCliente.repaint();
    }
    
    public static void mostrarNuevoCliente(boolean b){
        ControladorInterfaces.nuevoCliente.setVisible(b);
        ControladorInterfaces.nuevoCliente.setAlmacen(almacen);
        ControladorInterfaces.nuevoCliente.repaint();
    }
    
    public static void mostrarReporteVentas(boolean b){
        ControladorInterfaces.reporteVentas.setVisible(b);
        //ControladorInterfaces.reporteVentas.setAlmacen(almacen);
        ControladorInterfaces.reporteVentas.repaint();
    }
    
    public static void mostrarReporteProductos(boolean b){
        ControladorInterfaces.reporteProductos.setVisible(b);
        //ControladorInterfaces.reporteProductos.setAlmacen(almacen);
        ControladorInterfaces.reporteProductos.repaint();
    }
    
}
