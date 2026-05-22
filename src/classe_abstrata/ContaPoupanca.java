package classe_abstrata;

public class ContaPoupanca extends Conta {
    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(100);
        cc.sacar(150);
        System.out.println("Saldo CC: " + cc.getSaldo());

        cp.depositar(100);
        cp.sacar(150);
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}