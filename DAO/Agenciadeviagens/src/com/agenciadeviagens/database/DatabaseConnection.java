package com.agenciadeviagens.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String url = "jdbc:mysql://localhost:3306/Agenciadeviagens";
	private static final String user = "root";
	private static final String password = "Wender1995#";
	
	public static Connection createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Encontrado!");
			
		
		}catch(ClassNotFoundException e) {
			System.out.println("Driver não encontrado! Mensagem: " + e.getLocalizedMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso!");
			
			return connection;
		}catch(SQLException e) {
			System.out.println("Não foi possivel conectar ao Banco! Mensagem: " + e.getMessage());
			return null;
		}
		
		
		
	}
	
	
	
}
