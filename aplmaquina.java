package uno;

public class aplmaquina
{
	public static void main(String[] args)
	{
		maquina ma1 = new maquina();
		ma1.slots(1,"au",500);
		ma1.colaca(1, "xiaomi", "negro" );// slot, marca, color
		ma1.pagar(1000, 1);
		ma1.obtener("xiaomi",1);
		ma1.obtener("xiaomi","negro", 1);
	}
}
