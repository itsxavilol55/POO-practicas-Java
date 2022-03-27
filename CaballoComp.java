package uno;
public class CaballoComp extends CaballoHe
{
	private int EntrenamientoTotal;
	private int EntrenamientosDados;
	private int[] vectorInforme;
	public CaballoComp(String nombre)
	{
		super(nombre);
		EntrenamientoTotal = (int) (Math.random() * 5) + 4;
		vectorInforme = new int[EntrenamientoTotal];
		EntrenamientosDados = 0;
	}
	public String entrenar()
	{
		if(EntrenamientosDados >= EntrenamientoTotal)
			return "el caballo ya a dado todos sus entrenamientos por hoy";

		return comerComp();
	}
	private String comerComp()
	{
		int num = (int) (Math.random() * 4) + 2;
		if(num + CantidadComida > CantidadTotal)
		{
			CantidadComida = CantidadTotal;
			return "el caballo " + Nombre + " ya comio lo suficiente por hoy";
		}
		vectorInforme[EntrenamientosDados] = num;
		EntrenamientosDados++;
		CantidadComida += num;
		return "el caballo: " + Nombre + " ya comio y entreno";
	}
	public int getEntrenamientoTotal()
	{
		return EntrenamientoTotal;
	}
	public void setEntrenamientoTotal(int entrenamientoTotal)
	{
		EntrenamientoTotal = entrenamientoTotal;
	}
	public String informe()
	{
		System.out.println("Nombre del caballo: " + Nombre);
		for(int i = 0; i < vectorInforme.length; i++)
		{
			System.out.println("Entrenamiento " + (i + 1) + ", comio: " + vectorInforme[i]);
		}
		return null;
	}
}
