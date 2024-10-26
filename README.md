# Sistema de Cadastro de Produtos

## Descrição
O Sistema de Cadastro de Produtos é uma aplicação Java que permite cadastrar, listar, atualizar, pesquisar e remover produtos. Utiliza uma interface gráfica baseada em Swing para facilitar a interação com o usuário.

## Funcionalidades
1. **Cadastrar Produto**: Adiciona um novo produto ao sistema com `id`, `nome` e `preço`.
2. **Pesquisar Produto**: Busca um produto pelo `id` e exibe suas informações.
3. **Remover Produto**: Remove um produto do sistema pelo `id`.
4. **Listar Produtos**: Exibe todos os produtos cadastrados.
5. **Atualizar Produto**: Atualiza o `nome` e o `preço` de um produto pelo `id`.

## Estrutura do Projeto
O projeto é composto pelas seguintes classes principais:
- **Produto**: Representa um produto com atributos `id`, `nome` e `preço`.
- **SistemaCadastro**: Interface que define os métodos para gerenciar os produtos.
- **SistemaCadastraProduto**: Implementação da interface `SistemaCadastro` utilizando um `Map` para armazenar os produtos.
- **JanelaPrincipal**: Classe responsável pela interface gráfica do usuário (GUI), utilizando Swing.
