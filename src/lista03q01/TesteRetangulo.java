package lista03q01;

public class TesteRetangulo
{
	public static void main(String[] args)
	{
		Retangulo objetoRetangulo = new Retangulo();
		
		objetoRetangulo.base = 10;
		objetoRetangulo.altura = 5;
		
		System.out.println("�rea do ret�ngulo = " + objetoRetangulo.calculcarArea());
		System.out.println("Perimetro do ret�ngulo = " + objetoRetangulo.calcularPerimetro());
		System.out.println("Diagonal do ret�ngulo = " + objetoRetangulo.calcularDiagonal());

	}
}
