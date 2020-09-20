package mvc.view;

public class ProdutoPedidoView {
	public void imprimeProdutoPedido(int fk_idProduto, int fk_idPedido, int qtdeProduto) {
		System.out.println("Produto Comprados por Pedido do Cliente: ");
		System.out.println("Código do Produto: " + fk_idProduto);
		System.out.println("Código do Pedido: " + fk_idPedido);
		System.out.println("Quantidade de Produtos do Pedido: " + qtdeProduto + "\n\n");
	}
}
