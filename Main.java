public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionar(new Livro("O Príncipe", 1532, "Nicolau Maquiavel"));
        biblioteca.adicionar(new Livro("It - A Coisa", 1986, "Stephen King"));
        biblioteca.adicionar((new Revista("Ian Benia", 2007, 77)));


        try {
            biblioteca.emprestar("It - A Coisa");
        } catch (ItemIndisponivelException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            biblioteca.emprestar("It - A Coisa");
        } catch (ItemIndisponivelException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println(biblioteca.top3MaisAntigos());
        System.out.println(biblioteca.agruparPorDisponibilidade());
        System.out.println(biblioteca.titulosEmMaiusculo());
    }
}
