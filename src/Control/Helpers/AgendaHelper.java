/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Helpers;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 182120039
 */
public class AgendaHelper implements IHelper {

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
    DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBox1().getModel();
    for (Cliente cliente : clientes){
        comboBoxModel.addElement(cliente);
    }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBox2().getModel();
        
        for(Servico servico : servicos){
            comboBoxModel.addElement(servico);
        }
    }

    public Servico obterServico() {
        return (Servico) view.getjComboBox2().getSelectedItem();
    }
    
    public Cliente obterCliente() {
        return (Cliente) view.getjComboBox1().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getjTextField2().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextData().getText();
        String hora = view.getTextHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextArea1().getText();
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTextId().setText("");
        view.getTextData().setText("");
        view.getTextHora().setText("");
        view.getjTextArea1().setText("");
    }
    
    
    
}
