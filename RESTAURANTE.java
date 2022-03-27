package uno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
//Nombre: Javier Eduardo Lopez ontiveros
//Horario: 9 am a 10 am 
//Maestro: Dr. Clemente Garcia Gerardo 
public class RESTAURANTE implements Hambre
{
	public void CalculaTotalesNoRecogidos()
	{
		FileReader fr;
		BufferedReader bf;
		String cadena;
		File file = null;
		RandomAccessFile archivo;
		try
		{
			fr = new FileReader("C:\\examen106\\PEDIDOS.CVS");
			bf = new BufferedReader(fr);
			file = new File("C:\\examen106\\CLIENTES.DAT");
			archivo = new RandomAccessFile(file, "rw");
			while ((cadena = bf.readLine()) != null)
			{
				if(cadena.indexOf("N") > 0)
				{
					String[] arreglo = cadena.split(",");		 // 1 -1 = 0 * 52 = 0 + 42 = 42
					int posicionNoOrdenReco = ((Integer.parseInt(arreglo[0])-1) * 52) + 42;
					float importeOrden =  Integer.parseInt(arreglo[1]); // ejemplo ID 1 
					archivo.seek(posicionNoOrdenReco); //lo pone al final del nombre en 42
					int suma = archivo.readInt() +1; // al leer lo pone en 46
					archivo.seek(posicionNoOrdenReco); // vuelve a 42
					archivo.writeInt(suma); // al escribir avanza 4 y queda en 46
					float importeTotal = archivo.readInt() + importeOrden; //al leer queda en 50
					archivo.seek(posicionNoOrdenReco +4); // vuelve a 46
					archivo.writeFloat(importeTotal);
				}
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("ocurrio un error al leer el archivo");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e)
		{
			System.out.println("ocurrio un error al calcular");
			e.printStackTrace();
			System.exit(0);
		}
	}
	public void CambiarVigenciaClientesProblematicos()
	{
		File file = null;
		RandomAccessFile archivo;
		try
		{
			file = new File("C:\\examen106\\CLIENTES.DAT");
			archivo = new RandomAccessFile(file, "rw");
			archivo.seek(0);
			for(int i = 0; i < archivo.length()/52; i++)
			{	
				archivo.seek((i * 52) +42); // pone el apuntador en el numero de ordenes en cada ciclo
				if(archivo.readInt()>5) 
				{	// nose puede comparar los 2 valores al mismo
					//tiempo porque el puntero no puede estar en 2 lugares a la vez
					archivo.seek((i * 52) +50);
					archivo.writeChar('B');
				}
				archivo.seek((i * 52) +46); // pone el apuntador en el importede ordenes en cada ciclo
				if(archivo.readFloat()>1000)
				{
					archivo.seek((i * 52) +50);
					archivo.writeChar('B');
				}
			}
		} catch (IOException e)
		{
			System.out.println("ocurrio un error");
			e.printStackTrace();
			System.exit(0);
		}
	}// liena finalllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
}
