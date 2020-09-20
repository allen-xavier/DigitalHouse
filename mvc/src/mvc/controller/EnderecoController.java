package mvc.controller;

import mvc.model.Endereco;
import mvc.view.EnderecoView;

public class EnderecoController {
	private Endereco model;
	private EnderecoView view;

	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}

	public int getIdEndereco() {
		return model.getIdEndereco();
	}

	public void setIdEndereco(int idEndereco) {
		model.setIdEndereco(idEndereco);
	}

	public void setFk_idCliente(int fk_idCliente) {
		model.setFk_idCliente(fk_idCliente);
	}

	public int getFk_idCliente() {
		return model.getFk_idCliente();
	}

	public void setLogradouro(String rua) {
		model.setLogradouro(rua);
	}

	public String getRua() {
		return model.getLogradouro();
	}

	public void setNumero(int numero) {
		model.setNumero(numero);
	}

	public int getNumero() {
		return model.getNumero();
	}

	public void setBairro(String bairro) {
		model.setBairro(bairro);
	}

	public String getBairro() {
		return model.getBairro();
	}

	public void setComplemento(String complemento) {
		model.setComplemento(complemento);
	}

	public String getComplemento() {
		return model.getComplemento();
	}

	public void setCidade(String cidade) {
		model.setCidade(cidade);
	}

	public String getCidade() {
		return model.getCidade();
	}

	public void setUf(String uf) {
		model.setUf(uf);
	}

	public String getUf() {
		return model.getUf();
	}

	public void atualizarView() {
		view.imprimeEnderecoCliente(model.getIdEndereco(), model.getFk_idCliente(), model.getLogradouro(), model.getNumero(),
				model.getComplemento(), model.getBairro(), model.getCidade(), model.getUf());
	}
}
