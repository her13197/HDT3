/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: InsertionSort.java
 * Descripcion: Clase que ejecuta el sort Insertion sort para ordenar una secuencia de números aleatorios.
 * Referencia del algoritmo en internet: Autor, Lewis/Loftus
 */

public class InsertionSort implements Sort
{
    /**
     * pre: -
     * post: El arreglo ordenado.
     * @param list
     * Ordena la lista con el sort Insertion
     */
    
   public static Comparable[] InsertionSort(Comparable[] list)
   {
      for (int index = 1; index < list.length; index++)
      {
         Comparable key = list[index];
         int position = index;

         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
      return list;
   }  
    public Comparable[] Sort(Comparable[] list) {
       return InsertionSort(list);
    }
}