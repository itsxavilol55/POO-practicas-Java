package uno;
public class COCAXD 
{
	public static void main(String[] args) 
	{
		int dias = (int) ((Math.random()*6)+5);
		int [] dia = new int[dias]; 
		System.out.println(dias);
		asignacion(dia);
	}

	private static void asignacion(int[] dia)
	{
		for(int i=0; i<dia.length;i++)
		{
			System.out.println("\ndia: "+ (i+1));
			int NumRefrescos = (int) (Math.random()*11)+10;
			int [][] soda = new int [NumRefrescos][5];
			for (int k=0; k<5; k++)
			{			
				System.out.println("departamento: "+(k+1));
				for(int j=0;j<NumRefrescos;j++)
				{
					int a = (int) (Math.random()*101)+0;
					soda[j][k] = a;
					System.out.print(soda[j][k]+"  ");
				}
				System.out.println();
			}
		}
	}
}
