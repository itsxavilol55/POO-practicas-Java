package uno;
//alumno: Javier Eduardo Lopez Ontiveros
//No.Control: 20170727 hora: 9am a 10pm
//porfesor: DR Clemente Garcia Gerardo 
class dispositivo 
{
	private String marca;
	private String clave;
	private String color; 
	private int numeroDeserie;
	private int precio;
	private boolean pagado;
	private boolean ocuapado;
	
	public dispositivo()
	{
		marca="";
		clave ="";
		numeroDeserie=0;
		color = "";
		precio = 0;
		pagado = false;
		ocuapado = false;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getClave()
	{
		return clave;
	}

	public void setClave(String clave)
	{
		this.clave = clave;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getPrecio()
	{
		return precio;
	}

	public void setPrecio(int precio)
	{
		this.precio = precio;
	}

	public boolean isPagado()
	{
		return pagado;
	}

	public void setPagado(boolean pagado)
	{
		this.pagado = pagado;
	}

	public int getNumeroDeserie()
	{
		return numeroDeserie;
	}

	public void setNumeroDeserie(int numeroDeserie)
	{
		this.numeroDeserie = numeroDeserie;
	}

	public boolean isOcuapado()
	{
		return ocuapado;
	}

	public void setOcuapado(boolean ocuapado)
	{
		this.ocuapado = ocuapado;
	}
}

public class maquina
{
	private int slots;
	private int capacidad;
	private dispositivo [][] disp;
	
	public maquina() 
	{
		slots = 6;
		capacidad = 20; 
		disp = new dispositivo[slots][capacidad];
	}
	
	public void slots(int slot, String tipo, int precio) // le asigna a cada slot el tipo de dispositivo, precio, numerodeserie 
	{
		slot = slot -1;
		for( int i = 0; i < capacidad; i++)
		{
			disp[slot][i].setClave(tipo);
			disp[slot][i].setPrecio(precio);
			disp[slot][i].setNumeroDeserie(i+1);
		}
	}
	public void colaca(int slot, String color, String marca)
	{
		slot = slot -1;
		for (int i=0; i<capacidad; i++)
			if(!disp[slot][i].isOcuapado())
			{
				disp[slot][i].setMarca(marca);
				disp[slot][i].setColor(color);
			}
			else
			{
				disp[slot][i+1].setMarca(marca);
				disp[slot][i+1].setColor(color);
			}
	}
						//slot del producto que se quiere pagar
	public void pagar(int i, int slot)
	{
		slot = slot -1;
		disp[slot][0].setPagado(true);
	}

	public void obtener(String marca, int slot)
	{
		if(disp[slot][0].isPagado())
		{
			for(int i=0; i<capacidad; i++)
			{
				if(disp[slot][i].getMarca()==marca)
				{
					System.out.println("el producto se entrego correctamente ");
					return;
				}
				else 
				{
					System.out.println("no se encontro la marca");
					return;
				}
			}
		}
		else 
			System.out.println("el producto aun no es pagado ");
	}

	public void obtener(String marca, String color, int slot)
	{
		if(disp[slot][0].isPagado())
		{
			for(int i=0; i<capacidad; i++)
			{
				if(disp[slot][i].getMarca()==marca && disp[slot][i].getColor()== color)
				{
					System.out.println("el producto se entrego correctamente ");
					return;
				}
				else 
				{
					System.out.println("no se encontro la marca ni el color");
					return;
				}
			}
		}
		else 
			System.out.println("el producto aun no es pagado ");
	}
}
