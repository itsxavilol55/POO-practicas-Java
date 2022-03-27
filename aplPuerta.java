package uno;
public class aplPuerta 
{
	public static void main(String[] args) 
	{
		puerta p1 = new puerta();
		if (p1.abrir())
			System.out.println("la puerta fue abierta");
		else
			System.out.println("la puerta no fue abierta(ya esta abierta)");
		
		if (p1.cerrar())
			System.out.println("la puerta fue cerrada");
		else
			System.out.println("la puerta no fue cerrada(ya esta cerrrada)");
		
	}
}
