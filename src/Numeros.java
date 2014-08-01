import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author Erick Hernandez    Carné: 13197
 * @author Pablo Argueta      Carné: 13028
 * @author Erick Hernandez    Carné: 13217
 * 
 * Nombre de archivo: Numeros.java
 * Descripcion: Clase que genera y guarda numeros.
 */

public class Numeros<E>{
    File archivo = new File("C:\\Users\\Bicimotoca\\Desktop\\HDT3.txt"); //Almacena el archivo en donde se guardaran los datos
    java.io.File directorio = new File("C:\\Users\\Bicimotoca\\Desktop");
    /**
     * Se crea el archivo y se guarda los numeros aleatorios
     * Al estar ordenados por un sort ya solo se guarda el archivo
     */
    public Numeros(){
			if(!directorio.exists()){
				directorio.mkdirs();
			}
			try{
                            if(!archivo.exists()){
                                archivo.createNewFile();
                            }
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
    /**
     * 
     * @param r recibe la cantidad de numeros aleatorios generados
     * @return datos
     */
    public String[] leerDatos(int r){ 
            FileReader fr = null;
            BufferedReader br = null;
            String datos[]= new String[r];
            int cont=0;
            try{
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String linea;
                    while ((linea = br.readLine())!=null){

                        datos[cont]=""+linea;
                        cont+=1;
                    }
                    return datos;
            }
            catch(Exception e){
                    e.printStackTrace();
            }
            finally{
                    try{
                            if(null != fr ){
                                    fr.close();
                            }
                    }
                    catch(Exception e2){
                            e2.printStackTrace();
                    }

            }
            return datos;
    }
    
    public void escribeDatos(int num){
			FileWriter fichero = null;
			PrintWriter pw = null;
			try{
				fichero = new FileWriter(archivo, true);
				pw = new PrintWriter(fichero);
				pw.println(num);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally{
				try{
					if(null!=fichero)
						fichero.close();
				}
				catch(Exception e2){
					e2.printStackTrace();
				}
			}
		}
    
    public void llenarordenados(Comparable[] lista){
        for(int i=0;i<lista.length;i++){
            String n=(String)lista[i];
            int w=Integer.parseInt(n);
            escribeDatos(w);
        }
    }
    
    public void limpiar(){
        try{
            if(archivo.exists()){
                archivo.delete();
                archivo.createNewFile();
            }
	}
            catch(Exception e){
            System.out.println(e.getMessage());
	}
    }
    
    public void llenar(int cant){
        for(int i=0; i<cant; i++){
            int valorEntero = (int)Math.floor(Math.random()*9);
            escribeDatos(valorEntero);
        }
    }
}
