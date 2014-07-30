public class BubbleSort implements Sort{

	public static void BubbleSort(Comparable[] lista){
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
        }

    public void Sort(Comparable[] list) {
        BubbleSort(list);
    }
}
