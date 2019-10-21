
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.ControladorInterfaces;
import BaseDeDatos.*;
import logica.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Clase principal que controla la conexion entre el excel, la parte logica y grafica
 * del programa
 * @author elias
 */
public class Main 
{
    private static ControladorInterfaces controladorInterfaces;
    private static ArrayList<Producto> productos;
    private static ArrayList<Pedido> pedidos;
    private static ArrayList<MateriaPrima> materiasPrimas;
    private static ArrayList<Cliente> clientes;
    private static Almacen almacen;
    
    /**
     * Metodo principal, en donde se cargan los datos del excel al almacen y se inicia
     * la interfaz principal
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        almacen = new Almacen();
        GestionExcel gestionExcel = new GestionExcel();
        controladorInterfaces = new ControladorInterfaces(almacen, gestionExcel);
        controladorInterfaces.mostrarProxy(true,"Importando datos, espere");
        try {
            UIManager.setLookAndFeel(
            "javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | 
                InstantiationException | IllegalAccessException e) {
        }
        
        productos = new ArrayList<>();
        pedidos = new ArrayList<>();
        materiasPrimas = new ArrayList<>();
        
        File rutaMateriasPrimas = new File("MateriasPrimas.xlsx");
        File rutaProductos = new File("Productos.xlsx");
        File rutaPedidos = new File("Pedidos.xlsx");
        File rutaClientes = new File("Clientes.xlsx");
        
        materiasPrimas  = gestionExcel.importarMateriasPrimas(rutaMateriasPrimas);
        productos = gestionExcel.importarProductos(rutaProductos);
        pedidos = gestionExcel.importarPedidos(rutaPedidos);
        clientes = gestionExcel.importarClientes(rutaClientes);
        System.out.println("Se importaron los datos");
        
        almacen = new Almacen(gestionExcel.getMayorId(), pedidos, productos, materiasPrimas, clientes);
        controladorInterfaces.setAlmacen(almacen);
        ControladorPedido cp = new ControladorPedido(almacen);
        
        controladorInterfaces.iniciarInterfaz();
        controladorInterfaces.mostrarProxy(false,"");
        
        
//        EnviaCorreo.enviar("mrrojano97@icloud.com", "100000", "10/10/1000");
//        EnviaCorreo.enviar("isavocastro@gmail.com", "100000", "10/10/1000");

//        EnviaCorreo.enviar("renecsc@gmail.com", "100000", "10/10/1000");
        
        
        File tMateriasPrimas = new File("MateriasPrimasTest.xlsx");
        gestionExcel.exportarMateriasPrimas(tMateriasPrimas);
        File tProductos = new File("ProductosTest.xlsx");
        gestionExcel.exportarProductos(tProductos);
        File tPedidos = new File("PedidosTest.xlsx");
        gestionExcel.exportarPedido(tPedidos);
        File tClientes = new File("ClientesTest.xlsx");
        gestionExcel.exportarClientes(tClientes);
    }  
}
