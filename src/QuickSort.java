/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
public class QuickSort implements Sort{
    
    /**
     * Método que permite la utilización de quick sort.
     * pre: -
     * post: El arreglo se ordena.
     * @param list El arreglo que se quiere ordenar.
     */
    public void Sort(Comparable[] list){
        quickSort(list,0,list.length-1);
    }
    
    /**
     * Método que permite la utilización de merge sort.
     * pre: -
     * post: El arreglo se ordena.
     * @param list El arreglo que se quiere ordenar.
     * @param izquierda La posición de la izquierda
     * @param derecha La posición de la derecha
     */
    public static void quickSort(Comparable[] list,int izquierda, int derecha){
        //Verifica que las posiciones no sean las mismas
        if(izquierda>=derecha){}
        //Realiza el sort.
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
    }
}
