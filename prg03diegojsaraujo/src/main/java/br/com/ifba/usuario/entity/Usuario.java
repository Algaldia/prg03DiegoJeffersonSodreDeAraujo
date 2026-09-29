/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
import br.com.ifba.usuario.interfaces.Autenticavel;
import javax.swing.JOptionPane;

/**
 *
 * @author guest
 */
public class Usuario extends Pessoa implements Autenticavel{
    
    //Criando atributos da classe
    private Cargo cargo;
    private String login;
    private String senha;
    
    public Usuario(){
    
    }
    
    public Usuario(String nome, String cpf, String genero, String dataNascimento, String telefone, Cargo cargo, String login, String senha){
        super(nome, cpf, genero, dataNascimento, telefone);
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setCargo(String cargo) {
        if(cargo.equals("Gerente")){
            this.cargo = Cargo.GERENTE;
        } else if(cargo.equals("Estoquista")){
            this.cargo = Cargo.ESTOQUISTA;
        } else {
            this.cargo = Cargo.REPOSITOR;
        }
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean autenticar (String login, String senha){
        //retorna a comparação de this.login com login e this.senha com senha.
        return this.login.equals(login) && this.senha.equals(senha);
    }
    
    @Override
    public boolean apagarConta(){
        JOptionPane.showMessageDialog(null, "Não é possivel apagar conta");
        return false;
    }
    
}
