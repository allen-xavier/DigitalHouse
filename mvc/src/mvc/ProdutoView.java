package mvc;

public class ProdutoView {
	public void imprimeProdutoCliente(int idProduto, String nomeProduto, String descricaoProduto, int estoqueProduto,
			double precoProduto) {
		System.out.println("Produto:");
		System.out.println("Código do Produto: " + idProduto);
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Descrição: " + descricaoProduto);
		System.out.println("Quantidade em estoque: " + estoqueProduto);
		System.out.println("Preço: " + precoProduto + "\n\n");
	}
}
