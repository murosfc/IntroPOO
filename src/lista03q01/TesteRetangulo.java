package lista03q01;

public class TesteRetangulo
{
	public static void main(String[] args)
	{
		Retangulo objetoRetangulo = new Retangulo();
		
		objetoRetangulo.base = 10;
		objetoRetangulo.altura = 5;
		
		System.out.println("Área do retângulo = " + objetoRetangulo.calculcarArea());
		System.out.println("Perimetro do retângulo = " + objetoRetangulo.calcularPerimetro());
		System.out.println("Diagonal do retângulo = " + objetoRetangulo.calcularDiagonal());

	}
}
