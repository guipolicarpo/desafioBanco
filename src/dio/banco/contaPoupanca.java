package dio.banco;

public class contaPoupanca extends conta{

    public contaPoupanca(cliente clientes) {
        super(clientes);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----> Extrato conta poupança <----");
        super.imprimirExtratoConta();
    }
}
