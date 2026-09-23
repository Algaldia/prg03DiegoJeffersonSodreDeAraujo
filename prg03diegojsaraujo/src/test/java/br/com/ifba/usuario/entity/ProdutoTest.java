/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.ifba.usuario.entity.Produto;
import br.com.ifba.usuario.entity.Fornecedor;

/**
 *
 * @author guest
 */
public class ProdutoTest {
    
    @Test
    public void criandoProdutoEAdicionandoTresFornecedoresEComparandoSeOResultadoETres(){
        Produto produto = new Produto("Cafe");
        Fornecedor fornecedor1 =  new Fornecedor("Atacadao");
        Fornecedor fornecedor2 =  new Fornecedor("Distruidora Fernando");
        Fornecedor fornecedor3 =  new Fornecedor("Cafe Pilão");
        produto.adicionarFornecedor(fornecedor1);
        produto.adicionarFornecedor(fornecedor2);
        produto.adicionarFornecedor(fornecedor3);
        assertEquals(3, produto.getFornecedores().size());
    }
    
}
