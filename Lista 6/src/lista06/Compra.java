package lista06;

import javax.swing.JOptionPane;

public class Compra {

	public static void main(String[] args) {
		String pessoa = JOptionPane.showInputDialog("Cliente pessoa f�sica ou jur�dica?");
		if (pessoa.equalsIgnoreCase("f�sica"))
		{
			PessoaFisica objPF = new PessoaFisica();
		}
		else 
		{
			PessoaJuridica objPF = new PessoaJuridica();
		}
	}

}
