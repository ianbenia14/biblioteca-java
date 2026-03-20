public abstract class ItemAcervo {
    protected String titulo;
    protected int anoPublicacao;
    protected boolean disponivel;

    public ItemAcervo(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public abstract String getDescricao();

    @Override
    public String toString() {
        return getDescricao();
    }
}