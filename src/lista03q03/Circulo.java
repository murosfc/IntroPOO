package lista03q03;

public class Circulo {
	float raio;	
	
	public double CalcularArea()
	{
		return Math.PI*Math.pow(raio, 2);
	}
	public double CalcularPerimetro()
	{
		return 2*Math.PI*raio;
	}
	
	public float CalcularDiametro()
	{
		return 2*raio;
	}
}
