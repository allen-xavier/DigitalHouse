package mvc;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;

	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}

	public int getIdTelefone() {
		return model.getIdTelefone();
	}

	public void setIdTelefone(int idTelefone) {
		model.setIdTelefone(idTelefone);
	}

	public void setFkCliente(int fkCliente) {
		model.setFk_idCliente(fkCliente);
	}

	public int getFk_idCliente() {
		return model.getFk_idCliente();
	}

	public void setDddTelefone(String ddd) {
		model.setDdd(ddd);
	}

	public String getDdd() {
		return model.getDdd();
	}

	public void setNumero(String numero) {
		model.setNumero(numero);
	}

	public String getNumeroTelefone() {
		return model.getNumero();
	}

	public void atualizarView() {
		view.imprimeTelefoneCliente(model.getIdTelefone(), model.getFk_idCliente(), model.getDdd(), model.getNumero());
	}
}
