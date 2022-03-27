package uno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//Nombre: Javier Eduardo Lopez ontiveros
//Horario: 9 am a 10 am 
//Maestro: Dr. Clemente Garcia Gerardo 
public class LeerDatos extends numero
{
	public static void main(String[] args)
	{
		FileReader fr;
		BufferedReader bf;
		String cadena, NombreFormado = "";
		ArrayList<String> nombresList = new ArrayList<String>();
		ArrayList<String> TodosLosNombresList = new ArrayList<String>();
		try // este arraylist es para guardar todos los nombres utilizados sin tomar en cuenta que sean 
		{ // generados aleatoriamente
			fr = new FileReader("C:\\nombres.CVS");
			bf = new BufferedReader(fr);
			while ((cadena = bf.readLine()) != null)
			{
				String[] array = cadena.split(",");
				for(int i = 0; i < numero; i++)
				{
					if(nombresList.indexOf(array[i]) < 0)
						nombresList.add(array[i]);
					NombreFormado += array[i] + " ";
				}
				System.out.println(NombreFormado);
				TodosLosNombresList.add(NombreFormado);
				NombreFormado = "";
			}
			System.out.println();
			Object[] vectorAux = TodosLosNombresList.toArray();
			int[][] ContadorNombres = new int[nombresList.size()][numero];
			for(int i = 0; i < vectorAux.length; i++)
			{
				String[] array = ((String) vectorAux[i]).split(" ");
				for(int j = 0; j < numero; j++)
				{
					for(int k = 0; k < nombresList.size(); k++)
					{
						if(nombresList.get(k).equals(array[j]))
						{
							
							ContadorNombres[k][j]++;
						}
					}
				}
			}
			for(int i = 0; i < nombresList.size(); i++)
			{
				System.out.printf("%-22s\t",nombresList.get(i));
				for(int j = 0; j < numero; j++)
				{
					System.out.printf("%7d",ContadorNombres[i][j]);
				}
				System.out.println();
			}
			fr.close();
		} catch (IOException e)
		{
			System.out.println("ocurrio un error");
		}
	}
}//
