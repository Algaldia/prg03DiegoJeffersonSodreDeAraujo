
package br.com.ifba.infrastructure.dao;


import br.com.ifba.usuario.entity.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenericDaoTest {

    @Test
    public void deveLancarExcecaoAoSalvarObjetoNulo() {

        GenericDao<Produto> dao =
                new GenericDao<>(Produto.class);

        RuntimeException excecao = assertThrows(
                RuntimeException.class,
                () -> dao.save(null)
        );

        assertEquals(
                "Erro ao salvar registro.",
                excecao.getMessage()
        );
    }
}
