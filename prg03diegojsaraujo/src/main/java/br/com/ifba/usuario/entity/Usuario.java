/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
import br.com.ifba.usuario.interfaces.Autenticavel;

/**
 *
 * @author guest
 */
public class Usuario implements Autenticavel{
    
    //Criando atributos da classe
    private String nome;
    private String cpf;
    private String genero;
    private String dataNascimento;
    private String telefone;
    private Cargo cargo;
    private String login;
    private String senha;
    
    public Usuario(){
    
    }
    
    public Usuario(String nome, String cpf, String genero, String dataNascimento, String telefone, Cargo cargo, String login, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.genero =  genero;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getGenero() {
        return genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
    
}
