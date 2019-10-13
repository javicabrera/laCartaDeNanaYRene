/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elias
 */
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getNombreCliente method, of class Cliente.
     */
    @Test
    public void testGetNombreCliente() {
        System.out.println("getNombreCliente");
        Cliente instance = new Cliente("Manolo Sabroso", null, null);
        String expResult = "Manolo Sabroso";
        
        String result = instance.getNombreCliente();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombreCliente method, of class Cliente.
     */
    @Test
    public void testSetNombreCliente() {
        System.out.println("setNombreCliente");
        String nombreCliente = "Manolo Sabroso";
        Cliente instance = new Cliente();
        
        String expResult = "Manolo Sabroso";
        
        instance.setNombreCliente(nombreCliente);
        
        assertEquals(expResult, instance.getNombreCliente());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCorreoCliente method, of class Cliente.
     */
    @Test
    public void testGetCorreoCliente() {
        System.out.println("getCorreoCliente");
        Cliente instance = new Cliente(null, "prueba@testing.com", null);
        
        String expResult = "prueba@testing.com";
        String result = instance.getCorreoCliente();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCorreoCliente method, of class Cliente.
     */
    @Test
    public void testSetCorreoCliente() {
        System.out.println("setCorreoCliente");
        String correoCliente = "prueba@testing.com";
        Cliente instance = new Cliente();
        
        String expResult= "prueba@testing.com";
        
        instance.setCorreoCliente(correoCliente);
        
        assertEquals(expResult, instance.getCorreoCliente());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumeroCliente method, of class Cliente.
     */
    @Test
    public void testGetNumeroCliente() {
        System.out.println("getNumeroCliente");
        Cliente instance = new Cliente(null, null, "912345678");
        
        String expResult = "912345678";
        String result = instance.getNumeroCliente();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNumeroCliente method, of class Cliente.
     */
    @Test
    public void testSetNumeroCliente() {
        System.out.println("setNumeroCliente");
        String numeroCliente = "912345678";
        Cliente instance = new Cliente();
        
        String expResult = "912345678";
        
        instance.setNumeroCliente(numeroCliente);
        assertEquals(expResult, instance.getNumeroCliente());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
