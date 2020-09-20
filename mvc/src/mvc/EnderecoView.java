package mvc;

public class EnderecoView {
	public void imprimeEnderecoCliente(int idEndereco, int fk_idCliente, String logradouro, int numero, String complemento,
			String bairro, String cidade, String uf) {
		System.out.println("Endereço do Cliente:");
		System.out.println("Código endereço: " + idEndereco);
		System.out.println("Código do cliente: " + fk_idCliente);
		System.out.println("Logradouro: " + logradouro + ", " + numero);
		System.out.println("Complemento: " + complemento);
		System.out.println("Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("UF: " + uf + "\n\n");
	}
}
