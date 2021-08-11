package lista06;

import javax.swing.JOptionPane;

public class Endereco {
	private String rua, numero, complemento, bairro, cidade, estado, cep;
	
	public String getComplemento() 
	{
		return complemento;
	}
	public void setComplemento(String info)
	{
		complemento = info;
	}
	public void setRua(String info)
	{
		rua=info;
	}
	public void setNumero(String info)
	{
		numero=info;
	}
	public void setBairro(String info)
	{
		bairro=info;
	}
	public void setCidade(String info)
	{
		cidade=info;
	}
	public void setCep(String info)
	{
		cep=info;
	}
	public void setEstado(String info)
	{
		estado=info;
	}	
	public String getRua()
	{
		return rua;
	}
	public String getNumero()
	{
		return numero;
	}
	public String getBairro()
	{
		return bairro;
	}
	public String getCidade()
	{
		return cidade;
	}
	public String getEstado()
	{
		return estado;
	}
	public String getCep()
	{
		return cep;
	}
	public Endereco()
	{
		rua=JOptionPane.showInputDialog("Informe a rua de resid�ncia do Cliente:");
		numero=JOptionPane.showInputDialog("Informe o n�mero da resid�ncia do Cliente:");
		complemento=JOptionPane.showInputDialog("Informe o complemento da resid�ncia do Cliente:");
		bairro=JOptionPane.showInputDialog("Informe o bairro de resid�ncia do Cliente:");
		cidade=JOptionPane.showInputDialog("Informe a cidade de resid�ncia do Cliente:");
		estado=JOptionPane.showInputDialog("Informe o estado de resid�ncia do Cliente:");
		cep=JOptionPane.showInputDialog("Informe o CEP da resid�ncia do Cliente:");
	}

}
