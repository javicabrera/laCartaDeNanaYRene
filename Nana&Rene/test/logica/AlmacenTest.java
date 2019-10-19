package logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logica.Almacen;
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
public class AlmacenTest {
    
    public AlmacenTest() {
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
    
    @Test
    public void testGetMayorId() {
        System.out.println("getMayorID");
        Almacen instance= new Almacen(1257,null,null,null,null);
        int expResult=1257;
        int result=instance.getMayorId();
        assertEquals(expResult,result);
    }
    @Test
    public void testSetMayorId(){
        System.out.println("setMayorID");
        int mayorId=1257;
        Almacen instance= new Almacen();
        instance.setMayorId(mayorId);
        int expResult=1257;
        assertEquals(expResult,instance.getMayorId());
    }
    
}
