package mvc.view;

public class PedidoView {
	public void imprimePedidoCliente(int idPedido, int fkCliente, String nfe, String dtEmissao, double valorTotal,
			String status) {
		System.out.println("Dados do Pedido:");
		System.out.println("C�digo do Pedido: " + idPedido);
		System.out.println("C�digo do Cliente: " + fkCliente);
		System.out.println("N�mero da Nota Fiscal Eletr�nica: " + nfe);
		System.out.println("Data da Compra: " + dtEmissao);
		System.out.println("Valor Total do Pedido: R$ " + valorTotal);
		System.out.println("Status do Pedido: " + status + "\n\n");
	}
}