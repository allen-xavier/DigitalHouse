package mvc;

public class ProdutoController {
	Produto model;
	ProdutoView view;

	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}

	public void setIdProduto(int idProduto) {
		model.setIdProduto(idProduto);
		;
	}

	public int setIdProduto() {
		return model.getIdProduto();
	}

	public void setNomeProduto(String nomeProduto) {
		model.setNomeProduto(nomeProduto);
	}

	public String getNomeProduto() {
		return model.getNomeProduto();
	}

	public void setDescricaoProduto(String descricaoProduto) {
		model.setDescricaoProduto(descricaoProduto);
	}

	public String getDescricaoProduto() {
		return model.getDescricaoProduto();
	}

	public void setEstoqueProduto(int estoqueProduto) {
		model.setEstoqueProduto(estoqueProduto);
	}

	public int getEstoqueProduto() {
		return model.getEstoqueProduto();
	}

	public void setPrecoProduto(double precoProduto) {
		model.setPrecoProduto(precoProduto);
	}

	public double getPrecoProduto() {
		return model.getPrecoProduto();
	}

	public void atualizarView() {
		view.imprimeProdutoCliente(model.getIdProduto(), model.getNomeProduto(), model.getDescricaoProduto(),
				model.getEstoqueProduto(), model.getPrecoProduto());
	}
}
