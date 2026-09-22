/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.login.view;
import br.com.ifba.usuario.entity.Usuario;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author guest
 */
public class ValidadorUsuario {
    
    public boolean camposPreenchidos(JTextField txtNome, JTextField txtCpf, JTextField txtNascimento, JTextField txtTelefone, JTextField txtLogin, JPasswordField txtSenha,JPasswordField txtConfirmarSenha,
                                     JLabel txtNomeErro, JLabel txtCpfErro, JLabel txtNascimentoErro, JLabel txtTelefoneErro, JLabel txtLoginErro, JLabel txtSenhaErro, JLabel txtConfirmaSenhaErro){
        
        boolean erro = false;
        
        if( txtNome.getText().isEmpty() ){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtNome.setBorder(border);
            txtNomeErro.setText("Nome não pode estar vazio!");
            erro = true;
        }
        if( txtCpf.getText().isEmpty() ){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtCpf.setBorder(border);
            txtCpfErro.setText("CPF não pode estar vazio!");
            erro = true;
        }
        if( txtNascimento.getText().isEmpty() ){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtNascimento.setBorder(border);
            txtNascimentoErro.setText("<html>Data de Nascimento<br> não pode estar vazio!</html>");
            erro = true;
        }
        if( txtTelefone.getText().isEmpty() ){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtTelefone.setBorder(border);
            txtTelefoneErro.setText("Telefone não pode estar vazio!");
            erro = true;
        }
        if( txtLogin.getText().isEmpty() ){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtLogin.setBorder(border);
            txtLoginErro.setText("Login não pode estar vazio!");
            erro = true;
        }
        if( String.valueOf(txtSenha.getPassword()).isEmpty()){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtSenha.setBorder(border);
            txtSenhaErro.setText("Senha não pode estar vazio!");
            erro = true;
        }
        if( String.valueOf(txtConfirmarSenha.getPassword()).isEmpty()){
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            txtConfirmarSenha.setBorder(border);
            txtConfirmaSenhaErro.setText("Nome não pode estar vazio!");
            erro = true;
        }
        
        return erro;
        
    } 
    
}
