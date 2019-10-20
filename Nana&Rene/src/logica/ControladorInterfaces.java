package logica;


import BaseDeDatos.GestionExcel;
import InterfazGrafica.Proxy;
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

/**
 * Clase que controla las vistas y las transiciones entre ellas
 * @author elias
 */
public class ControladorInterfaces {
    //Se declaran todas las vistas que utiliza el sistema
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
    private static Proxy proxy;
    
    /**
     * Constructor
     * @param almacen
     * @param ge 
     */    
    public ControladorInterfaces(Almacen almacen, GestionExcel ge){
        this.almacen = almacen;
        this.ge = ge;
        this.principal = new VistaPaginaPrincipal();
        this.nuevoPedido = new VistaNuevoPedido();
        this.gestionaPedido = new VistaPedidos();
        this.productos = new VistaProductos();
        this.nuevoProducto = new VistaNuevoProducto();
        this.editarProducto = new VistaEditarProducto();
        this.materiasPrimas = new VistaMateriasPrimas();
        this.editarMateriaPrima = new VistaEditarMateriaPrima();
        this.registarMateriaPrima = new VistaNuevaMateriaPrima();
        this.vistaDetallePedido = new VistaDetallePedido();
        this.vistaDetalleProducto = new VistaDetalleProducto();
        this.clientes = new VistaClientes();
        this.editarCliente = new VistaEditarCliente();
        this.nuevoCliente = new VistaNuevoCliente();
        this.vistaHistorialCliente = new VistaHistorialCliente();
        this.reporteVentas = new ReporteVentas();
        this.reporteProductos = new ReporteProductos();
        this.proxy = new Proxy();
        
    }
    /**
     * Inicia la interfaz con la vista principal.
     */
    public static void iniciarInterfaz(){
        ControladorInterfaces.principal.setLocationRelativeTo(null);
        ControladorInterfaces.principal.setVisible(true);
        ControladorInterfaces.principal.setAlmacen(almacen);
        ControladorInterfaces.principal.setGe(ge);
        ControladorInterfaces.principal.repaint();
    }
    /**
     * Muestra u oculta la vista principal
     * @param b 
     */
    public static void mostrarPrincipal(boolean b){
        ControladorInterfaces.principal.setVisible(b);
        ControladorInterfaces.principal.setAlmacen(almacen);
        ControladorInterfaces.principal.setGe(ge);
        ControladorInterfaces.principal.repaint();
    }
    /**
     * Muestra u oculta la vista de Nuevo pedido
     * @param b 
     */
    public static void mostrarNuevoPedido(boolean b){
        ControladorInterfaces.nuevoPedido.setVisible(b);
        ControladorInterfaces.nuevoPedido.setAlmacen(almacen);
        ControladorInterfaces.nuevoPedido.repaint();
    }
    /**
     * Muestra u oculta la vista de gestionar pedido
     * @param b 
     */
    public static void mostrarGestionaPedido(boolean b){
        ControladorInterfaces.gestionaPedido.setVisible(b);
        ControladorInterfaces.gestionaPedido.setAlmacen(almacen);
        ControladorInterfaces.gestionaPedido.repaint();
    }
    
