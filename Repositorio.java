import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Repositorio<T extends ItemAcervo> {
    
    private List<T> itens; 

    public Repositorio() {
        this.itens = new ArrayList<>();
    }

    public void adicionar(T item){
        itens.add(item);
    }

    public void remover(String titulo) {
        itens.removeIf(item -> item.titulo.equals(titulo));
    }

    public Optional<T> buscarPorTitulo(String titulo) {
        return itens.stream()
            .filter(item -> item.titulo.equals(titulo))
            .findFirst();
    }

    public List<T> listarDisponiveis(){
        return itens.stream()
        .filter(item -> item.disponivel)
        .toList();
    }

    public List<T> listarTodos() {
        return Collections.unmodifiableList(itens);
    }
}