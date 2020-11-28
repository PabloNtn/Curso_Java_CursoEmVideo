package contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {
        Conta c1 = new Conta(013f, "poupança", "Astolfo", 300, true);
        Conta c2 = new Conta(514f, "corrente", "Benedeta", 500, true);
        c1.depositar(200);
        c2.sacar(100);
        c1.pagarMensalidade();
        c2.pagarMensalidade();
    }
    
}
