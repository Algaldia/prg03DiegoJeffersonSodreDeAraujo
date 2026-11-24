package br.com.ifba.produto.service;

import br.com.ifba.produto.dao.ProdutoFakeDao;
import br.com.ifba.usuario.entity.Produto;
import java.util.List;

public class ProdutoServiceTeste {

    private static ProdutoFakeDao produtoFakeDao;
    private static ProdutoService produtoService;
    
    public static void configurar() {

        produtoFakeDao = new ProdutoFakeDao();

        produtoService = new ProdutoService(produtoFakeDao);

    }
    
    public static void testarCadastro() {

        Produto produto = new Produto();

        produto.setNome("Arroz");
        produto.setMarca("Tio João");
        produto.setPreco(25.50f);
        produto.setQuantidadeEstoque(10);
        produto.setLote("L001");
        produto.setDataValidade("2027-12-31");

        Produto resultado = produtoService.save(produto);

        if (resultado != null && resultado.getCodigo() != null) {
            System.out.println("TESTE DE CADASTRO: APROVADO!");
        } else {
            System.out.println("TESTE DE CADASTRO: FALHOU!");
        }
    }
    
    public static void testarAtualizacao() {

        Produto produto = produtoService.findById(1L);

        if (produto != null) {

            produto.setNome("Arroz Integral");
            produto.setPreco(30.00f);

            Produto resultado = produtoService.update(produto);

            if (resultado != null &&
                    resultado.getNome().equals("Arroz Integral")) {

                System.out.println("TESTE DE ATUALIZAÇÃO: APROVADO!");

            } else {
                System.out.println("TESTE DE ATUALIZAÇÃO: FALHOU!");
            }

        } else {
            System.out.println("TESTE DE ATUALIZAÇÃO: PRODUTO NÃO ENCONTRADO!");
        }
    }
    
    public static void testarRemocao() {

        Produto produto = produtoService.findById(1L);

        if (produto != null) {

            produtoService.delete(produto);

            Produto resultado = produtoService.findById(1L);

            if (resultado == null) {
                System.out.println("TESTE DE REMOÇÃO: APROVADO!");
            } else {
                System.out.println("TESTE DE REMOÇÃO: FALHOU!");
            }

        } else {
            System.out.println("TESTE DE REMOÇÃO: PRODUTO NÃO ENCONTRADO!");
        }
    }
    
    public static void testarBuscaPorId() {

        Produto produto = produtoService.findById(1L);

        if (produto != null && produto.getCodigo() == 1L) {

            System.out.println("TESTE DE BUSCA POR ID: APROVADO!");

        } else {

            System.out.println("TESTE DE BUSCA POR ID: FALHOU!");
        }
    }
    
    public static void testarListagem() {

        List<Produto> produtos = produtoService.findAll();

        if (produtos != null && !produtos.isEmpty()) {

            System.out.println("TESTE DE LISTAGEM: APROVADO!");

            for (Produto produto : produtos) {
                System.out.println(
                    produto.getCodigo() + " - " + produto.getNome()
                );
            }

        } else {

            System.out.println("TESTE DE LISTAGEM: FALHOU!");
        }
    }

    public static void testarBuscaPorNome() {

        List<Produto> produtos = produtoService.findByNome("Arroz");

        if (produtos != null && !produtos.isEmpty()) {

            System.out.println("TESTE DE BUSCA POR NOME: APROVADO!");

            for (Produto produto : produtos) {
                System.out.println(produto.getNome());
            }

        } else {

            System.out.println("TESTE DE BUSCA POR NOME: FALHOU!");
        }
    }
    
    public static void main(String[] args) {

        configurar();

        testarCadastro();

        testarBuscaPorId();

        testarBuscaPorNome();

        testarListagem();

        testarAtualizacao();

        testarRemocao();

    }
    
}
