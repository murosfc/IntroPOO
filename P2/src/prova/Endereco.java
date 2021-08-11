package prova;

import javax.swing.JOptionPane;

public class Endereco {
	//atributos comuns
	private String rua, numero, complemento, bairro, cidade, cep, estado;
	
	//m�todos de acesso
	public String getRua()
	{
		return rua;
	}

	public void setRua(String rua)
	{
		this.rua = rua;
	}

	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	public String getComplemento()
	{
		return complemento;
	}

	public void setComplemento(String complemento)
	{
		this.complemento = complemento;
	}

	public String getBairro()
	{
		return bairro;
	}

	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}

	public String getCidade()
	{
		return cidade;
	}

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}

	public String getCep()
	{
		return cep;
	}

	public void setCep(String cep) 
	{
		this.cep = cep;
	}

	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}

	//m�todo construtor
	public Endereco(String tipo)
	{
		rua=JOptionPane.showInputDialog("Informe a rua do endere�o do " +tipo);
		numero=JOptionPane.showInputDialog("Informe o n�mero do endere�o do "+tipo);
		complemento=JOptionPane.showInputDialog("Informe o complemento do endere�o do "+tipo);
		bairro=JOptionPane.showInputDialog("Informe o bairro do endere�o do "+tipo);
		cidade=JOptionPane.showInputDialog("Informe a cidade do endere�o do "+tipo);
		estado=JOptionPane.showInputDialog("Informe o estado do endere�o do "+tipo);
		cep=JOptionPane.showInputDialog("Informe o CEP da do endee�o do "+tipo);
	}


}
