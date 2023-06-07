/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Control.Helpers.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author 182120039
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view){
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        helper.preencherTabela(agendamentos);
    }
}