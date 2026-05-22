package classe_abstrata;

public class ContaCorrente extends Conta {
    @Override
    public void sacar(double valor) {
        saldo -= valor; // Permite ficar negativo
    }
}