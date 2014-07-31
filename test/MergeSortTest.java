import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: MergeSortTest.java
 * Descripcion: Clase test que prueba los métodos de MergeSort.
 */

public class MergeSortTest {
    
    public MergeSortTest() {
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
     * Test of mergesort method, of class MergeSort.
     */
    @Test
    public void testMergesort() {
        System.out.println("mergesort");
        Comparable[] list = {"b","a"};
        Comparable[] expResult = {"a","b"};
        Comparable[] result = MergeSort.mergesort(list);
        assertArrayEquals(expResult, result);
    }
}
