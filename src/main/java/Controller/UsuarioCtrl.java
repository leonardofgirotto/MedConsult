/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuario;

/**
 *
 * @author mathe
 */
public class UsuarioCtrl {
    String nome;
    String email;
    String telefone;
    String senha;

    
    public UsuarioCtrl(){
        // abrir nova conexão com BD
    }
    public void adiciona(Usuario usuario){
        System.out.println("Usuario adicionado com sucesso!");
    }
}
