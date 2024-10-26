import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco){
        this.id = String.valueOf(id);
        this.nome = nome;
        this.preco = preco;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id) &&
                nome.equals(produto.nome) &&
                Double.compare(produto.preco, preco) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

}
