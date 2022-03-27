package uno;
public class aplpersona
{
	public static void main(String[] args) throws InterruptedException
	{
		persona pers1 = new persona(1);
		pers1.despertar();
		pers1.caminar();
		pers1.correr();
		System.out.println();
		pers1.parar();
	}
}
