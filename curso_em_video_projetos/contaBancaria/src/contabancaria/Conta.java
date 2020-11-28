package contabancaria;

public class Conta {
    public float numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(float numeroConta, String tipo, String dono, float saldo, boolean status){
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        if(tipo == "poupança"){
            saldo += 150;
        }else{
            saldo += 50;
        }
        
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        System.out.println("Conta Criada com sucesso");
        System.out.println("Dono: " + this.dono);
        System.out.println("Número da conta: " +this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
    
    public void fecharConta(boolean status){
        this.status = status;
        this.saldo = 0;
    }
    
    public void depositar(float saldo){
        this.saldo += saldo;
        System.out.println(this.dono + " seu saldo atual é de: " + this.saldo);
    }
    
    public void sacar(float saldo){
        this.saldo -=saldo;
        System.out.println(this.dono + " seu saldo atual é de: " + this.saldo);
    }
    
    public void pagarMensalidade(float mensalidade){
        this.saldo -= mensalidade;
        System.out.println("Saldo atual de: " + this.saldo);
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
