package com.mycompany.e.commerce;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GABRIELBENETTINOGUEI
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static void main(String[] args) {
        // URL de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/seu_banco";  // substitua 'seu_banco' pelo nome real do seu banco
        String usuario = "root";  // substitua pelo seu usuário
        String senha = "sua_senha";  // substitua pela sua senha

        // Tentar estabelecer a conexão
        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conectado ao banco de dados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}