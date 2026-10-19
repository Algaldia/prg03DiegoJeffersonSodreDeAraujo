/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.produto.view;

/**
 *
 * @author guest
 */
public class PrecoInvalidoException extends RuntimeException{
    
    public PrecoInvalidoException(String preco){
        super("Preço invalido: " + preco);
    }
    
}
