package br.com.ifba.produto.dao;

import br.com.ifba.usuario.entity.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoFakeDao implements ProdutoIDao {

    private final List<Produto> produtos = new ArrayList<>();

    private Long proximoCodigo = 1L;
    
    @Override
    public Produto save(Produto produto) {

        produto.setCodigo(proximoCodigo++);

        produtos.add(produto);

        return produto;
    }
    
    @Override
    public Produto update(Produto produto) {

        for (int i = 0; i < produtos.size(); i++) {

            if (produtos.get(i).getCodigo() == produto.getCodigo()) {

                produtos.set(i, produto);

                return produto;
            }
        }

        return null;
    }
    
    @Override
    public void delete(Produto produto) {

        produtos.removeIf(p -> p.getCodigo() == produto.getCodigo());

    }
    
    @Override
    public Produto findById(Long id) {

        for (Produto produto : produtos) {

            if (produto.getCodigo() == id) {
                return produto;
            }
        }

        return null;
    }
    
    @Override
    public List<Produto> findAll() {

        return new ArrayList<>(produtos);

    }
    
    @Override
    public List<Produto> findByNome(String nome) {

        List<Produto> resultado = new ArrayList<>();

        for (Produto produto : produtos) {

            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(produto);
            }
        }

        return resultado;
    }

}
