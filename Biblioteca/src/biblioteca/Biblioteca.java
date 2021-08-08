package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 25, 'M');
        p[1] = new Pessoa("Maria", 20, 'F');
        
        l[0] = new Livro("The Docker Book", "James", 250, p[0]);
        l[1] = new Livro("Microsoft for Java Developer", "Rafael", 100, p[1]);
        l[2] = new Livro("The mage", "John", 300, p[0]);
        
        System.out.println(l[0].detalhes());
        
        l[1].folhear(60);
        System.out.println(l[1].detalhes());
    }
    
}
