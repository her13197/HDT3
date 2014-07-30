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
public class MergeSortIT {
    
    public MergeSortIT() {
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
     * Test of Sort method, of class MergeSort.
     */
    @Test
    public void testSort_ComparableArr() {
        System.out.println("Sort");
        Comparable[] list = null;
        MergeSort instance = new MergeSort();
        instance.Sort(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort_3args() {
        System.out.println("sort");
        int low = 0;
        int high = 0;
        Comparable[] list = null;
        MergeSort.sort(low, high, list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class MergeSort.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        int low = 0;
        int middle = 0;
        int high = 0;
        Comparable[] list = null;
        Comparable[] expResult = null;
        Comparable[] result = MergeSort.merge(low, middle, high, list);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
