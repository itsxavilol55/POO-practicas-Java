package uno;
import java.io.File;
import java.io.RandomAccessFile;
public class ordenaNombresAlfabeticamente
{
	static File file = null;
	static RandomAccessFile archivo;
	public static void main(String[] args)
	{
		file = new File("C:\\Nombres.DAT");
		int num = 20;
		try
		{
			archivo = new RandomAccessFile(file, "rw");
			archivo.seek(0);
			for(int i = 0; i < num; i++)
				archivo.writeUTF(nombre.ajustaNivel(nombre.generar(2), 58));
			String nombre1;    					//longitud de 60
			String nombre2;
			String archAux;
			for(int i = 0; i < archivo.length() / 60; i++)
			{
				for(int i1 = 0; i1 < (archivo.length() / 60) - 1; i1++)
				{
					archivo.seek(i1 * 60);
					nombre1 = archivo.readUTF();
					archivo.seek((i1 + 1) * 60);
					nombre2 = archivo.readUTF();
					if(nombre1.compareTo(nombre2) > 0)
					{
						archAux = nombre1;
						archivo.seek(i1 * 60);
						archivo.writeUTF(nombre2);
						archivo.seek((i1 + 1) * 60);
						archivo.writeUTF(archAux);
					}
				}
			}
			archivo.seek(0);
			for(int i = 0; i < archivo.length() / 60; i++)
			{
				System.out.println(archivo.readUTF());
			}
		} catch (Exception e)
		{
			System.out.println("ocurrio un error ");
			e.printStackTrace();
			return;
		}
	}
}
