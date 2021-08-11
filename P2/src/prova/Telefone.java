package prova;

import javax.swing.JOptionPane;

public class Telefone {	
	private String ddi, ddd, numero, tipo, operadora;
	
		
	public String getDdi()
	{	
		return ddi;
	}

	public void setDdi(String ddi)
	{
		this.ddi = ddi;
	}

	public String getDdd() 
	{
		return ddd;
	}

	public void setDdd(String ddd)
	{
		this.ddd = ddd;
	}

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero) 
	{
		this.numero = numero;
	}
	
	public String getTipo() 
	{
		return tipo;
	}
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getOperadora()
	{
		return operadora;
	}
	
	public void setOperadora(String operadora)
	{
		this.operadora = operadora;
	}
	
	//método contrutor
	public Telefone(String tipo)
	{
		ddi=JOptionPane.showInputDialog("Informe o DDI do telefone do "+tipo);
		ddd=JOptionPane.showInputDialog("Informe o DDD do telefone do "+tipo);
		numero=JOptionPane.showInputDialog("Informe o numero do telefone do "+tipo);
		this.tipo=JOptionPane.showInputDialog("Informe o tipo do telefone do  "+tipo);
		operadora=JOptionPane.showInputDialog("Informe a operadora do telefone do "+tipo);
	}	
}

