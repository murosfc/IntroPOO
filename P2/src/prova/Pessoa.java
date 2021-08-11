package prova;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	//atributos
	protected String nome, email;
	
	//atributos de refer�ncia
	private Endereco AtRefEndereco;
	private Telefone AtRefTelefone;
	
	//m�todos de acesso
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//m�todo construtor
	public Pessoa(String tipo)
	{
		nome = JOptionPane.showInputDialog("Informe o nome do "+tipo);
		email = JOptionPane.showInputDialog("Informe o e-mail de contato do "+tipo);
		Endereco objEndereco = new Endereco(tipo);
		AtRefEndereco = objEndereco;
		Telefone objTelefone = new Telefone(tipo);
		AtRefTelefone = objTelefone;	
	}
	
	//opera��es
	public void imprimirDados(String tipo)
	{
		JOptionPane.showMessageDialog(null, "DADOS DO "+tipo+":"
				+ "\nNome: " + nome
				+ "\nE-mail: "+ email
				+ "\n\nENDERE�O:"
				+ "\nRua: "+AtRefEndereco.getRua()
				+ "\nNumero: "+AtRefEndereco.getNumero()
				+ "\nComplemento: "+AtRefEndereco.getComplemento()
				+ "\nBairro: "+AtRefEndereco.getBairro()
				+ "\nCidade: "+AtRefEndereco.getCidade()
				+ "\nEstado: "+AtRefEndereco.getEstado()
				+ "\nCEP: "+AtRefEndereco.getCep()
				+ "\n\nTELEFONE:"
				+ "\nDDI: "+AtRefTelefone.getDdi()
				+ "\nDDD: "+AtRefTelefone.getDdd()
				+ "\nN�mero: "+AtRefTelefone.getNumero()
				+"\nTipo:"+AtRefTelefone.getTipo()
				+ "\nOperadora: "+AtRefTelefone.getOperadora());
	}

}
