package lista03q03;

public class TesteCirculo {

	public static void main(String[] args) {
		Circulo ObjetoCirculo = new Circulo();
		
		ObjetoCirculo.raio = 5;
		
		System.out.println ("Diâmetro do circulo = " + ObjetoCirculo.CalcularDiametro());
		System.out.println ("Área do circulo = " + ObjetoCirculo.CalcularArea());
		System.out.println ("Perímetro do ciculo =" +ObjetoCirculo.CalcularPerimetro());

	}

}
