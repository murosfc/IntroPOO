package lista03q06;

public class TestePlanoCartesiano {

	public static void main(String[] args) {
		PlanoCartesiano ObjPC1 = new PlanoCartesiano();
		PlanoCartesiano ObjPC2 = new PlanoCartesiano();
		
		ObjPC1.CoordenadaX = 3;
		ObjPC1.CoordenadaY = 2;
		
		ObjPC2.CoordenadaX = 5;
		ObjPC2.CoordenadaY = 6;
		
		System.out.println ("Distância entre os pontos = " + ObjPC1.CalcularDistanciaPontos(ObjPC2));
		System.out.println ("Produto cartesiano dos pontos = " + ObjPC1.CalcularProdutoCartesiano(ObjPC2));

	}

}
