/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renecsc
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto("pastelWeed", 0, null, null);
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "pastel de ajo";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "pastel de ajo";
        String result = instance.getNombre();
        assertEquals(expResult, result );
        
    }

    /**
     * Test of getPrecioVenta method, of class Producto.
     */
    @Test
    public void testGetPrecioVenta() {
        System.out.println("getPrecioVenta");
        Producto instance = new Producto(null, 1000, null, null);
        int expResult = 1000;
        int result = instance.getPrecioVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrecioVenta method, of class Producto.
     */
    @Test
    public void testSetPrecioVenta() {
        System.out.println("setPrecioVenta");
        int precioVenta = 2000;
        Producto instance = new Producto();
        instance.setPrecioVenta(precioVenta);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 2000;
        int result = instance.getPrecioVenta();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTiempoElaboracion method, of class Producto.
     */
    @Test
    public void testGetTiempoElaboracion() {
        System.out.println("getTiempoElaboracion");
        Producto instance = new Producto(null, 0, 30.0, null);
        Double expResult = 30.0;
        Double result = instance.getTiempoElaboracion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.        
    }

    /**
     * Test of setTiempoElaboracion method, of class Producto.
     */
    @Test
    public void testSetTiempoElaboracion() {
        System.out.println("setTiempoElaboracion");
        Double tiempoElaboracion = 24.0;
        Producto instance = new Producto();
        instance.setTiempoElaboracion(tiempoElaboracion);
        // TODO review the generated test code and remove the default call to fail.
        Double expResult = 24.0;
        Double result = instance.getTiempoElaboracion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMateriasPrimas method, of class Producto.
     */
    @Test
    public void testGetMateriasPrimas() {
        System.out.println("getMateriasPrimas");
        Producto instance = null;
        HashMap<MateriaPrima, Double> expResult = null;
        HashMap<MateriaPrima, Double> result = instance.getMateriasPrimas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMateriasPrimas method, of class Producto.
     */
    @Test
    public void testSetMateriasPrimas() {
        System.out.println("setMateriasPrimas");
        HashMap<MateriaPrima, Double> materiasPrimas = null;
        Producto instance = null;
        instance.setMateriasPrimas(materiasPrimas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMateriasString method, of class Producto.
     */
    @Test
    public void testGetMateriasString() {
        System.out.println("getMateriasString");
        Producto instance = null;
        String expResult = "";
        String result = instance.getMateriasString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
