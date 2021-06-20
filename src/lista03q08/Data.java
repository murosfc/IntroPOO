package lista03q08;

public class Data {
	private String data;
	
	public int RetornaDia() {
		String dia = ""+data.charAt(0)+data.charAt(1);
		return Integer.parseInt(dia);
	}
	
	public int RetornaMes() {
		String mes = ""+data.charAt(3)+data.charAt(4);
		return Integer.parseInt(mes);
	}
	
	public int RetornaAno() {
		String ano = ""+data.charAt(6)+data.charAt(7)+data.charAt(8)+data.charAt(9);
		return Integer.parseInt(ano);
	}
	
	public String SomarDias(int dias)
	{
		int dia=this.RetornaDia(),mes=this.RetornaMes(),ano=this.RetornaAno();
		while (dias != 0)
		{
			if (dia+dias > this.QuantidadeDiasMes(mes, ano))
			{
				dias=dias-(this.QuantidadeDiasMes(mes, ano)-dia+1); //+1 no final é o dia um do mês seguinte
				dia=1;				
				if (mes+1 > 12)
				{
					mes=1;
					ano+=1;
				}
				else mes+=1;
			}
			else 
			{
				dia=dia+dias;
				dias=0;
			}			
		}
		return ""+String.format("%02d",dia)+"/"+String.format("%02d",mes)+"/"+String.format("%02d",ano);
	}
	
	public int QuantidadeDiasMes(int mes , int ano)
	{
		int Mes31Dias[]= {1,3,5,7,8,10,12};
		for (int i=0;i<7;i++)
		{
			if (mes == Mes31Dias[i])
				return 31;
		}
		if (mes==2)
		{
			if (ano%4 ==0)
				return 29;
			else return 28;
		}
		else return 30;		
	}
	
	public boolean ValidarInserirData (String datainserir)
	{
		int dia= Integer.parseInt(""+datainserir.charAt(0)+datainserir.charAt(1));
		int mes= Integer.parseInt(""+datainserir.charAt(3)+datainserir.charAt(4));
		int ano= Integer.parseInt(""+datainserir.charAt(6)+datainserir.charAt(7)+datainserir.charAt(8)+datainserir.charAt(9));
		if (this.QuantidadeDiasMes(mes, ano)>=dia)
		{
			data=datainserir;
			return true;
		}
		else return false;
	}
}
