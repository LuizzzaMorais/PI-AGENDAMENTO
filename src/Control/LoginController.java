/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.Helpers.LoginHelper;
import model.Usuario;
import view.Login;

/**
 *
 * @author 182120039
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        Usuario usuario = helper.obterModelo();
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no meu banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
    
}
