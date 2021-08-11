package lista06;

import javax.swing.JOptionPane;

public class Fatura {	
	private String dataVencimento, numeroFatura;
	private float valorTotal;
	
	public void setNumeroFatura(String num)
	{
		numeroFatura=num;
	}
	public void setDataVencimento(String data)
	{
		dataVencimento=data;
	}
	public void setValorTotal (float valor)
	{
		valorTotal=valor;
	}
	
	public String getNumeroFatura()
	{
		return numeroFatura;
	}
	public String getDataVencimento()
	{
		return dataVencimento;
	}
	public float getValorTotal()
	{
		return valorTotal;
	}
	
	public Fatura(float total)
	{
		numeroFatura=JOptionPane.showInputDialog("Informe o número da Fatura:");
		dataVencimento=JOptionPane.showInputDialog("Informe o vencimento da Fatura:");
		valorTotal = total;
	}


}
