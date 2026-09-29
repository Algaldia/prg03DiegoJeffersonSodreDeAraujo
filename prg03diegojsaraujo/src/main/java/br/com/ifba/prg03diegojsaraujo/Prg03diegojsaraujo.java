/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.prg03diegojsaraujo;

import br.com.ifba.usuario.entity.Cargo;
import br.com.ifba.usuario.entity.Usuario;

/**
 *
 * @author guest
 */
public class Prg03diegojsaraujo {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "diego", "02023355");
        Usuario usuario2 = new Usuario("Diego", "222-2222", "Masculino", "09/09/1988", "7499199-9365", Cargo.ESTOQUISTA, "jomar", "2255");
        if(usuario1.autenticar("diego", "02023355")){
            System.out.println("Autenticado");
        } else {
            System.out.println("Não Autenticado");
        }
        if(usuario2.autenticar("diego", "02023355")){
            System.out.println("Autenticado");
        } else {
            System.out.println("Não Autenticado");
        }
        
        if(usuario1.processar(usuario1, "diego", "02023355")){
            System.out.println("Autenticado");
        } else {
            System.out.println("Não Autenticado");
        }
        if(usuario2.processar(usuario2, "diego", "02023355")){
            System.out.println("Autenticado");
        } else {
            System.out.println("Não Autenticado");
        }
    }
}
