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
 * Nombre de archivo: QuickSortIT.java
 * Descripcion: Clase test que prueba los métodos de QuickSort.
 */
public class QuickSortIT {
    
    public QuickSortIT() {
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
    public void testQuickSort() {
        System.out.println("quickSort");
        Comparable[] list = {"b","a"};
        Comparable[] expResult = {"a","b"};
        Comparable[] result = QuickSort.quickSort(list,0,list.length-1);
        assertArrayEquals(expResult, result);
        
    }
    
}
