import br.com.ifba.produto.dao.ProdutoFakeDao;
import br.com.ifba.produto.service.ProdutoService;
import br.com.ifba.usuario.entity.Produto;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoServiceTeste {

    private ProdutoFakeDao produtoFakeDao;
    private ProdutoService produtoService;

    @BeforeEach
    public void configurar() {
        produtoFakeDao = new ProdutoFakeDao();
        produtoService = new ProdutoService(produtoFakeDao);
    }
    
    @Test
    public void testarCadastro() {

        Produto produto = new Produto();

        produto.setNome("Arroz");
        produto.setMarca("Tio João");
        produto.setPreco(25.50f);
        produto.setQuantidadeEstoque(10);
        produto.setLote("L001");
        produto.setDataValidade("2027-12-31");

        Produto resultado = produtoService.save(produto);

        assertNotNull(resultado);
        assertNotNull(resultado.getCodigo());
        assertEquals("Arroz", resultado.getNome());

    }
    
    @Test
    public void testarAtualizacao() {

        // Primeiro, cadastramos um produto
        Produto produto = new Produto();

        produto.setNome("Arroz");
        produto.setMarca("Tio João");
        produto.setPreco(25.50f);
        produto.setQuantidadeEstoque(10);
        produto.setLote("L001");
        produto.setDataValidade("2027-12-31");

        Produto cadastrado = produtoService.save(produto);

        // Alteramos o nome
        cadastrado.setNome("Arroz Integral");

        Produto atualizado = produtoService.update(cadastrado);

        // Verificamos o resultado
        assertNotNull(atualizado);
        assertEquals("Arroz Integral", atualizado.getNome());

    }
    
    @Test
    public void testarRemocao() {

        // Cadastramos um produto
        Produto produto = new Produto();

        produto.setNome("Arroz");
        produto.setMarca("Tio João");
        produto.setPreco(25.50f);
        produto.setQuantidadeEstoque(10);
        produto.setLote("L001");
        produto.setDataValidade("2027-12-31");

        Produto cadastrado = produtoService.save(produto);

        // Removemos o produto
        produtoService.delete(cadastrado);

        // Verificamos se ele realmente foi removido
        assertNull(produtoService.findById(cadastrado.getCodigo()));

    }
    
    @Test
    public void testarBuscaPorId() {

        // Cadastramos um produto
        Produto produto = new Produto();

        produto.setNome("Arroz");
        produto.setMarca("Tio João");
        produto.setPreco(25.50f);
        produto.setQuantidadeEstoque(10);
        produto.setLote("L001");
        produto.setDataValidade("2027-12-31");

        Produto cadastrado = produtoService.save(produto);

        // Buscamos pelo código
        Produto encontrado = produtoService.findById(cadastrado.getCodigo());

        // Verificamos o resultado
        assertNotNull(encontrado);
        assertEquals("Arroz", encontrado.getNome());
        assertEquals(cadastrado.getCodigo(), encontrado.getCodigo());

    }
    
    @Test
    public void testarListagem() {

        // Cadastramos dois produtos
        Produto produto1 = new Produto();
        produto1.setNome("Arroz");
        produto1.setMarca("Tio João");
        produto1.setPreco(25.50f);
        produto1.setQuantidadeEstoque(10);
        produto1.setLote("L001");
        produto1.setDataValidade("2027-12-31");

        Produto produto2 = new Produto();
        produto2.setNome("Feijão");
        produto2.setMarca("Kicaldo");
        produto2.setPreco(8.50f);
        produto2.setQuantidadeEstoque(20);
        produto2.setLote("L002");
        produto2.setDataValidade("2027-10-31");

        produtoService.save(produto1);
        produtoService.save(produto2);

        // Buscamos todos os produtos
        List<Produto> produtos = produtoService.findAll();

        // Verificamos o resultado
        assertNotNull(produtos);
        assertEquals(2, produtos.size());

    }
    
    @Test
    public void testarBuscaPorNome() {

        // Cadastramos dois produtos
        Produto produto1 = new Produto();
        produto1.setNome("Arroz Integral");
        produto1.setMarca("Tio João");
        produto1.setPreco(25.50f);
        produto1.setQuantidadeEstoque(10);
        produto1.setLote("L001");
        produto1.setDataValidade("2027-12-31");

        Produto produto2 = new Produto();
        produto2.setNome("Feijão Carioca");
        produto2.setMarca("Kicaldo");
        produto2.setPreco(8.50f);
        produto2.setQuantidadeEstoque(20);
        produto2.setLote("L002");
        produto2.setDataValidade("2027-10-31");

        produtoService.save(produto1);
        produtoService.save(produto2);

        // Buscamos produtos pelo nome
        List<Produto> encontrados = produtoService.findByNome("Arroz");

        // Verificamos o resultado
        assertNotNull(encontrados);
        assertEquals(1, encontrados.size());
        assertEquals("Arroz Integral", encontrados.get(0).getNome());

    }

}