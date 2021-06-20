package lista03q06;

public class PlanoCartesiano {
	float CoordenadaX,CoordenadaY;
	
	public double CalcularDistanciaPontos (PlanoCartesiano Objeto)
	{
		return Math.sqrt(Math.pow((CoordenadaX-Objeto.CoordenadaX),2)+Math.pow((CoordenadaY-Objeto.CoordenadaY),2));
	}
	public String CalcularProdutoCartesiano (PlanoCartesiano Objeto)
	{
		return ("{("+ Objeto.CoordenadaX +","+CoordenadaX+");("+ Objeto.CoordenadaX +","+CoordenadaY+");("+ Objeto.CoordenadaY +","+CoordenadaX+");("+ Objeto.CoordenadaY +","+CoordenadaY+")}");
		
	}

}
