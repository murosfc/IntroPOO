package lista06;

import javax.swing.JOptionPane;

public class PessoaFisica extends Cliente{
	//atributos comuns
	private String cpf, dtNascimento;
	
	//métodos de acesso
	public void setCpf(String numero)
	{
		cpf = numero;
	}

	public String getCpf()
	{
		return cpf;
	}
	
	public void dtNascimento(String dt)
	{
		dtNascimento=dt;
	}
	
	public String getdtNascimento()
	{
		return dtNascimento;
	}
	
	public PessoaFisica()
	{
		super();
		cpf=JOptionPane.showInputDialog("Informe o CPF do Cliente:" );
		dtNascimento=JOptionPane.showInputDialog("Informe a data de nascimento do cliente:" );
		super.fazerPedido();
		super.imprimirFatura();
	}
}
