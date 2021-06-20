package lista03q07;

public class Hora {
	String hour;
	
	public int RetornarHora()
	{			
		String h = ""+hour.charAt(0)+hour.charAt(1);
		return Integer.parseInt(h);
	}
	public int RetornarMinuto()
	{
		String h = ""+hour.charAt(3)+hour.charAt(4);
		return Integer.parseInt(h);
	}
	public int RetornarSegundo()
	{
		String h = ""+hour.charAt(6)+hour.charAt(7);
		return Integer.parseInt(h);
	}
	public String SomarHora(Hora Objeto2)
	{
		int SomaTempo1, SomaTempo2, PassaTempo;
		int ss,mm,hh;
		//Soma segundos
		SomaTempo1 = this.RetornarSegundo();
		SomaTempo2 = Objeto2.RetornarSegundo();
		ss=SomaTempo1 + SomaTempo2;
		if (ss>59)
		{
			ss=ss-60;
			PassaTempo=1;
		}
		else PassaTempo = 0;
		//Soma minutos
		SomaTempo1= this.RetornarMinuto();
		SomaTempo2= Objeto2.RetornarMinuto();
		mm = SomaTempo1 + SomaTempo2 + PassaTempo;
		if (mm>59)
		{
			mm=mm-60;
			PassaTempo=1;
		}
		else PassaTempo = 0;
		//Soma horas
		SomaTempo1= this.RetornarHora();
		SomaTempo2= Objeto2.RetornarHora();
		hh = SomaTempo1 + SomaTempo2 + PassaTempo;
		if (hh>23)
		{
			hh=hh-24;
			PassaTempo=1;
		}
		else PassaTempo = 0;
		if (PassaTempo == 1)
		{
			return ("1d "+String.format("%02d",hh)+":"+String.format("%02d",mm)+":"+String.format("%02d",ss));
		}
		else return (""+String.format("%02d",hh)+":"+String.format("%02d",mm)+":"+String.format("%02d",ss));
	}
	
	public String SubtrairHora( Hora Objeto2)
	{
		int SomaTempo1, SomaTempo2, PassaTempo;
		int ss,mm,hh;
		//Soma segundos
		SomaTempo1 = this.RetornarSegundo();
		SomaTempo2 = Objeto2.RetornarSegundo();
		if (SomaTempo1 < SomaTempo2)
		{
			ss=SomaTempo1+60 - SomaTempo2;
			PassaTempo=-1;
		}			
		else 
			{
			ss=SomaTempo1-SomaTempo2;
			PassaTempo = 0;
			}		
		//Soma minutos
		SomaTempo1 = this.RetornarMinuto();
		SomaTempo2 = Objeto2.RetornarMinuto();
		SomaTempo1 = SomaTempo1 + PassaTempo;
		if (SomaTempo1 < SomaTempo2)
		{
			mm=SomaTempo1+60 - SomaTempo2;
			PassaTempo=-1;
		}			
		else 
			{
			mm=SomaTempo1-SomaTempo2;
			PassaTempo = 0;
			}
		//Soma horas
		SomaTempo1= this.RetornarHora();
		SomaTempo2= Objeto2.RetornarHora();
		hh = SomaTempo1 + PassaTempo - SomaTempo2;
		if (hh<0)
			return ("Resultado Negativo. Manipule os objetos para corrigir");
		else return (""+String.format("%02d",hh)+":"+String.format("%02d",mm)+":"+String.format("%02d",ss));
	}
}
