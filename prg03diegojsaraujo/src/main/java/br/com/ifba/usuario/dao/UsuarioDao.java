/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.dao;

import br.com.ifba.infrastructure.dao.GenericDao;
import br.com.ifba.infrastructure.util.JPAUtil;
import br.com.ifba.usuario.entity.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

/**
 *
 * @author guest
 */
public class UsuarioDao extends GenericDao<Usuario>
        implements UsuarioIDao {

    public UsuarioDao() {
        super(Usuario.class);
    }

    @Override
    public Usuario findByLogin(String login) {
        EntityManager em = new JPAUtil().retornarEntityManager();

        try {
            String jpql = "SELECT u FROM Usuario u WHERE u.login = :login";

            return em.createQuery(jpql, Usuario.class)
                    .setParameter("login", login)
                    .getSingleResult();

        } catch (NoResultException e) {
            return null;

        } catch (Exception e) {
            throw new RuntimeException  (
                    "Erro ao buscar usuário pelo login.", e
            );

        } finally {
            em.close();
        }
    }
}
