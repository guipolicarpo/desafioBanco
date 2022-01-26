package dio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme");
        guilherme.setCpf("50422365602");

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");
        felipe.setCpf("76533578912");

        Conta cc = new contaCorrente(guilherme);
        Conta cp = new contaPoupanca(felipe);

        cc.depositar(100);
        cc.transferir(100, cp);
        cp.sacar(100);
        cc.depositar(150);

        cc.imprimirExtratoConta();
        cp.imprimirExtratoConta();
    }
}
