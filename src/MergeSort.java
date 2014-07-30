/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bicimotoca
 */
public class MergeSort{
    
    /**
     * MÃ©todo que permite la utilizaciÃ³n de merge sort.
     * pre: -
     * post: El arreglo se ordena.
     * @param list El arreglo que se quiere ordenar.
     */
    public void mergeSort(Comparable [] list){
        int largo = list.length;
        sort(0, largo-1, list);        
    }
    
    /**
     * MÃ©todo que permite realizar el sort.
     * pre: low debe ser menor a high
     * post: Se le realiza el sort al arreglo.
     * @param low posiciÃ³n baja con la que se estÃ¡ trabajando.
     * @param high posiciÃ³n alta con la que se estÃ¡ trabajando.
     * @param list el arreglo que se quiere ordenar.
     */
    public static void sort (int low, int high, Comparable [] list){
        // Revisa si low es menor a high, si no el array no se arregla
	if (low < high) {
            //Se obtiene el indice del elemento del centro
            int middle = (low + high) / 2;
            // Se realiza el sort del lado izquierdo del arreglo
            sort(low, middle, list);
            // Se realiza el sort del lado derecho del arreglo
            sort(middle + 1, high, list);
            // Se combinan los dos
            merge(low, middle, high, list);
        }
    }
    
    /**
     * MÃ©todo encargado de combinar.
     * pre: -
     * post: Se combinan los arreglos.
     * @param low posiciÃ³n baja con la que se estÃ¡ trabajando.
     * @param middle posiciÃ³n media con la que se estÃ¡ trabajando.
     * @param high posiciÃ³n alta con la que se estÃ¡ trabajando.
     * @param list arreglo que se quiere ordenar.
     */
    public static void merge (int low, int middle, int high, Comparable [] list){
        int largo=list.length;
        Comparable [] temp = new Comparable [list.length];
        // Copia las dos partes en el arreglo temporal
        for (int i = low; i <= high; i++) {
                temp[i] = list[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        //Copia los valores mas pequeÃ±os desde la parte derecha o izquierda de 
        //regreso al original.
        while (i <= middle && j <= high) {
                if (temp[i].compareTo(temp[j]) <0) {
                        list[k] = temp[i];
                        i++;
                } else {
                        list[k] = temp[j];
                        j++;
                }
                k++;
        }
        //Copia el resto del lado izquierdo del arreglo en el arreglo que se
        //desea.
        while (i <= middle) {
                list[k] = temp[i];
                k++;
                i++;
        }
    }   
}
