import javax.swing.*;
import java.util.List;

public class JanelaPrincipal extends JFrame {
    private SistemaCadastro sistema;

    public JanelaPrincipal() {
        sistema = new SistemaCadastraProdutoMap(); // Inicializa o sistema de cadastro de produtos
        setTitle("Sistema de Cadastro de Produtos");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        criarMenu();
        setVisible(true);
    }

    private void criarMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opções");

        JMenuItem cadastrar = new JMenuItem("Cadastrar Produto");
        JMenuItem pesquisar = new JMenuItem("Pesquisar Produto");
        JMenuItem remover = new JMenuItem("Remover Produto");
        JMenuItem listar = new JMenuItem("Listar Produtos");
        JMenuItem atualizar = new JMenuItem("Atualizar Produto");
        JMenuItem sair = new JMenuItem("Sair");

        cadastrar.addActionListener(e -> {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
            String preco = JOptionPane.showInputDialog(null, "Digite o preço do produto:");
            String id = JOptionPane.showInputDialog(null,"Digite o ID do produto:");
            sistema.cadastrarProduto(Integer.parseInt(id), nome, Double.parseDouble(preco));
            JOptionPane.showMessageDialog(null, "Produto cadastrado: " + nome + ", Preço: " + preco);
        });

        pesquisar.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(null, "Digite o ID do produto a pesquisar:");
            Produto produto = sistema.pesquisarProduto(Integer.parseInt(id));
            if (produto != null) {
                JOptionPane.showMessageDialog(null, "Produto encontrado: " + produto.getNome());
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });

        remover.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(null, "Digite o ID do produto a remover:");
            if (sistema.removerProduto(Integer.parseInt(id))) {
                JOptionPane.showMessageDialog(null, "Produto removido.");
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });

        listar.addActionListener(e -> {
            List<Produto> produtos = sistema.listarProdutos();
            StringBuilder lista = new StringBuilder("Produtos cadastrados:\n");
            for (Produto produto : produtos) {
                lista.append(produto.getId()).append(" - ").append(produto.getNome()).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        });

        atualizar.addActionListener(e -> {
            String id = JOptionPane.showInputDialog(null, "Digite o ID do produto a atualizar:");
            String novoNome = JOptionPane.showInputDialog(null, "Digite o novo nome:");
            String novoPreco = JOptionPane.showInputDialog(null, "Digite o novo preço:");
            if (sistema.atualizarProduto(Integer.parseInt(id), novoNome, Double.parseDouble(novoPreco))) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });

        sair.addActionListener(e -> System.exit(0));

        menu.add(cadastrar);
        menu.add(pesquisar);
        menu.add(remover);
        menu.add(listar);
        menu.add(atualizar);
        menu.add(sair);

        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}