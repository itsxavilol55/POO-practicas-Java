package uno;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
//Nombre: Javier Eduardo Lopez ontiveros
//Horario: 9 am a 10 am 
//Maestro: Dr. Clemente Garcia Gerardo 
// descripcion: muestra la suma de todas las ventas por mes y por año
public class AccesoDirecto
{
	static File file = null, file2 = null ;
	static RandomAccessFile archivo, archivoSuma;
	public static void main(String[] args)
	{
		file = new File("informeVentas.DAT");
		file2 = new File("informeVentasPorMesOrdenadas.DAT");
		try
		{
			archivo = new RandomAccessFile(file, "rw");
			archivoSuma = new RandomAccessFile(file2, "rw");
			generar(archivo);
			SumaVentasMes(archivo,archivoSuma);
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
			String[] meses = { "Enero","febrero","marzo","abril","mayo", "junio","julio","agosto","septiembre","octubre","noviembre","diciembre" };
			int totalAño =0;
			long totalMes=0;
			for(int i = 2000; i <= 2050; i++)
			{
				System.out.println("\033[95m"+ "Año: " + i);
				for(int k = 0; k < 12; k++)
				{
					totalMes = archivoSuma2.readLong();
					totalAño+= totalMes;
					System.out.println("\033[94m"+meses[k] + ": "+ totalMes);
				}
				System.out.println("TOTAL AÑO: " + totalAño);
				totalAño=0;
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
			int[] meses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int totalMes = 0;
			for(int i = 0; i <= 50; i++)
				for(int k = 0; k < meses.length; k++)
				{
					for(int j = 1; j <= meses[k]; j++)
						totalMes += archivo1.readInt();
					archivo2.writeLong(totalMes);
					totalMes = 0;
				}
		} catch (Exception e)
		{
			System.out.println("se presento un error al ordena las ventas por mes");
			e.printStackTrace();
			System.exit(0);
		}
	}
	private static void generar(RandomAccessFile archivoAux)
	{
		try
		{
			archivoAux.seek(0);
			for(int año = 2000; año <= 2050; año++)
				for(int dia = 1; dia <= 365; dia++)
					archivoAux.writeInt(Leer.GeneraNumero(10,2021 ));
		} catch (IOException e)
		{
			System.out.println("se presento un error al crear el archivo");
			e.printStackTrace();
		}
	}
}///