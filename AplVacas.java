package uno;
public class AplVacas
{
	public static void main(String[] args)
	{
		vaca vaca1 = new vaca();
		vacaOrd vaca2 = new vacaOrd();
		vacaCria vaca3 = new vacaCria();
		vaca1.orde�ar(6);
		vaca2.orde�ar(6);
		vaca3.orde�ar(6);
		int a[] = Leer.random(5, 11, 20);
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	
}
