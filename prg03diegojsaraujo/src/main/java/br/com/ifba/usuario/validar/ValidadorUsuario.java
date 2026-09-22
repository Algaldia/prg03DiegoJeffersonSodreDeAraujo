/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author guest
 */
public class ValidadorUsuario {
    
    public static boolean contemPalavraProibida(String texto){
        
        //Array de palavras proibidas
        
        String palavrasProibidas[] = {"admin", "administrador", "teste", "root", "senha123", "qwerty"};
        
        //Comparando o texto com o vetor.
        for(String valor: palavrasProibidas){
            if(texto.equals(valor)){
                
                return true;
            }
        }
        return false;
        
    }
    
    public static boolean nomePreenchido(String nome){
        boolean erro = false;
        
        if( nome.isEmpty() ){
            erro = true;
        }
        return erro;      
    } 
    
    public static boolean cpfPreenchido(String cpf){
        boolean erro = false;
        
        if( cpf.isEmpty() ){
            erro = true;
        }
        return erro;
    }
    
    public static boolean nascimentoPreenchido(String dataNascimento){
        boolean erro = false;
        
        if( dataNascimento.isEmpty() ){
            erro = true;
        }
        return erro;
    }
        
    public static boolean telefonePreenchido(String telefone){
        boolean erro = false;
        
        if( telefone.isEmpty() ){
            erro = true;
        }
        return erro;
    }
    
    public static boolean loginPreenchido(String login){
        boolean erro = false;
        
        if( login.isEmpty() ){
            erro = true;
        }
        return erro;
    }
    
    public static boolean senhaPreenchido(String senha){
        boolean erro = false;
        
        if( senha.isEmpty() ){
            erro = true;
        }
        return erro;
    }
    
    public static boolean confirmaSenhaPreenchido(String confirmaSenha){
        boolean erro = false;
        
        if( confirmaSenha.isEmpty() ){
            erro = true;
        }
        return erro;
    }
    
    public static boolean compararSenhaConfirmaSenha(String senha, String confirmaSenha, JLabel txtConfirmaSenhaErro){
        boolean erro = false;
        if( (!(senha.equals(confirmaSenha)))){
            txtConfirmaSenhaErro.setText("Senha está diferente do confirma senha!");
            erro = true;
        }
        return erro;
    }
    
}
