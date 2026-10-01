/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private List<Fornecedor> fornecedores;
    private List<TipoDeProduto> tipos;
    private String dataValidade;
    private String lote;
    private int quantidadeEstoque;
    private String marca;
    

    public Produto() {
        this.fornecedores = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }

    public Produto(String nome) {
        this.nome = nome;
        this.fornecedores = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public List<TipoDeProduto> getTipos() {
        return tipos;
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
    }

    public void adicionarTipo(TipoDeProduto tipo) {
        this.tipos.add(tipo);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}