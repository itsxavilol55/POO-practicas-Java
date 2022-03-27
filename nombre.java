package uno;
public class nombre
{
	static String [] nombresMujer = {"ana", "karen", "elizabeth","scarlet","martina", "sara", "silvia", "maria", "crsitina"};  
	static String [] nombresHombre = {"javier", "eduardo", "francisco", "josue","samuel", "guillermo", "sebastatian", "alejandro","angel"};
	static String  [] apellidos = {"lopez", "pereira", "vazques", "diaz", "garcia","de jose", "mora", "ontiveros", "olivas","palma","reyes","toledo"};
	
	public static String generar(int numNombres)
	{
		int sexo = (int) (Math.random() * 2);
		String nombre = "";
		if(sexo == 0)
		{
			for(int i = 0; i < numNombres; i++)
			{
				int posicion = (int) (Math.random() * nombresHombre.length);
				if(nombre.indexOf(nombresHombre[posicion])> -1)
				{
					i--;
					continue;
				}
				nombre += nombresHombre[posicion] + " ";
			}
		}
		if(sexo == 1)
		{
			for(int i = 0; i < numNombres; i++)
			{
				int posicion = (int) (Math.random() * nombresMujer.length);
				if(nombre.indexOf(nombresMujer[posicion])> -1)
				{
					i--;
					continue;
				}
				nombre += nombresMujer[posicion] + " ";
			}
		}
		for(int i = 0; i < 2; i++)
		{
			int posicion = (int) (Math.random() * apellidos.length);
			nombre += apellidos[posicion] + " ";
		}
		return nombre;
	}
	public static String ajustaNivel(String Palabra, int num)
	{
		while(Palabra.length()<num)
		{
			Palabra += " ";
		}
		return Palabra;
	}
}
