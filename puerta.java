package uno;
public class puerta 
{
	// atributos 
	private int estado;
	private boolean conLlave;
	// metodos 
	public puerta()
	{
		estado = 1; // 1 para abierto 2 para cerrado
		conLlave = false; // falso no tiene llave true tiene llave 
	}
	public boolean abrir()
	{
		if (estado == 2 && conLlave == false)
			return true;
		return false;
	}
	public boolean cerrar()
	{
		if (estado == 1)
			return true;
		return false;
	}
	public boolean ponerllave()
	{
		if (estado == 2 && conLlave == false)
		{
			conLlave= true;
			return true;
		}
		return false;
	}
	public boolean quitarllave()
	{
		if (estado == 2 && conLlave == true)
		{
			conLlave = false;
			return true;
		}
		return false;
	}
}
