/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: MergeSort.java
 * Descripcion: Clase que ejecuta el sort Merge sort para ordenar una secuencia de números aleatorios.
 * Referencia del algoritmo en internet: Autor, Sun Microsystems
 */
public class MergeSort implements Sort{
    
    /**
     * pre: -
     * post: El arreglo ordenado.
     * @param list
     * Ordena la lista con el sort Merge.
     */
    public Comparable[] Sort(Comparable [] list){
        return mergesort(list);        
    }
    
    public static Comparable[] mergesort(Comparable[] list)
   {
       Comparable [ ] temp = new Comparable[ list.length ];
       return mergeSort( list, temp, 0, list.length - 1 );
       
       
   }
    
  /**
   * @param list
   * @param temp Arreglo unido.
   * @param left El indice a la izquierda del sub arreglo.
   * @param right El indice a la derecha del sub arreglo.
   */
   private static Comparable[] mergeSort( Comparable [ ] list, Comparable [ ] temp, int left, int right ) {
        if( left < right ) 
        {
            int center = ( left + right ) / 2;
            mergeSort( list, temp, left, center );
            mergeSort( list, temp, center + 1, right );
            return merge( list, temp, left, center + 1, right );
        }
        Comparable [ ] listb={"a","b"};
        return listb;
    }
   /**
    * Ordenamiento mediante de mezcla, tomado del 
    *      autor Sun Microsystems
    * @param list
    * @param temp arreglo unido.
    * @param leftPos El posición a la izquierda del sub arreglo.
    * @param rightPos Indica la mitad superior arreglo.
    * @param rightEnd El posición a la izquierda del sub arreglo.
    */
   private static Comparable [] merge( Comparable [ ] list, Comparable [ ] temp,
            int leftPos, int rightPos, int rightEnd ) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        
        while( leftPos <= leftEnd && rightPos <= rightEnd ){
            if( list[ leftPos ].compareTo( list[ rightPos ] ) <= 0 ){
                temp[ tmpPos++ ] = list[ leftPos++ ];
            }else{
                temp[ tmpPos++ ] = list[ rightPos++ ];
            }
        }
        while( leftPos <= leftEnd ){
            temp[ tmpPos++ ] = list[ leftPos++ ];
        }
        
        while( rightPos <= rightEnd ){ 
            temp[ tmpPos++ ] = list[ rightPos++ ];
        }
        
        for( int i = 0; i < numElements; i++, rightEnd-- ){
            list[ rightEnd ] = temp[ rightEnd ];
        }
        return list;
    }
}