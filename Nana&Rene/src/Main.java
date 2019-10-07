
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.ControladorInterfaces;
import BaseDeDatos.*;
import logica.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
    private static ArrayList<Producto> productos;
    private static ArrayList<Pedido> pedidos;
    private static ArrayList<MateriaPrima> materiasPrimas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
//        try {
//        UIManager.setLookAndFeel(
//        "javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        } 
//        catch (UnsupportedLookAndFeelException e) {
//           // handle exception
//        }
//        catch (ClassNotFoundException e) {
//           // handle exception
//        }
//        catch (InstantiationException e) {
//           // handle exception
//        }
//        catch (IllegalAccessException e) {
//           // handle exception
//        }
        ControladorInterfaces controlador= new ControladorInterfaces();
        ControladorInterfaces.iniciarInterfaz();
        productos = new ArrayList<Producto>();
        pedidos = new ArrayList<Pedido>();
        materiasPrimas = new ArrayList<MateriaPrima>();
        GestionExcel gestionExcel = new GestionExcel();
        File rutaProductos = new File("C:C:\\Users\\MarceloPablo\\Documents\\NetBeansProjects\\laCartaDeNanaYRene\\productos.xlsx");
        File rutaPedidos = new File("C:\\Users\\MarceloPablo\\Documents\\NetBeansProjects\\laCartaDeNanaYRene\\Pedidos.xlsx");
        File rutaMateriasPrimas = new File("C:\\Users\\MarceloPablo\\Documents\\NetBeansProjects\\laCartaDeNanaYRene\\MateriasPrimas.xlsx");
        productos = gestionExcel.importarProductos(rutaProductos);
        pedidos = gestionExcel.importarPedidos(rutaPedidos);
        materiasPrimas  = gestionExcel.importarMateriasPrimas(rutaMateriasPrimas);

        File tProductos = new File("C:\\Users\\MarceloPablo\\Documents\\NetBeansProjects\\laCartaDeNanaYRene\\testProductos.xlsx");
        gestionExcel.exportarProductos(tProductos);
        File tPedidos = new File("C:\\Users\\MarceloPablo\\Documents\\NetBeansProjects\\laCartaDeNanaYRene\\testPedidos.xlsx");
        gestionExcel.exportarPedido(tPedidos);
        File tMateriasPrimas = new File("C:\\Users\\MarceloPablo\\Documents\\NetBeansProjects\\laCartaDeNanaYRene\\testMateriasPrimas.xlsx");
        gestionExcel.exportarMateriasPrimas(tMateriasPrimas);
    }  
}
