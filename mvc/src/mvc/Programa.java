package mvc;

public class Programa {
	public static void main(String[] args) {

		Cliente cliente = getFromDB();
		ClienteView cv = new ClienteView();

		Endereco endereco = getFromDBEndereco();
		EnderecoView ev = new EnderecoView();

		Telefone telefone = getFromDBTelefone();
		TelefoneView tv = new TelefoneView();

		Produto produto = getFromDBProduto();
		ProdutoView pv = new ProdutoView();

		Pedido pedido = getFromDBPedido();
		PedidoView pdv = new PedidoView();

		ProdutoPedido prodPed = getFromDBProdPed();
		ProdutoPedidoView ppv = new ProdutoPedidoView();

		
		ClienteController cc = new ClienteController(cliente, cv);
		EnderecoController ec = new EnderecoController(endereco, ev);
		TelefoneController tc = new TelefoneController(telefone, tv);
		ProdutoController pc = new ProdutoController(produto, pv);
		PedidoController pdc = new PedidoController(pedido, pdv);
		ProdutoPedidoController ppc = new ProdutoPedidoController(prodPed, ppv);
		
		cc.atualizarView();
		ec.atualizarView();
		tc.atualizarView();
		pc.atualizarView();
		pdc.atualizarView();
		ppc.atualizarView();
	}

	public static Cliente getFromDB() {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(4767632);
		cliente.setNome("Allen Xavier");
		cliente.setCpf("023.454.234-09");
		cliente.setDtNasc("28/04/1979");
		cliente.setEmail("email@gmail.com");
		return cliente;
	}
	
	public static Endereco getFromDBEndereco() {
		Endereco endereco = new Endereco();
		endereco.setIdEndereco(8);
		endereco.setLogradouro("Av Ibirapuera");
		endereco.setNumero(99);
		endereco.setBairro("Jardim Londres");
		endereco.setComplemento("Casa");
		endereco.setCidade("Campinas");
		endereco.setUf("SP");
		endereco.setFk_idCliente(4767632);
		return endereco;
	}
	
	public static Telefone getFromDBTelefone() {
		Telefone telefone = new Telefone();
		telefone.setIdTelefone(7);
		telefone.setDdd("19");
		telefone.setNumero("99878-9876");
		telefone.setFk_idCliente(1856132);
		return telefone;
	}

	public static Produto getFromDBProduto() {
		Produto produto = new Produto();
		produto.setIdProduto(10);
		produto.setNomeProduto("Notebook");
		produto.setDescricaoProduto("Dell Latitude 2400");
		produto.setEstoqueProduto(4);
		produto.setPrecoProduto(4435.00);
		return produto;
	}

	public static Pedido getFromDBPedido() {
		Pedido pedido = new Pedido();
		pedido.setIdPedido(5);
		pedido.setNfe("2348sd723uu2348d234rsdf238fw");
		pedido.setDtEmissao("20/09/2020");
		pedido.setValorTotal(4435.00);
		pedido.setStatus("Processando");
		pedido.setFk_idCliente(4767632);
		return pedido;
	}

	public static ProdutoPedido getFromDBProdPed() {
		ProdutoPedido produtoPedido = new ProdutoPedido();
		produtoPedido.setFk_idProduto(10);
		produtoPedido.setFk_idPedido(5);
		produtoPedido.setQtdeProduto(2);
		return produtoPedido;
	}
}