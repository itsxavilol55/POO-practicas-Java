package uno;
public class jaba
{
	private int filas;
	private int columnas;
	private int [][] jabaV;
	private int [][] repetc;
	private int contador=0;
	
	public jaba()
	{
		columnas = (int) ((Math.random()*4)+5);
		filas = (int) ((Math.random()*3)+3);
		jabaV = new int [filas][columnas];
		repetc = new int [filas][columnas];
	}
	
	public void reporte()
	{
		for (int i =0; i <filas; i++)
		{
			for (int j =0; j <columnas; j++)
			{
				if (repetc[i][j]>0)
					System.out.println("cordenadas: ("+ i+","+j+") repeticiones: "+repetc[i][j]);
			}
		}
		System.out.println("veces que se intento poner una botella en lugar ocupado cuando solo quedaba un espacio: "+contador);
	}
	
	public void llenadoSecuencial()
	{
		int tipo = (int) (Math.random()*3)+1;
		for (int i =0; i <filas; i++)
		{
			for (int j =0; j <columnas; j++)
				jabaV[i][j]=tipo;
		}
	}
	
	public void llenadorandom()
	{
		int filasrandom=0,columnasrandom=0,tipo=0;
		for (int i =0; i <filas*columnas; i=i+0)
		{
			filasrandom = (int) (Math.random()*filas);
			columnasrandom = (int) (Math.random()*columnas);
			tipo = (int) (Math.random()*3)+1;
			if (jabaV[filasrandom][columnasrandom]==0)
			{
				jabaV[filasrandom][columnasrandom] = tipo;
				i++;
			} 
			else
				repetc[filasrandom][columnasrandom]++;
			
			if(i == filas*columnas-1 && jabaV[filasrandom][columnasrandom]>0) 
				contador++; // la puse como parametro para poder usarla
							//en el metodo reporte y no volver a hacer todo
		}
	}
	public void vaciar()
	{
		for (int i =0; i <filas; i++)
			for (int j =0; j <columnas; j++)
				jabaV[i][j]=0;
	}
	public void imprime()
	{
		String tipo = " ";
		for (int i =0; i <filas; i++)
		{
			for (int j =0; j <columnas; j++)
			{
				if(jabaV[i][j]== 1) tipo ="|  coca-cola |";
				if(jabaV[i][j]== 2) tipo ="|    fanta   |";
				if(jabaV[i][j]== 3) tipo ="|agua mineral|";
				System.out.printf("%s",tipo);
			}
			System.out.println();
		}
		System.out.println();
	}
}
