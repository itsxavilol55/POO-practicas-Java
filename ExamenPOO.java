package uno;
public class ExamenPOO
{
	public static void main(String[] args)
	{
		int NV = (int) ((Math.random()*401)+100);
		int dias = (int) (Math.random()*6)+5;
		int []suma = new int[1]; 
		System.out.println("numeros de vacas: "+NV);
		int [][][] vacas = new int [NV][3][dias];
		asignacion(vacas,NV);
		ordena(vacas,dias,NV,suma);
		imprima(vacas,dias,NV,suma);
	}

	private static void imprima(int[][][] vacas, int dias, int NV, int[] suma)
	{
		String tipo ="";
		String variante ="";
		float porcentaje =0;
		System.out.printf("%s  %s      %s     %s  %s\n", "numero de vaca"," tipo", "variante","litros","porcetaje" );
		for (int k=0; k<NV; k++)
		{
			if (vacas[k][0][0]==1) tipo = "ordeña";
			if (vacas[k][0][0]==2)
			{
				tipo = "engorda"; 
				variante= "";
			}
			if (vacas[k][0][0]==1 && vacas[k][1][0]==1) variante = "corriente";
			if (vacas[k][0][0]==1 && vacas[k][1][0]==2 ) variante = "fina\t";
			porcentaje = ((vacas[k][2][0]*100.0f)/suma[0]);
			System.out.printf("    %4d         %s\t   %s\t  %4d    %s\n",(k+1),tipo,variante,vacas[k][2][0],porcentaje);
		}	
	}

	private static void ordena(int[][][] vacas, int dias, int NV, int[] suma)
	{
		for (int i =0; i<dias; i++) 
		{
			for(int j =0; j<NV; j++) //se ordeña desde la primer vaca hasta la ultima
			{
				if(vacas[i][0][0]==1)
				{   
					if(vacas[j][1][0]==1) vacas[j][2][0]= vacas[j][2][0] + (int) ((Math.random()*3)+3);
					if(vacas[j][1][0]==2) vacas[j][2][0]= vacas[j][2][0] + (int) ((Math.random()*11)+20);
				}
				if(vacas[j][0][0]==2) vacas[j][2][0]= vacas[j][2][0] + (int) ((Math.random()*2)+1);
				suma[0]= suma[0]+vacas[j][2][0];
			}
		}
		System.out.println("la suma de todos los litros fue: "+suma[0]);
	}

	private static void asignacion(int[][][] vacas, int nv) 
	{
		for(int i =0; i <nv;i++)
		{
			vacas[i][0][0]= (int) ((Math.random()*2)+1);
			if(vacas[i][0][0]==1) vacas[i][1][0]= (int) ((Math.random()*2)+1);
			if(vacas[i][0][0]==2) vacas[i][1][0]= 1;
			//System.out.println("numeros de vacas: "+ vacas[i][0][0] + " "+vacas[i][1][0]);
		}
	}
}
