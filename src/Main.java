import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao", "123456789");
        Conta contaJoao = new ContaCorrente(joao);
        contaJoao.depositar(1000);
        contaJoao.sacar(100);
        contaJoao.imprimirExtrato();

        Cliente maria = new Cliente("Maria", "987654321");
        Conta contaMaria = new ContaPoupanca(maria);
        contaMaria.depositar(1000);
        contaMaria.sacar(100);
        contaMaria.imprimirExtrato();

    }
}