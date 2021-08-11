package lista06;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Cliente {
	//atributos comuns
	private String cnpj;
	
	//métodos de acesso
	public void setCnpj(String id)
	{
		cnpj=id;
	}
	
	public String getCnpj()
	{
		return cnpj;
	}
	
	public PessoaJuridica()
	{
		super();		
		cnpj=JOptionPane.showInputDialog("Informe o CNPJ do Cliente:" );
		super.fazerPedido();
		super.imprimirFatura();
	}
}
