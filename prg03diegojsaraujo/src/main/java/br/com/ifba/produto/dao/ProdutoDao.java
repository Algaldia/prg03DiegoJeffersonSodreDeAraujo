/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.ifba.produto.dao;

import br.com.ifba.infrastructure.dao.GenericDao;
import br.com.ifba.infrastructure.util.JPAUtil;
import br.com.ifba.usuario.entity.Produto;

import jakarta.persistence.EntityManager;
import java.util.List;

public class ProdutoDao extends GenericDao<Produto>
        implements ProdutoIDao {

    public ProdutoDao() {
        super(Produto.class);
    }

    @Override
    public List<Produto> findByNome(String nome) {

    EntityManager em = new JPAUtil().retornarEntityManager();

    try {
        String jpql =
                "SELECT p FROM Produto p WHERE LOWER(p.nome) LIKE LOWER(:nome)";

        return em.createQuery(jpql, Produto.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();

    } catch (Exception e) {

        throw new RuntimeException(
                "Erro ao buscar produto pelo nome.", e
        );

    } finally {
        em.close();
    }
}
}

