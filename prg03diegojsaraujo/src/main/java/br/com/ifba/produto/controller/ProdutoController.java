package br.com.ifba.produto.controller;

import br.com.ifba.produto.service.ProdutoIService;
import br.com.ifba.usuario.entity.Produto;
import java.util.List;

public class ProdutoController implements ProdutoIController {

    private final ProdutoIService produtoService;

    public ProdutoController(ProdutoIService produtoService) {
        this.produtoService = produtoService;
    }

    @Override
    public Produto save(Produto produto) {
        return produtoService.save(produto);
    }

    @Override
    public Produto update(Produto produto) {
        return produtoService.update(produto);
    }

    @Override
    public void delete(Produto produto) {
        produtoService.delete(produto);
    }

    @Override
    public Produto findById(Long id) {
        return produtoService.findById(id);
    }

    @Override
    public List<Produto> findAll() {
        return produtoService.findAll();
    }

    @Override
    public List<Produto> findByNome(String nome) {
        return produtoService.findByNome(nome);
    }
}