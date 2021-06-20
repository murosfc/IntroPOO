package lista03q05;

public class NumeroInteiro
{	
	int numero;
	
	public int CalcularSoma (int num)
	{
		return numero+num;
	}	
	public int CalcularSubtracao (int num)
	{
		return numero-num;
	}
	public float CalcularDivisao (int Divisor)
	{
		return numero/Divisor;
	}
	public int CalcularProduto (int num)
	{
		return numero*num;
	}
	public int CalcularModuloDivisao (int Divisor)
	{
		return numero%Divisor;
	}
	public double CalcularRaiz()
	{
		return Math.sqrt(numero);
	}
	public double CalularPotencia (int Expoente)
	{
		return Math.pow(numero, Expoente);
	}

}
