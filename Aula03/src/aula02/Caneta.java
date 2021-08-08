package aula02;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("modelo: " + this.modelo);
        System.out.println("Uma caneta:" + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Catga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada){
            System.out.println("ERRO: Caneta tampada");
        }else{
            System.out.println("Rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
