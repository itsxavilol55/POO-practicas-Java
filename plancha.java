package uno;
class contenedor // de liquidos
{
	int cantidad;
	int total;
	public contenedor()
	{
		cantidad=0;
		total=500;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	public int getTotal()
	{
		return total;
	}
	public void setTotal(int total)
	{
		this.total = total;
	}
}

class selector 
{
	boolean encendido;
	int tempe;
	public selector()
	{
		encendido =false;
		tempe =0;
	}
	public boolean isEncendido()
	{
		return encendido;
	}
	public void setEncendido(boolean encendido)
	{
		this.encendido = encendido;
	}
	public int getTempe()
	{
		return tempe;
	}
	public void setTempe(int tempe)
	{
		this.tempe = tempe;
	}
}

class placa
{
	double longitud;
	public placa()
	{
		longitud = 2.5;
	}
	public double getLongitud()
	{
		return longitud;
	}
	public void setLongitud(double longitud)
	{
		this.longitud = longitud;
	}
}
public class plancha
{
	private contenedor conte;
	private selector selec;
	private placa plac;
	public plancha()
	{
		conte = new contenedor();
		selec = new selector();
		plac  = new placa(); 
	}
	public void encender()
	{
		if(selec.isEncendido() || conte.getCantidad()<20 || plac.getLongitud()<0.2)
			System.out.println("la plancha no se pudo encender, ya esta encendida o no esta en condiciones");
		else{
			selec.setEncendido(true);
			selec.setTempe(1);
			System.out.println("la plancha se pudo encender correctamente");
		}
	}
	public void subirNivel()
	{
		if(selec.getTempe()>=1 && selec.getTempe()<3)
		{
			selec.setTempe(selec.getTempe()+1);
			System.out.println("se pudo subir la temperatura correctamente");
		}
		else 
			System.out.println("no se puede subir de nivel ya esta al maximo o esta apagada");
	}
	public void ponerAgua(int ml)
	{
		if(conte.getCantidad() + ml >= conte.getTotal())	
		{
			ml= conte.getTotal() - conte.getCantidad();
			System.out.println("la plancha esta llena");
		}
		conte.setCantidad(ml + conte.getCantidad());
	}
}
