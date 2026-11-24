package br.com.ifba.produto.controller;

import br.com.ifba.usuario.entity.Produto;
import java.util.List;

public interface ProdutoIController {

    Produto save(Produto produto);

    Produto update(Produto produto);

    void delete(Produto produto);

    Produto findById(Long id);

    List<Produto> findAll();

    List<Produto> findByNome(String nome);
}
