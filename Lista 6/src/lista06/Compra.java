package lista06;

import javax.swing.JOptionPane;

public class Compra {

	public static void main(String[] args) {
		String pessoa = JOptionPane.showInputDialog("Cliente pessoa física ou jurídica?");
		if (pessoa.equalsIgnoreCase("física"))
		{
			PessoaFisica objPF = new PessoaFisica();
		}
		else 
		{
			PessoaJuridica objPF = new PessoaJuridica();
		}
	}

}
