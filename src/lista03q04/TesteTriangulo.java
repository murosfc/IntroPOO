package lista03q04;

public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo ObjTriangulo = new Triangulo();
		
		ObjTriangulo.LadoA = 4;
		ObjTriangulo.LadoB = 4;
		ObjTriangulo.LadoC = 4;
		
		System.out.println ("O tri�ngulo � do tipo "+ObjTriangulo.VerificarTipo());
		if (ObjTriangulo.RetornarHipotenusa() != 0)
			System.out.println ("Hipotenusa do trin�ngulo = "+ObjTriangulo.RetornarHipotenusa());
		System.out.println ("A �rea do tri�ngulo � = " + ObjTriangulo.CalcularArea());
		System.out.println ("O per�mentro do tri�ngulo � = " + ObjTriangulo.CalcularPerimetro());	

	}

}
