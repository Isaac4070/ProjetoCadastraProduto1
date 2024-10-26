import java.util.List;

public interface SistemaCadastro {
    void cadastrarProduto(int id, String nome, double preco);

    Produto pesquisarProduto(int id);

    boolean removerProduto(int id);

    List<Produto> listarProdutos();

    boolean atualizarProduto(int id, String novoNome, double novoPreco);
}
