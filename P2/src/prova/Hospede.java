package prova;

import javax.swing.JOptionPane;

public class Hospede extends Pessoa{
	//atributos comuns
	private int numeroDiarias;
	private String cpf;
	
	//m�todos de acesso	
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
	
	//m�todo construtor
	public Hospede()
	{
		super("h�spede");
		cpf = JOptionPane.showInputDialog("Informe o n�mero do CPF do h�spede");
		numeroDiarias = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de di�rias"));		
	}
	
	//opera��es
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
		super.imprimirDados("H�SPEDE");
		JOptionPane.showMessageDialog(null, "CPF do h�spede: "+cpf
				+"\nNumero de di�rias: "+numeroDiarias
				+"\nTotal das desepas R$ "+this.calcularDepesa());		
	}

}
