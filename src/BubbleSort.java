/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: BubbleSort.java
 * Descripcion: Clase que ejecuta el sort Bubble sort para ordenar una secuencia de números aleatorios.
 * Referencia del algoritmo en internet: Autor, Lewis/Loftus
 */

public class BubbleSort implements Sort{
    /**
     * pre: -
     * post: El arreglo ordenado.
     * @param lista
     * Ordena la lista con el sort Bubble
     */

	public static Comparable[] BubbleSort(Comparable[] lista){
		String cambio;
		for(int i = lista.length-1; i >= 0; i--){
			for(int j = 0; j<i; j++){
				if((lista[j].compareTo(lista[j+1])) > 0)  {
					cambio = (String) lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = cambio;
				}
			}
		}
            return lista;
        }

    public Comparable[] Sort(Comparable[] list) {
        return BubbleSort(list);
    }
}
