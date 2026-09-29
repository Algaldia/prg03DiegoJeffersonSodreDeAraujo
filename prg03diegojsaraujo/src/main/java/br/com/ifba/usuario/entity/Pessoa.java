/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

/**
 *
 * @author guest
 */
public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private String genero;
    private String dataNascimento;
    private String telefone;
    protected boolean visivel;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String cpf, String genero, String dataNascimento, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.genero =  genero;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.visivel = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public boolean apagarConta(){
        this.visivel = false;
        return true;
    }
    
}
