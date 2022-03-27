package uno;
//Nombre: Javier Eduardo Lopez ontiveros
//Horario: 9 am a 10 am 
//Maestro: Dr. Clemente Garcia Gerardo 
import java.io.BufferedWriter;
import java.io.FileWriter;
public class EscribirDatos extends numero // se hereda de la clase numero una constante con numero de nombres a utilizar
{						// el cual puede cambiarse en una sola clase en vez de estar cambiandolo en las 2 
	public static void main(String[] args)
	{	
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\nombres.CVS"));
			for(int i = 0; i < 5; i++)
			{
				bw.write(nombre.generar(numero) + "\n");
			}
			System.out.println("se acabo de grabar");
			bw.close();
		} catch (Exception e)
		{
			System.out.println("ocurrio un error ");
			return;
		}
	}
} //
