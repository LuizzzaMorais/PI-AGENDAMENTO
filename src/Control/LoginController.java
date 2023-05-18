/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import view.Login;

/**
 *
 * @author 182120039
 */
public class LoginController {
    
    private final Login view;
    
    public LoginController(Login view){
        this.view = view;
        
    }
    
    public void entrarNoSistema(){
        
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no meu banco de dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
