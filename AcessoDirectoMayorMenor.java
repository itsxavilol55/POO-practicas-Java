package uno;
import java.io.File;
import java.io.RandomAccessFile;
//Nombre: Javier Eduardo Lopez ontiveros
//Horario: 9 am a 10 am 
//Maestro: Dr. Clemente Garcia Gerardo 
// descripcion: muestra la suma de todas las ventas por mes de mayor a menor
public class AcessoDirectoMayorMenor
{
	static File file = null, file2 = null;
	static RandomAccessFile archivo, archivoSuma;
	public static void main(String[] args)
	{
		file = new File("informeVentas.DAT");
		file2 = new File("informeVentasPorMes.DAT");
		try
		{
			archivo = new RandomAccessFile(file, "rw");
			archivoSuma = new RandomAccessFile(file2, "rw");
			SumaVentasMes(archivo, archivoSuma);
			imprimirVentasMes(archivoSuma);
		} catch (Exception e)
		{
			System.out.println("ocurrio un error ");
			e.printStackTrace();
			System.exit(0);
		}
	}
	private static void imprimirVentasMes(RandomAccessFile archivoSuma2)
	{
		try
		{
			archivoSuma2.seek(0);
			String totalMes = "";
			for(int i = 2000; i <= 2050; i++)
			{
				System.out.println("\033[95m" + "Año: " + i);
				for(int k = 0; k < 12; k++)
				{
					totalMes = archivoSuma2.readUTF();
					System.out.println("\033[94m" + totalMes);
				}
			}
		} catch (Exception e)
		{
			System.out.println("ocurrio un error ");
			e.printStackTrace();
			System.exit(0);
		}
	}
	private static void SumaVentasMes(RandomAccessFile archivo1, RandomAccessFile archivo2)
	{
		try
		{
			archivo1.seek(0);
			archivo2.seek(0);
			int totalMes = 0;
			for(int i = 0; i <= 50; i++)
			{
				int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				String[] mesesStr = { "Enero", "febrero", "marzo", "abril", "mayo", "junio",
						"julio", "agosto", "septiembre", "octubre", "noviembre",
						"diciembre" };
				Long[] total = new Long[12];
				for(int k = 0; k < meses.length; k++)
				{
					for(int j = 1; j <= meses[k]; j++)
						totalMes += archivo1.readInt();
					total[k] = (long) totalMes;
					totalMes = 0;
				}
				Long aux = (long) 0;
				String auxSt = "";
				for(int j = 0; j < total.length - 1; j++)
				{
					for(int j2 = 0; j2 < total.length - 1; j2++)
					{
						if(total[j2] < total[j2 + 1])
						{
							auxSt = mesesStr[j2];
							aux = total[j2];
							mesesStr[j2] = mesesStr[j2 + 1];
							total[j2] = total[j2 + 1];
							mesesStr[j2 + 1] = auxSt;
							total[j2 + 1] = aux;
						}
					}
				}
				for(int j = 0; j < total.length; j++)
				{
					String palabra = mesesStr[j] + " " + total[j];
					nombre.ajustaNivel(palabra, 34);
					archivo2.writeUTF(palabra);
				}
			}
		} catch (Exception e)
		{
			System.out.println("se presento un error al ordena las ventas por mes");
			e.printStackTrace();
			System.exit(0);
		}
	}
}////