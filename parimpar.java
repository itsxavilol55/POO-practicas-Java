package uno;
public class parimpar
{
	public static void main(String[] args) 
	{
		int a, b , c;
		System.out.println("ingresa el valor de a:");
		a = Leer.datoInt(null);
		System.out.println("ingresa el valor de b:");
		b = Leer.datoInt(null);
		System.out.println("ingresa el valor de c:");
		c = Leer.datoInt(null);
		
		int valorMayor = mayor(a,b,c);
		int valorMenor = menor(a,b,c);
		boolean par = pares(a,b,c);
		System.out.println("el valor mayor es:" + valorMayor);
		System.out.println("el valor menor es:" + valorMenor);
		System.out.println("hay valores pares:" + par);

	}

	private static boolean pares(int a, int b, int c)
	{
		boolean par=false;
		if (a == b || a == c ) par = true; 
		if (b == a || b == c ) par = true;
		if (c == b || c == a ) par = true;
		return par;
	}

	private static int menor(int a, int b, int c)
	{
		int menor=0;
		if (a <= b && a <= c ) menor = a;
		if (b <= a && b <= c ) menor = b;
		if (c <= b && c <= a ) menor = c;
		return menor;
	}

	private static int mayor(int a, int b, int c)
	{
		int mayor=0;
		if (a >= b && a >= c ) mayor = a;
		if (b >= a && b >= c ) mayor = b;
		if (c >= b && c >= a ) mayor = c;
		return mayor;
	}
}
