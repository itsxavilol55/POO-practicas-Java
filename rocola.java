package uno;
class disco 
{
	private String nombreartista;
	private String nombreCancionA;
	private String nombreCancionB;
	private boolean ocupado;
	
	public disco()
	{
		nombreartista = "";
		nombreCancionA = "";
		nombreCancionB = "";
		ocupado = false;
	}
	public String getNombreartista() {	return nombreartista;	}
	public void setNombreartista(String nombreartista) { this.nombreartista = nombreartista; }
	
	public String getNombreCancionA() {	return nombreCancionA;	}
	public void setNombreCancionA(String nombreCancionA) {	this.nombreCancionA = nombreCancionA;	}
	
	public String getNombreCancionB() {	return nombreCancionB;}
	public void setNombreCancionB(String nombreCancionB) {	this.nombreCancionB = nombreCancionB; }
	
	public boolean isOcupado(){ return ocupado; }
	public void setOcupado(boolean ocupado){ this.ocupado = ocupado; }
}
public class rocola
{
	private int filas;
	private int columnas;
	private disco [][] rocola;
	private boolean pagada;
	
	public rocola (int fi, int co)
	{
		filas = fi;
		columnas = co;
		pagada = false;
		rocola=new disco[filas][columnas];
		for(int i=0 ; i< filas; i++) 
			for(int j=0 ; j< columnas; j++) 
				rocola[i][j]= new disco();
				
	}
	public void dowhile()
	{
		int si =0, fila=0, columna=0;
		char letra;
		do
		{
			System.out.println("en que fila quieres poner el disco, numero de filas = " + filas);
			fila = Leer.datoInt(null);
			System.out.println("en que columna quieres poner el disco, numero de columnas de 'a' hasta 'j' ");
			letra = Leer.datocar();
			columna = (int) letra-96;
			llenado(fila-1,columna-1);
			System.out.println("Quieres añadir otra cancion? (1 para si), (otro numero para no)");
			si = Leer.datoInt(null);
		} while(si==1);
		System.out.println("");
	}
	public void llenado(int fi, int col)
	{
		if(rocola[fi][col].isOcupado())
		{
			System.out.println("esta posicion esta ocupada ingresa otra");
			dowhile();
		}
		else 
		{
		System.out.println("ingresa nombre del artista");
		String artista = Leer.dato("eft");
		System.out.println("ingresa nombre de la cancion del lado A");
		String cancionA = Leer.dato(null);
		System.out.println("ingresa nombre de la cancion del lado B");
		String cancionB = Leer.dato("ofeo");
		rocola[fi][col].setNombreartista(artista);
		rocola[fi][col].setNombreCancionA(cancionA);
		rocola[fi][col].setNombreCancionB(cancionB);
		rocola[fi][col].setOcupado(true);
		}
		
	}
	public void imprime ()
	{
		System.out.println("lista de cancion disponibles");
		for(int i=0 ; i< filas; i++) 
		{
			for(int j=0 ; j< columnas; j++) 
			{
				System.out.println("("+ (i+1) + ","+ (char)(j+97)+")"
						+rocola[i][j].getNombreartista()+ " "
						+ rocola[i][j].getNombreCancionA() +" "
						+ rocola[i][j].getNombreCancionB());
			}
		}		
	}
	public void pago()
	{
		pagada = true;
	}
	
	public void reproducir(int fila, char columna, int lado)
	{
		if(pagada==true && rocola[fila][columna-96].isOcupado()==true )
		{
			if(lado == 1)
				System.out.println("reproduciendo:"+ rocola[fila][columna-96].getNombreCancionA() + "del artista:" + rocola[fila][columna-96].getNombreartista() );
			if(lado == 2)
				System.out.println("reproduciendo:"+ rocola[fila][columna-96].getNombreCancionB() + "del artista:" + rocola[fila][columna-96].getNombreartista() );
		}
		else
			System.out.println("la cancion no esta disponible o no esta pagada");
	}
	public int getFilas() {	return filas; }
	public void setFilas(int filas) {	this.filas = filas;	}
	
	public int getColumnas() { return columnas; }
	public void setColumnas(int columnas) { this.columnas = columnas; }	
}
