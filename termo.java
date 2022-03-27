package uno;
class tapa
{
	boolean puesta;
	abreYcierra cambiador;
	public tapa()
	{
		puesta = true;
		cambiador = new abreYcierra();
	}
	public boolean isPuesta()
	{
		return puesta;
	}
	public void setPuesta(boolean puesta)
	{
		this.puesta = puesta;
	}
	public abreYcierra getCambiador()
	{
		return cambiador;
	}
	public void setCambiador(abreYcierra cambiador)
	{
		this.cambiador = cambiador;
	}
}
class abreYcierra
{
	boolean abierto;
	public abreYcierra()
	{
		abierto = false;
	}
	public boolean isAbierto()
	{
		return abierto;
	}
	public void setAbierto(boolean abierto)
	{
		this.abierto = abierto;
	}
}
public class termo
{
	private tapa tapaVar;
	private contenedor conte;
	public termo()
	{
		tapaVar = new tapa();
		conte   = new contenedor();
	}
	public void ponerLiquido(int ml)
	{
		if(tapaVar.isPuesta())
		{
			System.out.println("no se puede llenar con la tapa puesta");
			return;
		}
		if(conte.getCantidad() + ml >= conte.getTotal())	
		{
			ml= conte.getTotal() - conte.getCantidad();
			System.out.println("el termo se a llenado");
		}
		conte.setCantidad(ml + conte.getCantidad());
		return;
	}
	public void quitarTapa()
	{
		if(!tapaVar.isPuesta())
		{
			System.out.println("no se puede quitar sin la tapa puesta");
			return;
		}
		tapaVar.setPuesta(false);
		System.out.println("la tapa se a quiatado");
		return;
		
	}
	public void tomar()
	{
		if(!tapaVar.isPuesta() || !tapaVar.getCambiador().isAbierto() || conte.getCantidad()<=0)
		{
			System.out.println("no se puede tomar en estas condiciones ");
			return;
		} 
		int num = (int) (Math.random()*3)+1; // no supe como se determinaba el tipo de trago asi que le puse un random
		int mlBebidos=0;
		if(num==1) mlBebidos = (int) (Math.random()*3)+1; //trago chico, 1 a 3ml
		if(num==2) mlBebidos = (int) (Math.random()*4)+4; //trago mediano 4 a 7ml
		if(num==3) mlBebidos = (int) (Math.random()*5)+8; //trago grande 8 a 12ml
		conte.setCantidad(conte.getCantidad()-mlBebidos);
		System.out.println("se pudo tomar correctamente " + mlBebidos + "ml");
		if(conte.getCantidad()<= 0) 
		{
			System.out.println("el termo se ha vaciado, llenar de nuevo");
			conte.setCantidad(0);
		}
		return;
	}
	public void abrirCambiador()
	{
		if(!tapaVar.isPuesta() || tapaVar.getCambiador().isAbierto())
		{
			System.out.println("no se puede cambiar estando asi ");
			return;
		}
		tapaVar.getCambiador().setAbierto(true);
		System.out.println("se abierto correctamente");
	}
	public void ponerTapa()
	{
		if(tapaVar.isPuesta())
		{
			System.out.println("no se puede poner la tapa");
			return;
		}
		tapaVar.setPuesta(true);
		System.out.println("la tapa se a puesto");
		return;
	}
}//linea final
