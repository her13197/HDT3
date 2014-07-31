/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: QuickSort.java
 * Descripcion: Clase que ejecuta el sort Quick sort para ordenar una secuencia de números aleatorios.
 * Referencia del algoritmo en internet: Autor, IntelliJ IDEA
 */
public class QuickSort implements Sort{
    
    /**
     * post: El arreglo ordenado.
     * @param list El arreglo que se quiere ordenar.
     */
    public Comparable[] Sort(Comparable[] list){
        return quickSort(list,0,list.length-1);
    }
    
    /**
     * @param list 
     * @param izquierda Posición de la izquierda
     * @param derecha Posición de la derecha
     */
    public static Comparable[] quickSort(Comparable[] list,int izquierda, int derecha){
        if(izquierda>=derecha){}
        else if(izquierda!=derecha){
            int i=izquierda, d=derecha, pivote=i;
            Comparable aux;
            while(izquierda!=derecha){
                while((list[derecha].compareTo(list[pivote])>=0) && (izquierda<derecha)){
                    derecha--;
                }
                while((list[izquierda].compareTo(list[pivote])<0 && (izquierda<derecha))){
                    izquierda++;
                }
                if(derecha != izquierda){
                    aux = list[derecha];
                    list[derecha] = list[izquierda];
                    list[izquierda] = aux;
                }
                if(izquierda == derecha){
                    quickSort(list,i,izquierda-1);
                    quickSort(list,izquierda+1,d);
                }
                
            }
        }
        return list;
    }
}
