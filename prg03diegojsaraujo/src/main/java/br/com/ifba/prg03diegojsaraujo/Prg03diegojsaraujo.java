/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.prg03diegojsaraujo;

import br.com.ifba.produto.controller.ProdutoController;
import br.com.ifba.produto.controller.ProdutoIController;
import br.com.ifba.produto.dao.ProdutoDao;
import br.com.ifba.produto.dao.ProdutoIDao;
import br.com.ifba.produto.service.ProdutoIService;
import br.com.ifba.produto.service.ProdutoService;
import br.com.ifba.produto.view.TelaProduto;
import javax.swing.SwingUtilities;
import org.flywaydb.core.Flyway;

/**
 *
 * @author guest
 */
public class Prg03diegojsaraujo {

    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource(
                    "jdbc:postgresql://localhost:5432/bd_estoque",
                    "postgres",
                    "123456"
                )
                .load();

        flyway.migrate();
        
        ProdutoIDao produtoDao = new ProdutoDao();

        ProdutoIService produtoService =
                new ProdutoService(produtoDao);

        ProdutoIController produtoController =
                new ProdutoController(produtoService);
        
        SwingUtilities.invokeLater(() -> {
            TelaProduto tela = new TelaProduto(produtoController);
            tela.setLocationRelativeTo(null);
            tela.setVisible(true);
        });
    }
}
