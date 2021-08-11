package lista06;

import javax.swing.JOptionPane;

public abstract class Cliente {
	//atributo comuns
	protected String nome;
	
	//atributos de refer�ncia
	private Endereco AtbRefEndereco;
	private Telefone AtbRefTelefone;
	private Pedido AtbRefPedido;
	private Produto AtbRefProduto;
	
	//m�todos de acesso
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
	
	//M�todo construtor
	public Cliente()
	{
		nome=JOptionPane.showInputDialog("Informe o nome do cliente:" );
		Endereco objEndereco = new Endereco();
		AtbRefEndereco = objEndereco;
		Telefone objTelefone = new Telefone();
		AtbRefTelefone = objTelefone;
	}
	
	//opera��es
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
				+ "\nEndere�o: "+AtbRefEndereco.getRua()
				+", "+ AtbRefEndereco.getNumero()
				+"\nComplemento: "+AtbRefEndereco.getComplemento()
				+"\nBairro: "+AtbRefEndereco.getBairro()
				+"\nCidade: "+AtbRefEndereco.getCidade()
				+"\nEstado: "+AtbRefEndereco.getEstado()
				+"\nCEP: "+AtbRefEndereco.getCep()
				+"\n\nDADOS DO PEDIDO:"
				+ "\nN�mero: "+AtbRefPedido.getNumeroPedido()
				+"\nData: "+AtbRefPedido.getData()
				+"\nQuantidade: "+AtbRefPedido.getQuantidade()
				+"\n\nDADOS DO PRODUTO:"
				+ "\nC�digo: " +AtbRefProduto.getCodigo()
				+"\nDescri��o: "+AtbRefProduto.getNome()
				+"\nQuantidade: "+AtbRefProduto.getQuantidade()
				+"\nPre�o Unit�rio: "+AtbRefProduto.getPrecoUnitario()
				+"\n\nTOTAL DA FATURA: "+AtbRefPedido.getAtbRefFatura().getValorTotal() );				
	}

}
