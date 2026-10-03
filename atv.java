class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}


public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(123, "Davi");

        conta.depositar(1000);
        conta.sacar(300);

        System.out.println("Saldo: R$ " + conta.consultarSaldo());
    }
}