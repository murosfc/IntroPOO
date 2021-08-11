package prova;

import javax.swing.JOptionPane;

public class Hospede extends Pessoa{
	//atributos comuns
	private int numeroDiarias;
	private String cpf;
	
	//métodos de acesso	
	public int getNumeroDiarias() {
		return numeroDiarias;
	}
	public void setNumeroDiarias(int numeroDiarias) {
		this.numeroDiarias = numeroDiarias;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//método construtor
	public Hospede()
	{
		super("hóspede");
		cpf = JOptionPane.showInputDialog("Informe o número do CPF do hóspede");
		numeroDiarias = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de diárias"));		
	}
	
	//operações
	public float calcularDepesa()
	{
		if (numeroDiarias < 5)
		{
			return numeroDiarias*300+numeroDiarias*30;
		}
		else if (numeroDiarias == 5)
		{
			return numeroDiarias*300+numeroDiarias*20;
		}
		else
		{
			return numeroDiarias*300+numeroDiarias*10;
		}
	}
	
	public void imprimirDados()
	{
		super.imprimirDados("HÓSPEDE");
		JOptionPane.showMessageDialog(null, "CPF do hóspede: "+cpf
				+"\nNumero de diárias: "+numeroDiarias
				+"\nTotal das desepas R$ "+this.calcularDepesa());		
	}

}
