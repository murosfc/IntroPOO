package lista06;

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
	
	//operações
	public Telefone()
	{
		ddi=JOptionPane.showInputDialog("Informe o DDI do telefone do Cliente:");
		ddd=JOptionPane.showInputDialog("Informe o DDD do telefone do Cliente:");
		numero=JOptionPane.showInputDialog("Informe o numero do telefone do Cliente:");
		tipo=JOptionPane.showInputDialog("Informe o tipo do telefone do Cliente:");
		operadora=JOptionPane.showInputDialog("Informe a operadora do telefone do Cliente:");
	}	
}
