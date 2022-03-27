package uno;
public class probabilidad
{
	public static void main(String[] args) 
	{
		int n = 0;
		System.out.println("cantidad de datos");
		n = (int) (Math.random()*20)+25;
		int [] suma = new int[n];
		double [] datos = new double[n];
		
		captura(datos);
		imprime(datos,suma);
		double prome = promedio(datos);
		desviacion(datos,prome);
		
	}

	private static void desviacion(double[] datos, double prome)
	{
		double sumaDm=0,sumaVm=0;
		for(int i = 0; i <datos.length; i++ )
		{
			sumaDm = sumaDm + Math.abs(datos[i]-prome);
			sumaVm = sumaVm + Math.pow((datos[i]-prome),2);
		}
		System.out.println("desviacion media es: " + sumaDm/datos.length);
		System.out.println("varianza muestral es: " + sumaVm/(datos.length-1));
		System.out.println("varianza poblacon es: " + sumaVm/datos.length);
	}

	private static double promedio(double[] datos) 
	{
		double suma=0, prome=0;
		for(int i = 0; i <datos.length; i++ )
		{
			suma = suma + datos[i];
		}
		prome = suma / datos.length;
		System.out.println("promedio: " + prome);
		return prome;
	}

	private static void imprime(double []datos, int[] suma)
	{
		for(int i = 0; i <datos.length; i++ )
		{	
			for(int ii = 0; ii <datos.length; ii++ ) // este for compara un valor con 
			{									   // todos los demas valores
				if(datos[i]==datos[ii])			       // al ser iguales suma uno en otro vector
					suma[i]++;
			}
			System.out.println((i+1)+"\t"+datos[i]+"      \t"+ suma[i]);
		}
	}
	
	private static void captura(double []datos)
	{
		double aux=0;
		for(int i = 0; i <datos.length; i++ )
		{
			System.out.println("ingresa el dato");
			//datos[i]= Leer.datoDouble();
			datos[i] = (double) Math.round(((Math.random()*Math.random()*7)+Math.random()*datos.length/5)*10d)/10;
		}
		
		for(int i = 0; i <datos.length-1; i++ )
		{
			for(int j = 0; j <datos.length-1; j++ )
			{
				if(datos[j]>datos[j+1])
				{
					aux=datos[j];
					datos[j]= datos[j+1];
					datos[j+1]=aux;
				}
			}
		}
	}
}
