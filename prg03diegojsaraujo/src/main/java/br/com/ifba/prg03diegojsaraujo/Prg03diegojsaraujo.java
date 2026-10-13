/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.prg03diegojsaraujo;

import br.com.ifba.usuario.entity.Cargo;
import br.com.ifba.usuario.entity.Usuario;
import java.util.HashMap;
import java.util.Map;

import br.com.ifba.usuario.entity.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author guest
 */
public class Prg03diegojsaraujo {

    public static void main(String[] args) {
        /*EntityManagerFactory factory =
                Persistence.createEntityManagerFactory(
                        "MinhaUnidadeDePersistencia"
                );

        EntityManager em = factory.createEntityManager();

        try {
            em.getTransaction().begin();

            Produto produto = new Produto("Arroz");

            em.persist(produto);

            em.getTransaction().commit();

            System.out.println("Produto salvo com sucesso!");
            System.out.println("ID: " + produto.getId());

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            e.printStackTrace();

        } finally {
            em.close();
            factory.close();
        }*/
    }
}
