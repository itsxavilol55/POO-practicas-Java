package uno;
import java.io.*;
public class Leer
{
	public static String dato(String texto)
	{
		System.out.println(texto);
		String sdato = "";
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader nose = new BufferedReader(isr);
			sdato = nose.readLine();
		} catch (IOException e)
		{
			System.err.println("Error:" + e.getMessage());
		}
		return sdato;
	}
	public static short datoShort(String texto)
	{
		try
		{
			String sd = dato(texto);
			if(sd == null)
			{
				System.out.println();
				return Short.MIN_VALUE;
			} else
				return Short.parseShort(sd); // antes return Short.parseShort(dato());
		} catch (NumberFormatException e)
		{
			// return Short.MIN_VALUE;
			System.out.print("Dato invalido, volver a teclear el dato: \n");
			return datoShort(texto);
		}
	}
	public static int datoInt(String texto )
	{
		try
		{
			return Integer.parseInt(dato(texto));
		} catch (NumberFormatException e)
		{
			// return Integer.MIN_VALUE;
			System.out.print("te pedi un dato entero:  \n");
			return datoInt(texto);
		}
	}
	public static long datoLong(String texto)
	{
		try
		{
			return Long.parseLong(dato(texto));
		} catch (NumberFormatException e)
		{
			//return Long.MIN_VALUE;
			System.out.print("Dato invalido, volver a teclear el dato:  \n");
			return datoLong(texto);
		}
	}
	public static float datoFloat(String texto)
	{
		try
		{
			Float f = new Float(dato(texto));
			return f.floatValue();
		} catch (NumberFormatException e)
		{
			if(dato(texto) == null)
				return Float.NaN;
			else
			{
				System.out.print("Dato invalido, volver a teclear el dato:  \n");
				return datoFloat(texto);
			}
		}
	}
	public static double datoDouble(String texto)
	{
		String cadena = dato(texto);
		try
		{
			return Double.parseDouble(cadena);
			// Double d = new Double(dato());
			// return d.doubleValue();
		} catch (NumberFormatException e)
		{
			if(cadena.length() == 0)
				return Double.NaN;
			else
			{
				System.out.print("Dato invalido, volver a teclear el dato:  \n");
				return datoDouble(texto);
			}
		}
	}
	public static char datocar()
	{
		char sdato = ' ';
		try
		{
			sdato = (char) System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e)
		{
			System.err.println("Error:" + e.getMessage());
		}
		return sdato;
	}
	public static int[] random(int m, int ma, int a[])
	{
		int[] A = new int[a.length];
		for(int k = 0; k < a.length; k++)
		{
			A[k] = (int) (Math.random() * (ma - m)) + m;
		}
		return A;
	}
	public static int[] random(int m, int ma, int a)
	{
		int[] A = new int[a];
		for(int k = 0; k < a; k++)
		{
			A[k] = (int) (Math.random() * (ma - m)) + m;
		}
		return A;
	}
	public static int datoIntPositivo(String texto)
	{
		try
		{
			return Integer.parseInt(dato(texto));
		} catch (NumberFormatException e)
		{
			// return Integer.MIN_VAUE;
			System.out.print("Ingresa un numero positivo: \n");
			return datoIntPositivo(texto);
		}
	}
	public static int GeneraNumero(int inf, int sup)
	{
		int num =(int) (Math.random() * (sup - inf+1)) + inf;
		return num;
	}
}
