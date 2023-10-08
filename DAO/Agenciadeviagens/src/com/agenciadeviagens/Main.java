package com.agenciadeviagens;

import com.agenciadeviagens.dao.ClienteDAO;
import com.agenciadeviagens.database.DatabaseConnection;
import com.agenciadeviagens.model.Cliente;

public class Main {

    public static void main(String[] args) {
   
        var connection = DatabaseConnection.createConnection();

        ClienteDAO clienteDAO = new ClienteDAO(connection);

   
        Cliente cliente = new Cliente();
        cliente.setIDCliente(1);
        cliente.setNome("Fulano");
        cliente.setSobrenome("Ciclano");
        cliente.setEndereco("Rua 13");
        cliente.setEmail("fulano@ciclano.com");
        cliente.setTelefone("42 956749576");

    
        clienteDAO.createCliente(cliente);
        
  
        Cliente clienteLido = clienteDAO.readCliente(1);
        if (clienteLido != null) {
            System.out.println("Cliente recuperado: " + clienteLido.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }

      
        cliente.setNome("Novo Nome");
        clienteDAO.updateCliente(cliente);

        Cliente clienteAtualizado = clienteDAO.readCliente(1);
        if (clienteAtualizado != null) {
            System.out.println("Cliente atualizado: " + clienteAtualizado.getNome());
        } else {
            System.out.println("Cliente não encontrado após atualização.");
        }

      
        clienteDAO.deleteCliente(1);

      
    }
}
