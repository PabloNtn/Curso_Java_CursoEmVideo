package biblioteca;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int tot, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = tot;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo
                + "\n, autor=" + autor
                + "\n, totPaginas=" + totPaginas
                + "\n, pagAtual=" + pagAtual
                + "\n, aberto=" + aberto
                + "\n, leitor=" + leitor.getNome() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        if (this.pagAtual != this.totPaginas) {
            this.pagAtual = this.pagAtual + 1;
        }
    }

    @Override
    public void voltarPag() {
        if (this.pagAtual != 0) {
            this.pagAtual = this.pagAtual - 1;
        }
    }

}
