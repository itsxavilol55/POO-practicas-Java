package uno;
public class torniqueteEspecial extends torniquete
{
	private String[] listaNombres;
	public torniqueteEspecial(int maximo, int minimo, String[] lista)
	{
		super(maximo, minimo);
		listaNombres = lista;
	}
	public boolean acceder(String nombre)
	{
		for(int i = 0; i < listaNombres.length; i++)
			if(listaNombres[i].equals(nombre))
				return true;
		return false;
	}
}//final