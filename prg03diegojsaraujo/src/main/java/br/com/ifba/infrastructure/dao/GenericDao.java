/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import br.com.ifba.infrastructure.util.JPAUtil;

import jakarta.persistence.EntityManager;
import java.util.List;

public class GenericDao<Entity extends PersistenceEntity>
        implements GenericIDao<Entity> {

    private final Class<Entity> tipo;
    private final JPAUtil jpaUtil = new JPAUtil();

    public GenericDao(Class<Entity> tipo) {
        this.tipo = tipo;
    }

    // CADASTRAR
    @Override
    public Entity save(Entity objeto) {

        EntityManager em = jpaUtil.retornarEntityManager();

        try {
            em.getTransaction().begin();

            em.persist(objeto);

            em.getTransaction().commit();

            return objeto;

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            throw new RuntimeException(
                    "Erro ao salvar registro.", e
            );

        } finally {
            em.close();
        }
    }

    // ATUALIZAR
    @Override
    public Entity update(Entity objeto) {

        EntityManager em = jpaUtil.retornarEntityManager();

        try {
            em.getTransaction().begin();

            Entity objetoAtualizado = em.merge(objeto);

            em.getTransaction().commit();

            return objetoAtualizado;

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            throw new RuntimeException(
                    "Erro ao atualizar registro.", e
            );

        } finally {
            em.close();
        }
    }

    // EXCLUIR
    @Override
    public void delete(Entity objeto) {

        EntityManager em = jpaUtil.retornarEntityManager();

        try {
            em.getTransaction().begin();

            Entity objetoGerenciado = em.contains(objeto)
                    ? objeto
                    : em.merge(objeto);

            em.remove(objetoGerenciado);

            em.getTransaction().commit();

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            throw new RuntimeException(
                    "Erro ao excluir registro.", e
            );

        } finally {
            em.close();
        }
    }

    // BUSCAR PELO ID
    @Override
    public Entity findById(Long id) {

        EntityManager em = jpaUtil.retornarEntityManager();

        try {
            return em.find(tipo, id);

        } catch (Exception e) {

            throw new RuntimeException(
                    "Erro ao buscar registro pelo ID.", e
            );

        } finally {
            em.close();
        }
    }

    // BUSCAR TODOS
    @Override
    public List<Entity> findAll() {

        EntityManager em = jpaUtil.retornarEntityManager();

        try {
            String jpql = "SELECT e FROM "
                    + tipo.getSimpleName() + " e";

            return em.createQuery(jpql, tipo).getResultList();

        } catch (Exception e) {

            throw new RuntimeException(
                    "Erro ao buscar todos os registros.", e
            );

        } finally {
            em.close();
        }
    }
}

