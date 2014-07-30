/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class NumerosIT {
    
    public NumerosIT() {
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
     * Test of leerDatos method, of class Numeros.
     */
    @Test
    public void testLeerDatos() {
        System.out.println("leerDatos");
        int r = 0;
        Numeros instance = new Numeros();
        String[] expResult = null;
        String[] result = instance.leerDatos(r);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribeDatos method, of class Numeros.
     */
    @Test
    public void testEscribeDatos() {
        System.out.println("escribeDatos");
        int num = 0;
        Numeros instance = new Numeros();
        instance.escribeDatos(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class Numeros.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        Numeros instance = new Numeros();
        instance.limpiar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of llenar method, of class Numeros.
     */
    @Test
    public void testLlenar() {
        System.out.println("llenar");
        int cant = 0;
        Numeros instance = new Numeros();
        instance.llenar(cant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
