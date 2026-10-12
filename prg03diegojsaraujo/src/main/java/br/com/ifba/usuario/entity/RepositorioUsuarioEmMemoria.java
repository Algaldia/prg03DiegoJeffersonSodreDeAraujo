/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author guest
 */
public class RepositorioUsuarioEmMemoria {
    
    private final List<Usuario> usuarios = new ArrayList<>();
    private final Map<String,Usuario> porCpf = new HashMap<>();
    
    public void cadastrar(Usuario usuario){
        usuarios.add(usuario);
        porCpf.put(usuario.getCpf(), usuario);
    }
    
    public List<Usuario> listarTodos(){
        return usuarios;
    }
    
    public Usuario buscarPorCpfUsandoLista(String cpf){
        for(Usuario usuario : this.usuarios){
            if(usuarios.contains(usuario.getCpf())){
                return usuario;
            }
        }
        return null;
    }
    
    public Usuario buscarPorCpf(String cpf){
        return porCpf.get(cpf);
    }
    
}