    /**
     * Muestra u oculta la vista de mensaje que muestra el espere
     * @param b true o false, depende si se quiere mostrar u ocultar
     * @param mensaje mensaje que se mostrara
     */
    public static void mostrarProxy(boolean b, String mensaje){
        ControladorInterfaces.proxy.setVisible(b);
        ControladorInterfaces.proxy.setMensaje(mensaje);
        ControladorInterfaces.proxy.repaint();
    }
    /**
     * Muestra u oculta la vista de productos
     * @param b 
     */
    public static void mostrarProductos(boolean b){
        ControladorInterfaces.productos.setVisible(b);
        ControladorInterfaces.productos.setAlmacen(almacen);
        ControladorInterfaces.productos.repaint();
    }
    /**
     * Muestra u oculta la vista de nuevo producto
     * @param b 
     */
    public static void mostrarNuevoProducto(boolean b){
        ControladorInterfaces.nuevoProducto.setVisible(b);
        ControladorInterfaces.nuevoProducto.setAlmacen(almacen);
        ControladorInterfaces.nuevoProducto.repaint();
    }
    /**
     * Muestra u oculta la vista de editar producto
     * @param b
     * @param producto
     * @param fila 
     */
    public static void mostrarEditarProducto(boolean b, Producto producto, int fila){
        ControladorInterfaces.editarProducto.setVisible(b);
        ControladorInterfaces.editarProducto.setProducto(producto);
        ControladorInterfaces.editarProducto.setFila(fila);
        ControladorInterfaces.editarProducto.setAlmacen(almacen);
        ControladorInterfaces.editarProducto.repaint();
    }
    /**
     * Muestra u oculta la vista de materias primas
     * @param b 
     */
    public static void mostrarMateriasPrimas(boolean b){
        ControladorInterfaces.materiasPrimas.setVisible(b);
        ControladorInterfaces.materiasPrimas.setAlmacen(almacen);
        ControladorInterfaces.materiasPrimas.repaint();
    }
    /**
     * Muestra u oculta la vista de editar materia prima
     * @param b
     * @param materia
     * @param fila 
     */
    public static void mostrarEditarMateriaPrima(boolean b, MateriaPrima materia,
            int fila){
        ControladorInterfaces.editarMateriaPrima.setVisible(b);
        ControladorInterfaces.editarMateriaPrima.setMateria(materia);
        ControladorInterfaces.editarMateriaPrima.setFila(fila);
        ControladorInterfaces.editarMateriaPrima.repaint();
    }
    /**
     * Muestra u oculta la vista de registrar materia prima
     * @param b 
     */
    public static void mostrarRegistrarMateriaPrima(boolean b){
        ControladorInterfaces.registarMateriaPrima.setVisible(b);
        ControladorInterfaces.registarMateriaPrima.setAlmacen(almacen);
        ControladorInterfaces.registarMateriaPrima.repaint();
    }
    /**
     * Muestra u oculta la vista de detalle pedido
     * @param b
     * @param pedido 
     */
    public static void mostrarDetallePedido(boolean b, Pedido pedido){
        ControladorInterfaces.habilitarGestionaPedido(false);
        ControladorInterfaces.vistaDetallePedido.setVisible(b);
        ControladorInterfaces.vistaDetallePedido.inicializaTabla(pedido);
        ControladorInterfaces.vistaDetallePedido.repaint();
    }
    /**
     * Muestra u oculta la vista de historial del cliente
     * @param b
     * @param cliente 
     */
    public static void mostrarHistorialCliente(boolean b, Cliente cliente){
        ControladorInterfaces.habilitarClientes(false);
        ControladorInterfaces.vistaHistorialCliente.setVisible(b);
        ControladorInterfaces.vistaHistorialCliente.inicializaTabla(cliente);
        ControladorInterfaces.vistaHistorialCliente.repaint();
    }
    /**
     * Muestra u oculta la vista de detalle producto
     * @param b
     * @param producto 
     */
    public static void mostrarDetalleProducto(boolean b, Producto producto){
        ControladorInterfaces.habilitarGestionaProducto(false);
        ControladorInterfaces.vistaDetalleProducto.setVisible(b);
        ControladorInterfaces.vistaDetalleProducto.inicializaTabla(producto);
        ControladorInterfaces.vistaDetalleProducto.repaint();
    }
    /**
     * Habilita clientes
     * @param b 
     */
    public static void habilitarClientes(boolean b){
        ControladorInterfaces.clientes.enable(b);
    }
    /**
     * Habilita gestionaPedido
     * @param b 
     */
    public static void habilitarGestionaPedido(boolean b){
        ControladorInterfaces.gestionaPedido.enable(b);
    }
    /**
     * Habilita gestionaProducto
     * @param b 
     */
    public static void habilitarGestionaProducto(boolean b){
        ControladorInterfaces.productos.enable(b);
    }

    /**
     * Muestra u oculta la vista de clientes
     * @param b 
     */
    public static void mostrarClientes(boolean b){
        ControladorInterfaces.clientes.setVisible(b);
        ControladorInterfaces.clientes.setAlmacen(almacen);
        ControladorInterfaces.clientes.repaint();
    }
    /**
     * Muestra u oculta la vista de editar cliente
     * @param b
     * @param cliente
     * @param fila 
     */
    public static void mostrarEditarCliente(boolean b, Cliente cliente, int fila){
        ControladorInterfaces.editarCliente.setVisible(b);
        ControladorInterfaces.editarCliente.setCliente(cliente);
        ControladorInterfaces.editarCliente.setFila(fila);
        ControladorInterfaces.editarCliente.setAlmacen(almacen);
        ControladorInterfaces.editarCliente.repaint();
    }
    /**
     * Muestra u oculta la vista de nuevo cliente
     * @param b 
     */
    public static void mostrarNuevoCliente(boolean b){
        ControladorInterfaces.nuevoCliente.setVisible(b);
        ControladorInterfaces.nuevoCliente.setAlmacen(almacen);
        ControladorInterfaces.nuevoCliente.repaint();
    }
    /**
     * Muestra u oculta la vista de reportes de ventas
     * @param b 
     */
    public static void mostrarReporteVentas(boolean b){
        ControladorInterfaces.reporteVentas.setVisible(b);
        //ControladorInterfaces.reporteVentas.setAlmacen(almacen);
        ControladorInterfaces.reporteVentas.repaint();
    }
    /**
     * Muestra u oculta la vista de reporte de productos
     * @param b 
     */
    public static void mostrarReporteProductos(boolean b){
        ControladorInterfaces.reporteProductos.setVisible(b);
        //ControladorInterfaces.reporteProductos.setAlmacen(almacen);
        ControladorInterfaces.reporteProductos.repaint();
    }
    
}
