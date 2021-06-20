package lista03q04;

public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo ObjTriangulo = new Triangulo();
		
		ObjTriangulo.LadoA = 4;
		ObjTriangulo.LadoB = 4;
		ObjTriangulo.LadoC = 4;
		
		System.out.println ("O triângulo é do tipo "+ObjTriangulo.VerificarTipo());
		if (ObjTriangulo.RetornarHipotenusa() != 0)
			System.out.println ("Hipotenusa do trinângulo = "+ObjTriangulo.RetornarHipotenusa());
		System.out.println ("A área do triângulo é = " + ObjTriangulo.CalcularArea());
		System.out.println ("O perímentro do triângulo é = " + ObjTriangulo.CalcularPerimetro());	

	}

}
