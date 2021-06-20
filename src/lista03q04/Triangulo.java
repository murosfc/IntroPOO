package lista03q04;

public class Triangulo {
	float LadoA, LadoB, LadoC;
	
	public String VerificarTipo()
	{
		float hipotenusa, cateto1, cateto2;
		if (LadoA == LadoB && LadoB == LadoC)
			return "Equilátero";
		else if (LadoA == LadoB || LadoA == LadoC || LadoB == LadoC)
			return "Isósceles";
		else
		{
			if (LadoA>LadoC && LadoA>LadoB)
			{
				hipotenusa=LadoA;
				cateto1 = LadoB;
				cateto2 = LadoC;			
			}
			else if (LadoB>LadoA && LadoB>LadoC)
			{
				hipotenusa=LadoB;
				cateto1 = LadoA;
				cateto2 = LadoC;
			}
			else
			{
				hipotenusa=LadoC;
				cateto1 = LadoA;
				cateto2 = LadoB;
			}
			if (hipotenusa == Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2,2)))
			{
				return "Escaleno e Retângulo";
			}
			return "Escaleno";
		}
	}
	
	public float RetornarHipotenusa()
	{
		float hipotenusa = 0;
		if (this.VerificarTipo() == "Escaleno e Retângulo")
		{
			if (LadoA>LadoC && LadoA>LadoB)
				hipotenusa=LadoA;
			else if (LadoB>LadoA && LadoB>LadoC)
				hipotenusa=LadoB;			
			else			
				hipotenusa=LadoC;
			return hipotenusa;			
		}
		else return 0;		
	}	

	public double CalcularArea()
	{
		if (this.VerificarTipo()=="Equilátero")
		{
			return LadoA*(LadoA*Math.sqrt(3))/2;
		}
		else if (this.VerificarTipo()=="Isósceles")
		{
			float base=LadoA, hipotenusa=LadoB;	//base é o lado maior que será dividio por 2 para formar trinângulo retângulo		
			if (LadoB > base)
			{
				base=LadoB;
				hipotenusa=LadoA;
			}
			if (LadoC > base)			
				base=LadoC;			
			return base*Math.sqrt(Math.pow(hipotenusa,2)+Math.pow(base/2, 2))/2;				
		}
		else if (this.VerificarTipo()=="Escaleno e Retângulo")
		{
			float hipotenusa=LadoA, base=LadoB, altura=LadoC;
			if (LadoB>hipotenusa)
			{
				hipotenusa=LadoB;
				base=LadoA;				
			} 
			else if (LadoC>hipotenusa)
			{
				hipotenusa=LadoC;
				altura=LadoA;
			}
			return base*altura/2;
		}
		//escale com a fórmula de Heron
		else 
		{
			float p = this.CalcularPerimetro()/2; //p é o semiperímetro
			return Math.sqrt(p*(p-LadoA)*(p-LadoB)*(p-LadoC));
		}
	}

	public float CalcularPerimetro()
	{
		return LadoA+LadoB+LadoC;
	}
}
