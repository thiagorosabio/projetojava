package bankencapisulado;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;

    }

    public Cliente getTitular() {
        return titular;
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {

            return false;
        }
    }
}