package mvc;

public class ClienteController {
	private Cliente model;
	private ClienteView view;

	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}

	public void setIdCliente(int idCliente) {
		model.setIdCliente(idCliente);
	}

	public int getIdCliente() {
		return model.getIdCliente();
	}

	public void setNome(String nome) {
		model.setNome(nome);
	}

	public String getNome() {
		return model.getNome();
	}

	public void setCpf(String cpf) {
		model.setCpf(cpf);
	}

	public String getCpf() {
		return model.getCpf();
	}

	public void setDataNasc(String dataNasc) {
		model.setDtNasc(dataNasc);
	}

	public String getDataNasc() {
		return model.getDtNasc();
	}

	public void setEmail(String email) {
		model.setEmail(email);
	}

	public String getEmail() {
		return model.getEmail();
	}

	public void atualizarView() {
		view.imprimeDadosCliente(model.getIdCliente(), model.getNome(), model.getCpf(),
				model.getDtNasc(), model.getEmail());
	}
}
