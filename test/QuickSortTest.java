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
public class QuickSortTest {
    
    public QuickSortTest() {
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
     * Test of quickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort_ComparableArr() {
        System.out.println("quickSort");
        Comparable[] list = null;
        QuickSort.quickSort(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort_3args() {
        System.out.println("quickSort");
        Comparable[] list = null;
        int izquierda = 0;
        int derecha = 0;
        QuickSort.quickSort(list, izquierda, derecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
