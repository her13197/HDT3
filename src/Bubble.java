/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 21

Nombre de archivo: Bubble.java 
Descripcion: clase Bubble que 
*/
public class Bubble{
    public void Bubble(int arr[]) {
        
        int tmp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            print(arr);
            if (i < arr.length - 1) {
                System.out.println(" ---- >>>  Tahap ke " + (i + 1) + " ");
            } else {
                System.out.println(" ---- >>>  Tahap ke " + (i + 1) + " ----->>>> " + " Hasil Setelah buble sort ");

            }
        }
    }

    public void print(int a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
