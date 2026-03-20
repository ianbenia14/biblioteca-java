import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Biblioteca {

    private Repositorio<ItemAcervo> repositorio;

    public Biblioteca(){
        this.repositorio = new Repositorio<>();
    }

    public void emprestar(String titulo) throws ItemIndisponivelException {
        ItemAcervo item = repositorio.buscarPorTitulo(titulo)
        .orElseThrow(() -> new ItemNaoEncontradoException("Item não encontrado: "  + titulo));

        if(!item.disponivel){
            throw new ItemIndisponivelException("Item não encontrado: "  + titulo);
        }

        item.disponivel = false;
    }

    public void devolver(String titulo) {
        ItemAcervo item = repositorio.buscarPorTitulo(titulo)
        .orElseThrow(() -> new ItemNaoEncontradoException("Item não encontrado: " + titulo));

        if (item.disponivel) {
            System.out.println("Item não estava emprestado: " + titulo);
        } else {
            item.disponivel = true;
        }
    }

    public List<ItemAcervo> top3MaisAntigos(){
        return repositorio.listarTodos().stream()
        .sorted(Comparator.comparingInt(item -> item.anoPublicacao))
        .limit(3)
        .toList();
    }

    public Map<Boolean, List<ItemAcervo>> agruparPorDisponibilidade() {
        return repositorio.listarTodos().stream()
        .collect(Collectors.groupingBy(item -> item.disponivel));
    }

    public List<String> titulosEmMaiusculo() {
        return repositorio.listarTodos().stream()
        .map(item -> item.titulo.toUpperCase())
        .distinct()
        .sorted()
        .toList();
    }

    public void adicionar(ItemAcervo item){
        repositorio.adicionar(item);
    }
}