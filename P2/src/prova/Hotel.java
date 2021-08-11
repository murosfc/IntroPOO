package prova;

import javax.swing.JOptionPane;

public class Hotel extends Pessoa{
	//atributos comuns
	private String cnpj, razaoSocial;
	
	//m�todos de acesso
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
	
	//m�todo construtor
	public Hotel()
	{
		super("hotel");
		cnpj = JOptionPane.showInputDialog("Informe o CNPJ do hotel");
		razaoSocial = JOptionPane.showInputDialog("Informe a raz�o social do hotel");
				
	}
	
	//opera��es
	public void imprimirDados()
	{
		super.imprimirDados("HOTEL");
		JOptionPane.showMessageDialog(null, "CNPJ do hotel: " +cnpj
				+"\nRaz�o social do hotel: "+razaoSocial);
	}

}
