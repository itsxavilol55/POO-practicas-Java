package uno;
public class practicas 
{
	public static void main(String[] args)
	{
		m17();
		m5();

	}

	private static void m5()
	{
		int a = (int) (Math.random()*11);
		String []letras= {"uno","dos","tres","cuatro","sinco","seis","siete","ocho","nueve", "dies"};
		System.out.print(a+" "+ letras[a-1] );
		
	}

	private static void m17() 
	{
		int a = (int) (Math.random()*100);
		double decenas = a /10;
		//decenas = decenas*10;
		System.out.println(a +" decenas: "+ (decenas));
	}
}
