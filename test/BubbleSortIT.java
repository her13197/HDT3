
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
 * Nombre de archivo: BubbleSortIT.java
 * Descripcion: Clase test que prueba los métodos de BubbleSort.
 */

public class BubbleSortIT {
    
    public BubbleSortIT() {
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
     * Test of BubbleSort method, of class BubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        Comparable[] lista = {"b","a"};
        Comparable[] expResult = {"a","b"};
        Comparable[] result = BubbleSort.BubbleSort(lista);
        assertArrayEquals(expResult, result);
       
    }
}
