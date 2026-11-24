package br.com.ifba.produto.service;

import br.com.ifba.produto.dao.ProdutoIDao;
import br.com.ifba.usuario.entity.Produto;
import java.math.BigDecimal;
import java.util.List;

public class ProdutoService implements ProdutoIService {

    private final ProdutoIDao produtoDao;

    public ProdutoService(ProdutoIDao produtoDao) {
        this.produtoDao = produtoDao;
    }

    @Override
    public Produto save(Produto produto) {
        validarProduto(produto);
        return produtoDao.save(produto);
    }

    @Override
    public Produto update(Produto produto) {
        validarProduto(produto);
        return produtoDao.update(produto);
    }

    @Override
    public void delete(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não encontrado.");
        }

        produtoDao.delete(produto);
    }

    @Override
    public Produto findById(Long id) {
        return produtoDao.findById(id);
    }

    @Override
    public List<Produto> findAll() {
        return produtoDao.findAll();
    }

    @Override
    public List<Produto> findByNome(String nome) {
        return produtoDao.findByNome(nome);
    }

    private void validarProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }

        float preco = produto.getPreco();

        if (!Float.isFinite(preco) || preco < 0) {
            throw new IllegalArgumentException(
                "O preço deve ser um número válido e não negativo."
            );
        }

        BigDecimal valor = new BigDecimal(Float.toString(preco));

        if (valor.scale() > 2) {
            throw new IllegalArgumentException(
                "O preço deve ter no máximo duas casas decimais."
            );
        }
    }
}