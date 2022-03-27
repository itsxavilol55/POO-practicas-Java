package uno;
public class llena
{
	public static void main(String[] args)
	{ 
		int [] nume = new int [10];
		ingresa(10,nume);
		ingresa(1012,nume);
		ingresa(101232422,nume);
		ingresa(7,nume);
		ingresa(8,nume);
		imprime(nume);
	}

	private static void imprime(int[] nume)
	{
		for (int j = 0; j <nume.length; j++)
			System.out.println((j+1)+" "+nume[j]); 
	}

	private static void ingresa(int i, int[] nume)
	{
		for (int j = 0; j <nume.length; j++)
		{
			if(nume[0]==0)
			{
				 nume[0]=i;
				 return; 
			}
			if (nume[j]==0 && nume[0]>0)
			{
				for(int k=j; k>=0;k--)
				{
					nume[k+1]=nume[k];
				}
				nume[0]=i;
				return; 
			}
		}
	}
}
