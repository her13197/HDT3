/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
public class MergeSort implements Sort{
    
    /**
     * MÃ©todo que permite la utilizaciÃ³n de merge sort.
     * pre: -
     * post: El arreglo se ordena.
     * @param list El arreglo que se quiere ordenar.
     */
    public void Sort(Comparable [] list){
        mergesort(list);        
    }
    
    public static void mergesort(Comparable[] list)
   {
       Comparable [ ] temp = new Comparable[ list.length ];
       mergeSort( list, temp, 0, list.length - 1 );
       
       
   }
  /**
   * mergesort
   *    Ordenamiento mediante de mezcla, tomado del 
   *      autor Sun Microsystems.
   * @param list un arreglo de tipo comparable.
   * @param temp arreglo donde se coloca el arreglo unido.
   * @param left El indice mas a la izquierda del sub arreglo.
   * @param right El indice mas a la derecha del sub arreglo.
   */
   private static void mergeSort( Comparable [ ] list, Comparable [ ] temp,
            int left, int right ) {
        if( left < right ) 
        {
            int center = ( left + right ) / 2;
            mergeSort( list, temp, left, center );
            mergeSort( list, temp, center + 1, right );
            merge( list, temp, left, center + 1, right );
        }
    }
   /**
    * Ordenamiento mediante de mezcla, tomado del 
    *      autor Sun Microsystems
    * @param list un arreglo de tipo comparable.
    * @param temp arreglo donde se coloca el arreglo unido.
    * @param leftPos El Ã­ndice mÃ¡s a la izquierda del sub arreglo.
    * @param rightPos El Ã­ndice del inicio de la segunda mitad.
    * @param rightEnd el Ã­ndice mÃ¡s a la derecha de la subarreglo.
    */
   private static Comparable [] merge( Comparable [ ] list, Comparable [ ] temp,
            int leftPos, int rightPos, int rightEnd ) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        
        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd )
            if( list[ leftPos ].compareTo( list[ rightPos ] ) <= 0 )
                temp[ tmpPos++ ] = list[ leftPos++ ];
            else
                temp[ tmpPos++ ] = list[ rightPos++ ];
        
        while( leftPos <= leftEnd )    // Copy rest of first half
            temp[ tmpPos++ ] = list[ leftPos++ ];
        
        while( rightPos <= rightEnd )  // Copy rest of right half
            temp[ tmpPos++ ] = list[ rightPos++ ];
        
        // Copy tmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- )
            list[ rightEnd ] = temp[ rightEnd ];
        return list;
    }
}
