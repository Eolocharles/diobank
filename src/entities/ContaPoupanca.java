package entities;

import java.util.Date;

public class ContaPoupanca extends Conta{
    private static final double TAXA_SAQUE = 0.10;
    private static final double TAXA_TRANSFERENCIA = 0.20;

    private static final double RENDIMENTO = 0.05;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }


    public void render() {
        super.depositar(super.getSaldo() * RENDIMENTO);

    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA_SAQUE);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        super.transferir(valor + TAXA_TRANSFERENCIA, contaDestino);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInfosComuns();
        System.out.println("Tipo de conta: Conta Poupança");
    }
}

