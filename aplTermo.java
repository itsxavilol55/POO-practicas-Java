package uno;
import practicas.bacteria;
public class aplTermo
{
	public static void main(String[] args)
	{
//		termo term1 = new termo();
//		term1.quitarTapa();
//		term1.ponerLiquido(700);
//		term1.ponerTapa();
//		term1.abrirCambiador();
//		term1.tomar();
		bacteria bac1 = new bacteria(3);
		bac1.comeparticula(3);
		bac1.comeparticula(6);
		bacteria bac2 = new bacteria(3);
		bac1.comerBac(bac2);
		
	}
}
