package uno;
class corazon
{
	int normal;
	int pulsaciones;
	int aumento;
	int aumentoCam;
	int aumentoCorre;
	int disminuye;
	public corazon(int tipo)
	{
		if(tipo == 1)
		{
			pulsaciones = (int) (Math.random() * 32) + 56;
			aumento = 14;
			normal = aumento + pulsaciones * 1;
			aumentoCam = (int) ((pulsaciones + aumento) * 0.03);
			aumentoCorre = 20;
			disminuye = 2;
		}
		if(tipo == 2)
		{
			pulsaciones = (int) (Math.random() * 40) + 50;
			aumento = 10;
			normal = aumento + pulsaciones * 1;
			aumentoCam = (int) ((pulsaciones + aumento) * 0.07);
			aumentoCorre = 35;
			disminuye= (int) (pulsaciones*0.5);
		}
		if(tipo == 3)
		{
			pulsaciones = (int) (Math.random() * 35) + 45;
			aumento = 5;
			normal = aumento + pulsaciones * 1;
			aumentoCam = (int) ((pulsaciones + aumento) * 0.05);
			aumentoCorre = 30;
			disminuye = 1;
		}
		System.out.println("pulsaciones:" + pulsaciones);
	}
	public int getPulsaciones()
	{
		return pulsaciones;
	}
	public void setPulsaciones(int pulsaciones)
	{
		this.pulsaciones = pulsaciones;
	}
	public int getAumento()
	{
		return aumento;
	}
	public void setAumento(int aumento)
	{
		this.aumento = aumento;
	}
	public int getAumentoCam()
	{
		return aumentoCam;
	}
	public void setAumentoCam(int aumentoCam)
	{
		this.aumentoCam = aumentoCam;
	}
	public int getAumentoCorre()
	{
		return aumentoCorre;
	}
	public void setAumentoCorre(int aumentoCorre)
	{
		this.aumentoCorre = aumentoCorre;
	}
	public int getNormal()
	{
		return normal;
	}
	public void setNormal(int normal)
	{
		this.normal = normal;
	}
	public int getDisminuye()
	{
		return disminuye;
	}
	public void setDisminuye(int disminuye)
	{
		this.disminuye = disminuye;
	}
}
public class persona
{
	boolean despierto;
	int tipoPer;
	corazon corazonPer;
	public persona(int tipo)
	{
		despierto = false;
		tipoPer = tipo;
		corazonPer = new corazon(tipo);
	}
	public void despertar()
	{
		if(despierto)
		{
			System.out.println("no se puede despertar, esta despierto");
			return;
		}
		despierto = true;
		corazonPer.setPulsaciones(corazonPer.getPulsaciones() + corazonPer.getAumento());
		System.out.println("pulsaciones: " + corazonPer.getPulsaciones());
	}
	public void caminar()
	{
		if(!despierto) 
		{
			System.out.println("no se puede caminar, esta dormido");
			return;
		}
		corazonPer.setPulsaciones(corazonPer.getPulsaciones() + corazonPer.getAumentoCam());
		System.out.println("pulsaciones: " + corazonPer.getPulsaciones());
	}
	public void correr()
	{
		if(!despierto)
		{
			System.out.println("no se puede correr, esta dormido");
			return;
		}
		corazonPer.setPulsaciones(corazonPer.getPulsaciones() + corazonPer.getAumentoCorre());
		System.out.println("pulsaciones: " + corazonPer.getPulsaciones());
	}
	public void parar() throws InterruptedException
	{
		while(corazonPer.getPulsaciones()>corazonPer.getNormal())
		{
			corazonPer.setPulsaciones(corazonPer.getPulsaciones()-corazonPer.getDisminuye());
			System.out.println("pulsaciones: " + corazonPer.getPulsaciones());
			Thread.sleep(500);
		}
	}
}
