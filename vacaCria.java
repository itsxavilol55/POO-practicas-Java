package uno;
public class vacaCria extends vaca
{
	public vacaCria()
	{
		super();
	}
	public boolean orde�ar(int hora)
	{
		if(hora == 6 && getUltimaHora() == 0)
			return super.orde�ar(hora);
		if(isTieneCrias() && getUltimaHora() ==6)
			return false;
		if(hora != 6 || hora != 20 )
			return false;
		setLitrosTotalesDia(getLitrosTotalesDia() + ((float) (Math.random() * 3) + 3));
		return true;
	}
}
