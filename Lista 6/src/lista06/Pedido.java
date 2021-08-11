package lista06;

import javax.swing.JOptionPane;

public class Pedido {
	
	//atributos comuns
	private int quantidade;
	private String numeroPedido, data;
	
	//atributo de referência
	private Produto AtbRefProduto;
	private Fatura AtbRefFatura;
	private Cliente AtbRefCliente;
	
	//métodos de acesso
	public void setNumeroPedido(String n)
	{
		numeroPedido=n;
	}
	public void setQuantidade(int n)
	{
		quantidade=n;
	}
	public void setData(String d)
	{
		data=d;
	}
	
	public String getNumeroPedido()
	{
		return numeroPedido;
	}
	public int getQuantidade()
	{
		return quantidade;
	}
	public String getData()
	{
		return data;
	}
	
	public Produto getAtbRefProduto()
	{
		return AtbRefProduto;
	}
	public void setAtbRefProduto(Produto atbRefProduto) 
	{
		AtbRefProduto = atbRefProduto;
	}
	public Fatura getAtbRefFatura() 
	{
		return AtbRefFatura;
	}
	public void setAtbRefFatura(Fatura atbRefFatura)
	{
		AtbRefFatura = atbRefFatura;
	}
	public Cliente getAtbRefCliente()
	{
		return AtbRefCliente;
	}
	public void setAtbRefCliente(Cliente atbRefCliente)
	{
		AtbRefCliente = atbRefCliente;
	}
	
	//método construtor
	Pedido(Produto objProduto, Cliente cliente)
	{
		numeroPedido=JOptionPane.showInputDialog("Informe o número do pedido:" );
		quantidade=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do pedido:" ));
		data=JOptionPane.showInputDialog("Informe a data do pedido:");
		AtbRefProduto=objProduto;
		AtbRefCliente=cliente;
	}
	
	//operações
	public void gerarFatura()
	{
		Fatura objFatura = new Fatura(AtbRefProduto.getPrecoUnitario()*quantidade);
		AtbRefFatura=objFatura;
	}
	

}
