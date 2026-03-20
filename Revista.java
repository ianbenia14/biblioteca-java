public class Revista extends ItemAcervo {
    private int edicao;
    
    public Revista(String titulo, int anoPublicacao, int edicao){
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public String getDescricao() {
        return "Revista: \"" + titulo + "\" ed." + edicao + " (" + anoPublicacao + ")";
    }
    
}
