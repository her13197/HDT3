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
public class InsertionIT {
    
    public InsertionIT() {
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
     * Test of InsertionSort method, of class InsertionSort.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("InsertionSort");
        Comparable[] list = null;
        Comparable[] expResult = null;
        Comparable[] result = InsertionSort.InsertionSort(list);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sort method, of class InsertionSort.
     */
    @Test
    public void testSort() {
        System.out.println("Sort");
        Comparable[] list = null;
        InsertionSort instance = new InsertionSort();
        instance.Sort(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
