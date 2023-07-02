package miPrincipal;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Util_LeeArchivo {
	


public static ArrayList<String> ObtenLineas(String Archivo)
	{
		ArrayList<String> lineas= new ArrayList<String>();
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	      try {
	         // Apertura del archivo y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	 
	         archivo = new File (Archivo);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura 
	         String linea;
	         while((linea=br.readLine())!=null)
	         {
	           
	            lineas.add(linea);
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el archivo, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      return lineas;
		}
	}
