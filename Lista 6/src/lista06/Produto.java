package lista06;

import javax.swing.JOptionPane;

public class Produto {
	private String codigo, nome;
	private int quantidade;
	private float precoUnitario;
	
	public void setCodigo(String cdg)
	{
		codigo=cdg;
	}
	public void setNome(String name)
	{
		nome=name;
	}
	public void setQuantidade(int qt)
	{
		quantidade=qt;
	}
	public void setPrecoUnitario(float preco)
	{
		precoUnitario=preco;
	}
	
	public String getCodigo()
	{
		return codigo;
	}
	public String getNome()
	{
		return nome;
	}
	public int getQuantidade()
	{
		return quantidade;
	}
	public float getPrecoUnitario()
	{
		return precoUnitario;
	}
	
	public Produto()
	{
		codigo=JOptionPane.showInputDialog("Informe o codigo do produto:");
		nome=JOptionPane.showInputDialog("Informe o nome do produto:");
		quantidade=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto:"));
		precoUnitario=Float.parseFloat(JOptionPane.showInputDialog("Informe o preço unitário do produto:"));
	}

}
