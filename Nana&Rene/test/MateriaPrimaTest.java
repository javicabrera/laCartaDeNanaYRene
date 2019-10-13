/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logica.MateriaPrima;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MarceloPablo
 */
public class MateriaPrimaTest {
    
    public MateriaPrimaTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testGetNombreMateriaPrima() {
        System.out.println("getNombreMateriaPrima");
        MateriaPrima instance = new MateriaPrima("limon", null, null);
        
        String expResult = "limon";
        String result = instance.getCorreoCliente();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testSetNombreMateriaPrima() {
        System.out.println("setNombreMateriaPrima");
        String nombre = "limon";
        MateriaPrima instance = new MateriaPrima();
        
        String expResult= "limon";
        
        instance.setNombre(nombre);
        
        assertEquals(expResult, instance.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testGetCantidadMateriaPrima() {
        System.out.println("GetCantidadMateriaPrima");
        MateriaPrima instance = new MateriaPrima(null, 2.0, null);
        
        Double expResult = 2.0 ;
        Double result = instance.getCantidad();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testSetCantidadMateriaPrima() {
        System.out.println("setCantidadMateriaPrima");
        Double cantidad = 2.0;
        MateriaPrima instance = new MateriaPrima();
        
        Double expResult= 2.0;
        
        instance.setCantidad(cantidad);
        
        assertEquals(expResult, instance.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testGetTipo() {
        System.out.println("getTipoMateriaPrima");
        MateriaPrima instance = new MateriaPrima(null, null, "continua");
        
        String expResult = "continua";
        String result = instance.getTipo();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "continua";
        MateriaPrima instance = new MateriaPrima();
        
        String expResult= "continua";
        
        instance.setTipo(tipo);
        
        assertEquals(expResult, instance.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }
}
