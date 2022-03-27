package uno;
public class CaballoHe
{
	protected int CantidadTotal;
	protected int CantidadComida;
	protected String Nombre;
	public CaballoHe(String nombre)
	{
		Nombre = nombre;
		CantidadTotal = (int) (Math.random() * 11) + 10;
		CantidadComida = 0;
	}
	public String comer()
	{
		int num = (int) (Math.random() * 2) + 1;
		System.out.println(num + " " + CantidadTotal);
		if(num + CantidadComida > CantidadTotal)
		{
			CantidadComida = CantidadTotal;
			return "el caballo" + Nombre + "ya comio lo suficiente por hoy";
		}
		CantidadComida += num;
		return "el caballo: " + Nombre + " ya comio";
	}
	public int getCantidadComidaDia()
	{
		return CantidadTotal;
	}
	public void setCantidadComidaDia(int cantidadComidaDia)
	{
		CantidadTotal = cantidadComidaDia;
	}
	public String getNombre()
	{
		return Nombre;
	}
	public void setNombre(String nombre)
	{
		Nombre = nombre;
	}
}
