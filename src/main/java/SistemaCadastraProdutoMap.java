import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaCadastraProdutoMap implements SistemaCadastro {
    private Map<String, Produto> produtos;

    public SistemaCadastraProdutoMap() {
        this.produtos = new HashMap<>();
    }

    @Override
    public void cadastrarProduto(int id, String nome, double preco) {
        Produto novoProduto = new Produto(id, nome, preco);
        produtos.put(novoProduto.getId(), novoProduto);
        System.out.println("Produto cadastrado com sucesso: " + novoProduto);
    }

    @Override
    public Produto pesquisarProduto(int id) {
        return produtos.get(String.valueOf(id));
    }

    @Override
    public boolean removerProduto(int id) {
        return produtos.remove(String.valueOf(id)) != null;
    }

    @Override
    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos.values());
    }

    @Override
    public boolean atualizarProduto(int id, String novoNome, double novoPreco) {
        Produto produto = produtos.get(String.valueOf(id));
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            return true;
        }
        return false;
    }
}