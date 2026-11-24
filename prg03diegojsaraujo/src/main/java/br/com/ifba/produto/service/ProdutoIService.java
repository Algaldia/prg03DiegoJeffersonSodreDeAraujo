package br.com.ifba.produto.service;

import br.com.ifba.usuario.entity.Produto;
import java.util.List;

public interface ProdutoIService {

    Produto save(Produto produto);

    Produto update(Produto produto);

    void delete(Produto produto);

    Produto findById(Long id);

    List<Produto> findAll();

    List<Produto> findByNome(String nome);
}