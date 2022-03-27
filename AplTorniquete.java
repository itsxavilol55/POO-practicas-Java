package uno;
public class AplTorniquete
{
	public static void main(String[] args)
	{
		String [] lista = new String[7];
		lista[0]= "javi";
		torniquete tor1 = new torniquete(1000,400);//numero maximo y minimo al que llega el rango
		torniqueteEspecial torn12 =new torniqueteEspecial(10131, 2323, lista);
		System.out.println(torn12.acceder("javi"));
		tor1.acceder(1311);
	}
}
