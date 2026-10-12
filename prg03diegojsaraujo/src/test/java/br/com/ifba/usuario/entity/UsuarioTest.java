/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.interfaces.Autenticavel;
/**
 *
 * @author guest
 */
public class UsuarioTest {
    
    @Test
    public void testarResultadoDaMetodoHerdadoComOverride(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        
        boolean retorno = usuarioTeste.apagarConta();
        
        assertFalse(retorno);
        
    }
    
    @Test
    public void testarCriacaoDeUsuarioAtravesDoObjetoAutenticavel(){
        Autenticavel pessoa = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        assertTrue(pessoa.autenticar("diego", "02023355"));
    }
    
    @Test
    public void testarSeDoisUsuariosComCpfIguaisSeraoConsideradosIguais(){
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        
        Usuario usuarioTeste2 = new Usuario("Dani", "222-2222", "Masculino", "09/09/6655", "7499199-9685", Cargo.ESTOQUISTA, "duda", "0032325");
        
        RepositorioUsuarioEmMemoria listaUsuario = new RepositorioUsuarioEmMemoria();
        
        listaUsuario.cadastrar(usuarioTeste);
        
        assertTrue(listaUsuario.listarTodos().contains(usuarioTeste2));
    }
    
    @Test 
    public void cadastrarDoisEBuscarPorLoginDevolveOCerto(){
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        
        Usuario usuarioTeste2 = new Usuario("Dani", "333-3333", "Masculino", "09/09/6655", "7499199-9685", Cargo.ESTOQUISTA, "duda", "0032325");
        
        RepositorioUsuarioEmMemoria listaUsuario = new RepositorioUsuarioEmMemoria();
        
        listaUsuario.cadastrar(usuarioTeste);
        
        listaUsuario.cadastrar(usuarioTeste2);
        
        assertTrue(usuarioTeste.equals(listaUsuario.buscarPorCpf("222-2222")));
    }
    
    @Test 
    public void cadastrarDoisEBuscarPorLoginQueNaoExiste(){
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        
        Usuario usuarioTeste2 = new Usuario("Dani", "333-3333", "Masculino", "09/09/6655", "7499199-9685", Cargo.ESTOQUISTA, "duda", "0032325");
        
        RepositorioUsuarioEmMemoria listaUsuario = new RepositorioUsuarioEmMemoria();
        
        listaUsuario.cadastrar(usuarioTeste);
        
        listaUsuario.cadastrar(usuarioTeste2);
        
        assertFalse(usuarioTeste.equals(listaUsuario.buscarPorCpf("222-2223")));
    }
    
    @Test 
    public void cadastrarDoisObjetosDiferentesComMesmoCpfETestarSeEqualsRetornaTrue(){
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        
        Usuario usuarioTeste2 = new Usuario("Dani", "222-2222", "Masculino", "09/09/6655", "7499199-9685", Cargo.ESTOQUISTA, "duda", "0032325");
         
        assertTrue(usuarioTeste.equals(usuarioTeste2));
    }
    
}
