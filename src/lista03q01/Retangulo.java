package lista03q01;

public class Retangulo {
	float base, altura;
	
	public float calculcarArea()
	{
		return base*altura;
	}
	
	public float calcularPerimetro()
	{
		return 2*(base+altura);
	}
	public double calcularDiagonal()
	{
		return Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
	}

}
