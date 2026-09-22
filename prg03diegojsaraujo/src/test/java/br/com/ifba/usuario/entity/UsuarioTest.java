/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
import br.com.ifba.usuario.validar.ValidadorUsuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author guest
 */
public class UsuarioTest {
    
    @Test
    public void deveRetornarFalseQuandoNomePreenchido(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "02023355");
        
        boolean erro = ValidadorUsuario.nomePreenchido(usuarioTeste.getNome());
        
        assertFalse(erro);
    }
    
    @Test
    public void deveRetornarFalseQuandoCpfPreenchido(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "02023355");
        
        boolean erro = ValidadorUsuario.cpfPreenchido(usuarioTeste.getCpf());
        
        assertFalse(erro);
    }
    
    @Test
    public void deveRetornarFalseQuandoNascimentoPreenchido(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "02023355");
        
        boolean erro = ValidadorUsuario.nascimentoPreenchido(usuarioTeste.getDataNascimento());
        
        assertFalse(erro);
    }
    
    @Test
    public void deveRetornarFalseQuandoTelefonePreenchido(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "02023355");
        
        boolean erro = ValidadorUsuario.telefonePreenchido(usuarioTeste.getTelefone());
        
        assertFalse(erro);
    }
    
    @Test
    public void deveRetornarFalseQuandologinPreenchido(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "02023355");
        
        boolean erro = ValidadorUsuario.loginPreenchido(usuarioTeste.getLogin());
        
        assertFalse(erro);
    }
    
    @Test
    public void deveRetornarFalseQuandoSenhaPreenchido(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "02023355");
        
        boolean erro = ValidadorUsuario.senhaPreenchido(usuarioTeste.getSenha());
        
        assertFalse(erro);
    }
    
    
    @Test
    public void deveRetornarFalseQuandoLoginForPalavraProibida(){
        
        Usuario usuarioTeste = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", "Gerente", "diego", "admin");
        
        boolean erro = ValidadorUsuario.contemPalavraProibida(usuarioTeste.getLogin());
        
        assertFalse(erro);
    }
    
}
