package mvc;

public class TelefoneView {
	public void imprimeTelefoneCliente(int idTelefone, int fk_idCliente, String ddd, String numero) {
		System.out.println("Telefone:");
		System.out.println("Código telefone: " + idTelefone);
		System.out.println("Código do Cliente: " + fk_idCliente);
		System.out.println("DDD: " + ddd);
		System.out.println("Número: " + numero + "\n\n");
	}
}
