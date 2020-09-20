package mvc;

public class PedidoController {
	private Pedido model;
	private PedidoView view;

	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}

	public int getIdPedido() {
		return model.getIdPedido();
	}

	public void setIdPedido(int idPedido) {
		model.setIdPedido(idPedido);
	}

	public void setFk_idCliente(int fk_idCliente) {
		model.setFk_idCliente(fk_idCliente);
	}

	public int getFk_idCliente() {
		return model.getFk_idCliente();
	}

	public void setNfe(String nfe) {
		model.setNfe(nfe);
	}

	public String getNfe() {
		return model.getNfe();
	}

	public void setDtEmissao(String dtEmissao) {
		model.setDtEmissao(dtEmissao);
	}

	public String getDtEmissao() {
		return model.getDtEmissao();
	}

	public void setValorTotal(double valorTotal) {
		model.setValorTotal(valorTotal);
	}

	public double getValorTotal() {
		return model.getValorTotal();
	}

	public void setStatus(String status) {
		model.setStatus(status);
	}

	public String getStatus() {
		return model.getStatus();
	}

	public void atualizarView() {
		view.imprimePedidoCliente(model.getIdPedido(), model.getFk_idCliente(), model.getNfe(), model.getDtEmissao(),
				model.getValorTotal(), model.getStatus());
	}
}
