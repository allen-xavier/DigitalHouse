package mvc;

public class TelefoneView {
	public void imprimeTelefoneCliente(int idTelefone, int fk_idCliente, String ddd, String numero) {
		System.out.println("Telefone:");
		System.out.println("C�digo telefone: " + idTelefone);
		System.out.println("C�digo do Cliente: " + fk_idCliente);
		System.out.println("DDD: " + ddd);
		System.out.println("N�mero: " + numero + "\n\n");
	}
}
