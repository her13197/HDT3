/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 30

Nombre de archivo: Main.java 
Descripcion: Clase principal del programa; clase que se compila para iniciar.
*/
import java.io.*;
import javax.swing.JOptionPane;
public class Main {

    
    public static void main(String[] args) {
        Numeros lista=new Numeros();
        
        /*Para generar numeros aleatorios y ordenarlos*/
        int cant=2000;
        String[] list = new String[cant];
        lista.limpiar();
        lista.llenar(cant);
        list=lista.leerDatos(cant);
        Sort ordenar=new QuickSort();
        ordenar.Sort(list);
        
        /*Para ordenar una lista ya definida */
       // String[] listOrd=new String[cant];
       // listOrd=lista.leerDatos(cant);
       // ordenar.Sort(listOrd);
        
    }

}
