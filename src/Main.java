
public class Main {

	public static void main(String[] args) {
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno Ricardo");
			
		Conta cc = new ContaCorrente(bruno);
		Conta poupanca = new ContaPoupanca(bruno);
		
		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
