/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;
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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of diasRestantesRetiro method, of class Pedido.
     */
    @Test
    public void testDiasRestantesRetiro() {
        System.out.println("diasRestantesRetiro");
        Pedido instance = new Pedido();
        int expResult = 0;
        int result = instance.diasRestantesRetiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductos method, of class Pedido.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        Pedido instance = new Pedido();
        HashMap<Producto, Integer> expResult = null;
        HashMap<Producto, Integer> result = instance.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductos method, of class Pedido.
     */
    @Test
    public void testSetProductos() {
        System.out.println("setProductos");
        HashMap<Producto, Integer> productos = null;
        Pedido instance = new Pedido();
        instance.setProductos(productos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaSolicitud method, of class Pedido.
     */
    @Test
    public void testGetFechaSolicitud() {
        System.out.println("getFechaSolicitud");
        Date fechaSolicitud = new Date();
        Pedido instance = new Pedido(0, null, fechaSolicitud, null, 0, 0, null, null, null, 0);
        Date expResult = fechaSolicitud;
        Date result = instance.getFechaSolicitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getId method, of class Pedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pedido instance = new Pedido(123, null, null, null, 0, 0, null, null, null, 0);
        int expResult = 123;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId method, of class Pedido.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 124;
        Pedido instance = new Pedido();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 124;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFechaSolicitud method, of class Pedido.
     */
    @Test
    public void testSetFechaSolicitud() {
        System.out.println("setFechaSolicitud");
        Date fechaSolicitud = new Date();
        Pedido instance = new Pedido();
        instance.setFechaSolicitud(fechaSolicitud);
        // TODO review the generated test code and remove the default call to fail.
        Date expResult = fechaSolicitud;
        Date result = instance.getFechaSolicitud();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFechaRetiro method, of class Pedido.
     */
    @Test
    public void testGetFechaRetiro() {
        System.out.println("getFechaRetiro");
        Pedido instance = new Pedido();
        Date expResult = null;
        Date result = instance.getFechaRetiro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRetiro method, of class Pedido.
     */
    @Test
    public void testSetFechaRetiro() {
        System.out.println("setFechaRetiro");
        Date fechaRetiro = null;
        Pedido instance = new Pedido();
        instance.setFechaRetiro(fechaRetiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Pedido.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pedido instance = new Pedido();
        instance.setEstado("Pendiente");
        String expResult = "Pendiente";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEstado method, of class Pedido.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "Finalizado";
        Pedido instance = new Pedido();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "Finalizado";
        String result = instance.getEstado();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrecioTotal method, of class Pedido.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        Pedido instance = new Pedido(0, null, null, null, 250, 0, null, null, null, 0);
        int expResult = 250;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioTotal method, of class Pedido.
     */
    @Test
    public void testSetPrecioTotal() {
        System.out.println("setPrecioTotal");
        int precioTotal = 125;
        Pedido instance = new Pedido();
        instance.setPrecioTotal(precioTotal);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 125;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrecioAbonado method, of class Pedido.
     */
    @Test
    public void testGetPrecioAbonado() {
        System.out.println("getPrecioAbonado");
        Pedido instance = new Pedido(0, null, null, null, 0, 0, null, null, null, 4000);
        int expResult = 4000;
        int result = instance.getPrecioAbonado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPrecioAbonado method, of class Pedido.
     */
    @Test
    public void testSetPrecioAbonado() {
        System.out.println("setPrecioAbonado");
        int precioAbonado = 1300;
        Pedido instance = new Pedido();
        instance.setPrecioAbonado(precioAbonado);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 1300;
        int result = instance.getPrecioAbonado();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescuento method, of class Pedido.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        Pedido instance = new Pedido(0, null, null, null, 0, 10, null, null, null, 0);
        int expResult = 10;
        int result = instance.getDescuento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDescuento method, of class Pedido.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        int descuento = 10;
        Pedido instance = new Pedido();
        instance.setDescuento(descuento);
        // TODO review the generated test code and remove the default call to fail.
        int expResult = 10;
        int result = instance.getDescuento();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNombreCliente method, of class Pedido.
     */
    @Test
    public void testGetNombreCliente() {
        System.out.println("getNombreCliente");
        Pedido instance = new Pedido(0, null, null, null, 0, 0, "Jesus", null, null, 0);
        String expResult = "Jesus";
        String result = instance.getNombreCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombreCliente method, of class Pedido.
     */
    @Test
    public void testSetNombreCliente() {
        System.out.println("setNombreCliente");
        String nombreCliente = "Jesus";
        Pedido instance = new Pedido();
        instance.setNombreCliente(nombreCliente);
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "Jesus";
        String result = instance.getNombreCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCorreoCliente method, of class Pedido.
     */
    @Test
    public void testGetCorreoCliente() {
        System.out.println("getCorreoCliente");
        Pedido instance = new Pedido(0, null, null, null, 0, 0, null, "jesus@gmail.com", null, 0);
        String expResult = "jesus@gmail.com";
        String result = instance.getCorreoCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCorreoCliente method, of class Pedido.
     */
    @Test
    public void testSetCorreoCliente() {
        System.out.println("setCorreoCliente");
        String correoCliente = "jesus@gmail.com";
        Pedido instance = new Pedido();
        instance.setCorreoCliente(correoCliente);
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "jesus@gmail.com";
        String result = instance.getCorreoCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumeroCliente method, of class Pedido.
     */
    @Test
    public void testGetNumeroCliente() {
        System.out.println("getNumeroCliente");
        Pedido instance = new Pedido(0, null, null, null, 0, 0, null, null, "972783384", 0);
        String expResult = "972783384";
        String result = instance.getNumeroCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of setNumeroCliente method, of class Pedido.
     */
    @Test
    public void testSetNumeroCliente() {
        System.out.println("setNumeroCliente");
        String numeroCliente = "972783384";
        Pedido instance = new Pedido();
        instance.setNumeroCliente(numeroCliente);
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "972783384";
        String result = instance.getNumeroCliente();
        assertEquals(expResult, result);
    }
    
}
