/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Cliente;

/**
 *
 * @author 182120039
 */
public class Main {
    
    public static void main(String[] args){
        
        Cliente cliente = new Cliente("teste", "3833744903", 1, "teste");
        System.out.println(cliente.getNome());
    }
    
}
