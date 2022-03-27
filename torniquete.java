package uno;
public class torniquete
{
	private int NumMayor;
	private int NumMenor;
	private int CantPorPersona;
	private int [] VecesPorPersona;
	public torniquete(int maximo, int minimo)
	{
		NumMayor = maximo;
		NumMenor = minimo;
		CantPorPersona = (int) (Math.random() * minimo);
		VecesPorPersona = new int[maximo+1];
	}
	public boolean acceder(int codigo)
	{
		if(codigo > NumMayor || codigo < NumMenor)
			return false;
		if(VecesPorPersona[codigo] > CantPorPersona)
			return false;
		VecesPorPersona[codigo]++;
		return true;
	}
}//final