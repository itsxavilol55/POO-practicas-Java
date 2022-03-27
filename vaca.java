package uno;
public class vaca
{
	private boolean TieneCrias;
	private int UltimaHora;
	private float litrosTotalesDia;
	public boolean isTieneCrias()
	{
		return TieneCrias;
	}
	public void setTieneCrias(boolean tieneCrias)
	{
		TieneCrias = tieneCrias;
	}
	public int getUltimaHora()
	{
		return UltimaHora;
	}
	public void setUltimaHora(int ultimaHora)
	{
		UltimaHora = ultimaHora;
	}
	public float getLitrosTotalesDia()
	{
		return litrosTotalesDia;
	}
	public void setLitrosTotalesDia(float litrosTotalesDia)
	{
		this.litrosTotalesDia = litrosTotalesDia;
	}
	public vaca()
	{
		TieneCrias = false;
		UltimaHora = 0;
		litrosTotalesDia = 0;
	}
	public boolean ordeñar(int hora)
	{
		if(hora != 6 || UltimaHora != 0) return false;
		UltimaHora = hora;
		if(!TieneCrias)
			litrosTotalesDia += (float) (Math.random() * 1) + 4;
		else
			litrosTotalesDia += ((float) (Math.random() * 2) + 4) * 0.80;
		return true;
	}
}