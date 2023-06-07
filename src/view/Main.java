/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;

/**
 *
 * @author 182120039
 */
public class Main {
    
    public static void main(String[] args) throws ParseException{
        
        Cliente cliente = new Cliente("teste", "3833744903", 1, "teste");
        System.out.println(cliente.getNome());
        
        Servico servico = new Servico(1, "barba", 30);
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "19/05/2023 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
    
}
