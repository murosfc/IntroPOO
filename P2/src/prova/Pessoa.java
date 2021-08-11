package prova;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	//atributos
	protected String nome, email;
	
	//atributos de referência
	private Endereco AtRefEndereco;
	private Telefone AtRefTelefone;
	
	//métodos de acesso
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
	
	//método construtor
	public Pessoa(String tipo)
	{
		nome = JOptionPane.showInputDialog("Informe o nome do "+tipo);
		email = JOptionPane.showInputDialog("Informe o e-mail de contato do "+tipo);
		Endereco objEndereco = new Endereco(tipo);
		AtRefEndereco = objEndereco;
		Telefone objTelefone = new Telefone(tipo);
		AtRefTelefone = objTelefone;	
	}
	
	//operações
	public void imprimirDados(String tipo)
	{
		JOptionPane.showMessageDialog(null, "DADOS DO "+tipo+":"
				+ "\nNome: " + nome
				+ "\nE-mail: "+ email
				+ "\n\nENDEREÇO:"
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
				+ "\nNúmero: "+AtRefTelefone.getNumero()
				+"\nTipo:"+AtRefTelefone.getTipo()
				+ "\nOperadora: "+AtRefTelefone.getOperadora());
	}

}
