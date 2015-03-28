import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de mi_lista (dada) son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int n=0;
		for(int i=0;i<mi_lista.size();i++)
		{
			if(mi_lista.get(i)%2==0)
			{
				n=n+1;
				if(n==mi_lista.size())
				{
					return true;
				}
			}
		}
		return false;
	}
	
	//Escribe n1, n2 y n3 (dados) en un archivo con nombre nombre_archivo (dado) separados por espacios
	static void escribir3Numeros(String nombre_archivo,int n1, int n2,int n3)
	{
		try
		{
			PrintWriter in= new PrintWriter(nombre_archivo); 
			in.write(n1+" "+n2+" "+n3);
			in.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Devuelve true si el archivo con nombre nombre_archivo (dado) contiene al menos 2 palabras repetidas
	static boolean existenRepetidas(String nombre_archivo)
	{
		String leer;
		String leer2=" ";
		

		
		try
		{
			Scanner in =new Scanner(new File(nombre_archivo));
			while(in.hasNext())
			{
				leer=in.next();
				while(in.hasNext())
				{
					leer2=in.next();
					if(leer.equals(leer2))
					{
						return true;
					}
				}
			}
			in.close();				
			return false;
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
