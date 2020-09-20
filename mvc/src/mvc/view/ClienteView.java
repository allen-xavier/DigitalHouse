package mvc.view;

public class ClienteView {
	public void imprimeDadosCliente(int idCliente, String nome, String cpf, String dtNasc,
			String email) {
		System.out.println("Dados do Cliente:");
		System.out.println("Código do Cliente: " + idCliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de Nascimento: " + dtNasc);
		System.out.println("Seu e-mail: " + email + "\n\n");
	}
}
