package lista03q02;

public class Quadrado {
	float lado;
	
	public double CalcularDiagonal()
	{
		return Math.sqrt(Math.pow(lado,2)+Math.pow(lado, 2));
	}
	
	public float CalcularPerimetro()
	{
		return (4*lado);
	}
	
	public float CalcularArea()
	{
		return (lado*lado);
	}
}
