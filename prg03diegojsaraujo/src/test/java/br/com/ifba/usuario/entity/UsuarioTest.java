/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.com.ifba.usuario.entity.Usuario;
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
    
}
