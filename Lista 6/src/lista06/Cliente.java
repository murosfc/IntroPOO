package lista06;

import javax.swing.JOptionPane;

public abstract class Cliente {
	//atributo comuns
	protected String nome;
	
	//atributos de referência
	private Endereco AtbRefEndereco;
	private Telefone AtbRefTelefone;
	private Pedido AtbRefPedido;
	private Produto AtbRefProduto;
	
	//métodos de acesso
	public void setNome(String nome)
	{
		nome=nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public Endereco getAtbRefEndereco()
	{
		return AtbRefEndereco;
	}

	public void setAtbRefEndereco(Endereco atbRefEndereco)
	{
		AtbRefEndereco = atbRefEndereco;
	}

	public Telefone getAtbRefTelefone()
	{
		return AtbRefTelefone;
	}

	public void setAtbRefTelefone(Telefone atbRefTelefone) 
	{
		AtbRefTelefone = atbRefTelefone;
	}
	public Pedido getAtbRefPedido()
	{
		return AtbRefPedido;
	}

	public void setAtbRefPedido(Pedido atbRefPedido)
	{
		AtbRefPedido = atbRefPedido;
	}

	public Produto getAtbRefProduto()
	{
		return AtbRefProduto;
	}

	public void setAtbRefProduto(Produto atbRefProduto)
	{
		AtbRefProduto = atbRefProduto;
	}
	
	//Método construtor
	public Cliente()
	{
		nome=JOptionPane.showInputDialog("Informe o nome do cliente:" );
		Endereco objEndereco = new Endereco();
		AtbRefEndereco = objEndereco;
		Telefone objTelefone = new Telefone();
		AtbRefTelefone = objTelefone;
	}
	
	//operações
	public void fazerPedido()
	{
		Produto objProduto = new Produto();
		AtbRefProduto = objProduto;
		Pedido objPedido = new Pedido(objProduto, this);
		AtbRefPedido = objPedido;		
	}
	
	public void imprimirFatura()
	{
		AtbRefPedido.gerarFatura();
		JOptionPane.showMessageDialog(null, "FATURA NUMERO : "
				+ AtbRefPedido.getAtbRefFatura().getNumeroFatura()
				+"\nVencimento: "+ AtbRefPedido.getAtbRefFatura().getDataVencimento()
				+"\n\nDADOS DO CLIENTE:"
				+ "\nNome: "+nome
				+ "\nTelefone "+AtbRefTelefone.getTipo()+": "
				+AtbRefTelefone.getDdi()+" ("+AtbRefTelefone.getDdd()+") "
				+AtbRefTelefone.getNumero()
				+"\nOperadora: "+AtbRefTelefone.getOperadora()
				+ "\nEndereço: "+AtbRefEndereco.getRua()
				+", "+ AtbRefEndereco.getNumero()
				+"\nComplemento: "+AtbRefEndereco.getComplemento()
				+"\nBairro: "+AtbRefEndereco.getBairro()
				+"\nCidade: "+AtbRefEndereco.getCidade()
				+"\nEstado: "+AtbRefEndereco.getEstado()
				+"\nCEP: "+AtbRefEndereco.getCep()
				+"\n\nDADOS DO PEDIDO:"
				+ "\nNúmero: "+AtbRefPedido.getNumeroPedido()
				+"\nData: "+AtbRefPedido.getData()
				+"\nQuantidade: "+AtbRefPedido.getQuantidade()
				+"\n\nDADOS DO PRODUTO:"
				+ "\nCódigo: " +AtbRefProduto.getCodigo()
				+"\nDescrição: "+AtbRefProduto.getNome()
				+"\nQuantidade: "+AtbRefProduto.getQuantidade()
				+"\nPreço Unitário: "+AtbRefProduto.getPrecoUnitario()
				+"\n\nTOTAL DA FATURA: "+AtbRefPedido.getAtbRefFatura().getValorTotal() );				
	}

}
