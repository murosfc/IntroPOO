package prova;

import javax.swing.JOptionPane;

public class Hotel extends Pessoa{
	//atributos comuns
	private String cnpj, razaoSocial;
	
	//métodos de acesso
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	//método construtor
	public Hotel()
	{
		super("hotel");
		cnpj = JOptionPane.showInputDialog("Informe o CNPJ do hotel");
		razaoSocial = JOptionPane.showInputDialog("Informe a razão social do hotel");
				
	}
	
	//operações
	public void imprimirDados()
	{
		super.imprimirDados("HOTEL");
		JOptionPane.showMessageDialog(null, "CNPJ do hotel: " +cnpj
				+"\nRazão social do hotel: "+razaoSocial);
	}

}
