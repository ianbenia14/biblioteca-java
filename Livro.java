public class Livro extends ItemAcervo {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public String getDescricao(){
        return "Livro: " + titulo + " - " + autor;
    }
}
