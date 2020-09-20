package mvc;

public class ProdutoPedidoController {
	private ProdutoPedido model;
	private ProdutoPedidoView view;

	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}

	public void setFk_idProduto(int fk_idProduto) {
		model.setFk_idProduto(fk_idProduto);
	}

	public int getFk_idProduto() {
		return model.getFk_idProduto();
	}

	public void setFk_idPedido(int fk_idPedido) {
		model.setFk_idPedido(fk_idPedido);
	}

	public int getfkPedido() {
		return model.getFk_idPedido();
	}

	public void setQtdeProduto(int qtdeProduto) {
		model.setQtdeProduto(qtdeProduto);
	}

	public int getQtdeProduto() {
		return model.getQtdeProduto();
	}

	public void atualizarView() {
		view.imprimeProdutoPedido(model.getFk_idProduto(), model.getFk_idPedido(), model.getQtdeProduto());
	}
}
