import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
Autor: Erick Hernandez    Carné: 13197
Seccion: 21

Nombre de archivo: Numeros.java 
Descripcion: clase Numeros que 
*/
public class Numeros<E>{
    File archivo = new File("C:\\Users\\usuario\\Desktop\\archivo.txt"); //Almacena el archivo en donde se guardaran los datos
    java.io.File directorio = new File("C:\\Users\\usuario\\Desktop");
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
    public String[] leerDatos(int r){ //recibe la cantidad de numeros aleatorios generados
            FileReader fr = null;
            BufferedReader br = null;
            String datos[]= new String[r];
            int cont=0;
            try{
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String linea;
                    while ((linea = br.readLine())!=null){

                        datos[cont]=linea;
                        cont+=1;
                    }
                    if(datos[1] == null){
                        for(int i=0; i<10;i++){
                            datos[i]=" ";
                        }
                        return datos;
                    }


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
    
    private void escribeDatos(int num){
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
    
    public void fin(){
        try{
            if(archivo.exists()){
                archivo.delete();
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
