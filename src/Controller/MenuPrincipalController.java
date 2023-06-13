/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author 182120039
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }

    public MenuPrincipalController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void navegarParaAgenda(){
        
        try {
            Agenda agenda = new Agenda();
            agenda.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(MenuPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
