package lista03q03;

public class TesteCirculo {

	public static void main(String[] args) {
		Circulo ObjetoCirculo = new Circulo();
		
		ObjetoCirculo.raio = 5;
		
		System.out.println ("Di�metro do circulo = " + ObjetoCirculo.CalcularDiametro());
		System.out.println ("�rea do circulo = " + ObjetoCirculo.CalcularArea());
		System.out.println ("Per�metro do ciculo =" +ObjetoCirculo.CalcularPerimetro());

	}

}
