package mvc;

public class ProdutoPedido {
	private int fk_idProduto;
	private int fk_idPedido;
	private int qtdeProduto;

	public int getFk_idProduto() {
		return fk_idProduto;
	}

	public void setFk_idProduto(int fk_idProduto) {
		this.fk_idProduto = fk_idProduto;
	}

	public int getFk_idPedido() {
		return fk_idPedido;
	}

	public void setFk_idPedido(int fk_idPedido) {
		this.fk_idPedido = fk_idPedido;
	}

	public int getQtdeProduto() {
		return qtdeProduto;
	}

	public void setQtdeProduto(int qtdeProduto) {
		this.qtdeProduto = qtdeProduto;
	}
}
