package lista03q08;

public class TesteData {

	public static void main(String[] args) {
		Data ObjData= new Data();
		
		boolean valida = ObjData.ValidarInserirData("15/11/2021");
		if (valida)
			System.out.println ("Data v�lida e inserida com sucesso");
		else 
		{
			System.out.println ("Data inv�lida, tente novamente");
			System.exit(0);
		}
		int DiasSomar = 1000;
		
		System.out.println ("Dia = " + ObjData.RetornaDia());
		System.out.println ("M�s = " + ObjData.RetornaMes());
		System.out.println ("Ano = " + ObjData.RetornaAno());
		System.out.println ("Data inserida + " + DiasSomar + " = " + ObjData.SomarDias(DiasSomar));
	}
}

