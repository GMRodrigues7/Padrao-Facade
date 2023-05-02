
public class AplicacaoCliente {

	public static void main(String[] args) {
		ClienteDoBanco cliente = new ClienteDoBanco("Guilherme Rodrigues");
		ContaBancaria conta = new ContaBancaria("1919-9");

		Fachada facade = new Fachada();
		facade.fazerDeposito(150, cliente, conta);
	}
}
