
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.ControladorInterfaces;
import BaseDeDatos.*;
import logica.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elias
 */
public class Main 
{
    private static ControladorInterfaces controladorInterfaces;
    private static ArrayList<Producto> productos;
    private static ArrayList<Pedido> pedidos;
    private static ArrayList<MateriaPrima> materiasPrimas;
    private static Almacen almacen;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        try {
        UIManager.setLookAndFeel(
        "javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
        
        productos = new ArrayList<>();
        pedidos = new ArrayList<>();
        materiasPrimas = new ArrayList<>();
        
        
        GestionExcel gestionExcel = new GestionExcel();
        File rutaMateriasPrimas = new File("/Users/isavo/Desktop/U/8º semestre/Construccion de Software/Repositorios/laCartaDeNanaYRene/MateriasPrimas.xlsx");
        File rutaProductos = new File("/Users/isavo/Desktop/U/8º semestre/Construccion de Software/Repositorios/laCartaDeNanaYRene/Productos.xlsx");
        File rutaPedidos = new File("/Users/isavo/Desktop/U/8º semestre/Construccion de Software/Repositorios/laCartaDeNanaYRene/Pedidos.xlsx");

        /*File rutaMateriasPrimas = new File("C:\\Users\\56992\\Desktop\\Utal\\8vo semestre\\Construcción de Software\\Unidad 2\\Proyecto\\laCartaDeNanaYRene\\MateriasPrimas.xlsx");
        File rutaProductos = new File("C:\\Users\\56992\\Desktop\\Utal\\8vo semestre\\Construcción de Software\\Unidad 2\\Proyecto\\laCartaDeNanaYRene\\Productos.xlsx");
        File rutaPedidos = new File("C:\\Users\\56992\\Desktop\\Utal\\8vo semestre\\Construcción de Software\\Unidad 2\\Proyecto\\laCartaDeNanaYRene\\Pedidos.xlsx");*/


//        File rutaMateriasPrimas = new File("/Users/elias/Documents/Construccion/laCartaDeNanaYRene/MateriasPrimas.xlsx");
//        File rutaProductos = new File("/Users/elias/Documents/Construccion/laCartaDeNanaYRene/productos.xlsx");
//        File rutaPedidos = new File("/Users/elias/Documents/Construccion/laCartaDeNanaYRene/laCartaDeNanaYRene/pedidos.xlsx");

        
        materiasPrimas  = gestionExcel.importarMateriasPrimas(rutaMateriasPrimas);
        productos = gestionExcel.importarProductos(rutaProductos);
        pedidos = gestionExcel.importarPedidos(rutaPedidos);
        System.out.println("Se importaron los datos");
        
        almacen = new Almacen(pedidos, productos, materiasPrimas, null);
        controladorInterfaces = new ControladorInterfaces(almacen, gestionExcel);
        controladorInterfaces.iniciarInterfaz();
        
//        File tMateriasPrimas = new File("/Users/isavo/Desktop/U/8º semestre/Construccion de Software/Repositorios/laCartaDeNanaYRene/testMateriasPrimas.xlsx");
//        gestionExcel.exportarMateriasPrimas(tMateriasPrimas);
//        File tProductos = new File("/Users/isavo/Desktop/U/8º semestre/Construccion de Software/Repositorios/laCartaDeNanaYRene/testProductos.xlsx");
//        gestionExcel.exportarProductos(tProductos);
//        File tPedidos = new File("/Users/isavo/Desktop/U/8º semestre/Construccion de Software/Repositorios/laCartaDeNanaYRene/testPedidos.xlsx");
//        gestionExcel.exportarPedido(tPedidos);
    }  
}
