public class Main {

    public static void main(String[] args) {
        Cliente piedro = new Cliente();
        piedro.setNome("Piedro");

        Conta cc = new ContaCorrente(piedro);
        Conta poupanca = new ContaPoupanca(piedro);

        cc.depositar(150);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
