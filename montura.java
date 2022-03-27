package uno;
//javier eduardo lopez ontiveros 
//9am a 10pm
//examen tercer parcial 
//DR Clemente Garcia Gerardo
public class montura
{
	private boolean estaDesinfectada;
	private boolean estaPuesta;
	private int nivelAjuste;
	private int paseosDisponibles;
	public montura()
	{
		estaDesinfectada = true;
		estaPuesta = false;
		nivelAjuste = 0;
	}
	public boolean isEstaDesinfectada()
	{
		return estaDesinfectada;
	}
	public void setEstaDesinfectada(boolean estaDesinfectada)
	{
		this.estaDesinfectada = estaDesinfectada;
	}
	public boolean isEstaPuesta()
	{
		return estaPuesta;
	}
	public void setEstaPuesta(boolean estaPuesta)
	{
		this.estaPuesta = estaPuesta;
	}
	public int getNivelAjuste()
	{
		return nivelAjuste;
	}
	public void setNivelAjuste(int nivelAjuste)
	{
		this.nivelAjuste = nivelAjuste;
	}
	public int getPaseosDisponibles()
	{
		return paseosDisponibles;
	}
	public void setPaseosDisponibles(int paseosDisponibles)
	{
		this.paseosDisponibles = paseosDisponibles;
	}
}// liena final