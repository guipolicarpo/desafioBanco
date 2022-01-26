package dio.banco;

public class main {
    public static void main(String[] args) {
        cliente guilherme = new cliente();
        guilherme.setNome("Guilherme");

        conta cc = new contaCorrente(guilherme);
        conta cp = new contaPoupanca(guilherme);

        cc.depositar(100);
        cc.transferir(100, cp);
        cp.sacar(100);
        cc.depositar(150);

        cc.imprimirExtratoConta();
        cp.imprimirExtratoConta();
    }
}
