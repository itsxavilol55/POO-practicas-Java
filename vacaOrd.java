package uno;
public class vacaOrd extends vaca
{
	public vacaOrd() 
	{
		super();
	}
	public boolean orde�ar(int hora)
	{
		if(hora == 6 && getUltimaHora() == 0)
			return super.orde�ar(hora);
		if(!isTieneCrias())
			if(hora - getUltimaHora() < 2 || hora > 20)
				return false;
		if(hora - getUltimaHora() < 3 || hora > 20)
			return false;
		setLitrosTotalesDia(getLitrosTotalesDia() + ((float) (Math.random() * 11) + 20));
		return true;
	}
}
