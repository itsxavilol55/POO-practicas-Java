package uno;
// alumno: Javier Eduardo Lopez Ontiveros
// No.Control: 20170727 hora: 9am a 10pm
// porfesor: DR Clemente Garcia Gerardo 
public class frecuenciaEdades
{
	public static void main(String[] args) 
	{
		int n=0;
		System.out.println("ingrese la cantidad de edades a leer:");
		n = Leer.datoInt("ingrese la cantidad de edades a leer:");
		int [] fre = new int [n];
		int [] suma = new int [n];
		captura(fre);
		imprime(fre,suma);
		mayor(fre,suma);
	}

	private static void mayor(int[] fre, int[] suma)
	{
		int may = suma[0];
		for(int i = 0; i <fre.length; i++ )
		{
			if (suma[i]>=may) may=i;
		}
		
		System.out.println("la edad que mas se repite fue:"+ fre[may]+ " con un total de repiticiones de: " + suma[may]);
	}

	private static void imprime(int[] fre, int [] suma)
	{
		for(int i = 0; i <fre.length; i++ )
		{
			for(int ii = 0; ii <fre.length; ii++ ) // este for compara un valor con 
			{									   // todos los demas valores
				if(fre[i]==fre[ii])			       // al ser iguales suma uno en otro vector
					suma[i]++;
			}
			
			System.out.println("la edad " + fre[i] + " se repite: " + suma[i]);
		}
	}

	private static void captura(int[] fre)
	{
		for(int i = 0; i <fre.length; i++ )
		{
			System.out.println("ingrese la edad del rango 1 a 20:");
			fre[i] = Leer.datoInt(null);
		}   // se guardan los datos en el vector fre
			// dependiendo el valor de "n"
	}
}
