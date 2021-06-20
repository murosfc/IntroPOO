package lista03q02;

public class TesteQuadrado {

	public static void main(String[] args) {
		Quadrado ObjetoQuadrado = new Quadrado();
		
		ObjetoQuadrado.lado = 6;
		
		System.out.println("Diagonal do quadrado = "+ ObjetoQuadrado.CalcularDiagonal());
		System.out.println("Perímetro do quadrado = " + ObjetoQuadrado.CalcularPerimetro());
		System.out.println("Área do quadrado = " + ObjetoQuadrado.CalcularArea());
	}

}
