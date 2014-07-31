import java.io.*;
import javax.swing.JOptionPane;

/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: Main.java
 * Descripcion: Clase principal del programa; clase que se compila para iniciar.
 */

public class Main {

    /**
     * 
     * @param args 
     * Se crea el menú para el usuario
     * Se llama a la clase Numeros y se genera el txt con los numeros aleatorios
     * Luego se llama a uno de los sorts para que lo ordene
     */
    public static void main(String[] args) {
        Numeros lista=new Numeros();
        int cant=2000;
        Sort ordenar=new MergeSort();
        boolean cont=true;
        Comparable[] listOrd1=new String[cant];
        Comparable[] listOrd2=new String[cant];
        while(cont==true){
        int op=Integer.parseInt(JOptionPane.showInputDialog("Desea generar el archivo o ya existe un archivo ordenado?"
                + "\n1)Generar números"
                + "\n2)Lista ya ordenada"
                + "\n3)Salir"));
        if(op==1){
            String[] list = new String[cant];
            lista.limpiar();
            lista.llenar(cant);
            list=lista.leerDatos(cant);
            listOrd1=ordenar.Sort(list);
            lista.limpiar();
            lista.llenarordenados(listOrd1);
            
        }else if(op==2){
            listOrd2=lista.leerDatos(cant);
            ordenar.Sort(listOrd2);
            
        }else if(op==3){
            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            cont=false;
        }else{
            JOptionPane.showMessageDialog(null, "Usted ha ingresado un número incorrecto"
                    + "");
            }
        }
       
    }

}