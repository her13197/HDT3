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
 * Nombre de archivo: InsertionIT.java
 * Descripcion: Clase test que prueba los métodos de InsertionSort.
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
        Comparable[] lista = {"b","a"};
        Comparable[] expResult = {"a","b"};
        Comparable[] result = InsertionSort.InsertionSort(lista);
        assertArrayEquals(expResult, result);
    }
    
}
