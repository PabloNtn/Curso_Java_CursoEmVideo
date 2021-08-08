package contabancaria;

public class Conta {

    public float numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(float numeroConta, String tipo, String dono, float saldo, boolean status) {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        if (tipo == "poupança") {
            saldo += 150;
        } else if(this.tipo == "corrente"){
            saldo += 50;
        }

        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        System.out.println("Conta Criada com sucesso");
        System.out.println("Dono: " + this.dono);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

    public void fecharConta(boolean status) {
        if (this.saldo > 0) {
            System.out.println("Não foi possível realizar esta operação.");
            System.out.println("Retire todo o dinheiro para realizar esta operação.");
        } else if (this.saldo < 0) {
            System.out.println("Não foi possível realizar esta operação.");
            System.out.println("Pague sua dívida com o banco para realizar esta operação.");
        } else {
            this.status = status;
            this.saldo = 0;
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float saldo) {
        this.saldo += saldo;
        System.out.println(this.dono + " seu saldo atual é de: " + this.saldo);
    }

    public void sacar(float saldo) {
        this.saldo -= saldo;
        System.out.println(this.dono + " seu saldo atual é de: " + this.saldo);
    }

    public void pagarMensalidade() {
        if (this.tipo == "poupança") {
            this.saldo -= 20;
            System.out.println("Saldo atual de: " + this.saldo);
        } else if (this.tipo == "corrente") {
            this.saldo -= 30;
            System.out.println("Saldo atual de: " + this.saldo);
        }

    }

    public float getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(float numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
