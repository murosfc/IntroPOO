package lista03q05;

public class TesteNumeroInteiro {

	public static void main(String[] args) {
		NumeroInteiro ObjNumInt = new NumeroInteiro();
		
		ObjNumInt.numero = 10;
		int num=2;
		
		System.out.println ("Soma (" + ObjNumInt.numero + "+" +num +")= "+ ObjNumInt.CalcularSoma(num));
		System.out.println ("Subtra��o (" + ObjNumInt.numero + "-" +num +")= "+ ObjNumInt.CalcularSubtracao(num));
		System.out.println ("Divis�o (" + ObjNumInt.numero + "/" +num +")= "+ ObjNumInt.CalcularDivisao(num));
		System.out.println ("Produto (" + ObjNumInt.numero + "*" +num +")= "+ ObjNumInt.CalcularProduto(num));
		System.out.println ("M�dulo da divis�o (" + ObjNumInt.numero + "/" +num +")= "+ ObjNumInt.CalcularModuloDivisao(num));
		System.out.println ("Raiz Quadrada de "+ObjNumInt.numero+" = "+ ObjNumInt.CalcularRaiz());
		System.out.println (ObjNumInt.numero + " elevado a " +num + " = " + ObjNumInt.CalularPotencia(num));
	}

}
