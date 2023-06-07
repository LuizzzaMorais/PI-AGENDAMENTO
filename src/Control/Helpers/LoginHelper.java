/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Helpers;

import com.sun.media.sound.ModelOscillator;
import Model.Usuario;
import view.Login;

/**
 *
 * @author 182120039
 */
public class LoginHelper {
    
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTxtUser().getText();
        String senha = view.getTxtSenha().getText();
        Usuario modelo = new Usuario(0, senha, nome);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
    }
}
