/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;

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
    
}
