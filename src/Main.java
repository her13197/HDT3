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
        int cant=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea generar?"));
        String[] list = new String[cant];
        lista.llenar(cant);
        list=lista.leerDatos(cant);
        Insertion ordenar=new Insertion();
        ordenar.Sort(list);
    }

}
