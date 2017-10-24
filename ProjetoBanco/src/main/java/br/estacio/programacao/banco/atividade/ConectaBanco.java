/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.banco.atividade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Claudir
 */
public class ConectaBanco {

    public static void main(String[] args) {
        final String URL = "JDBC:postgresql://localhost:5432/progii-db";
        final String USUARIO =  "postgres";
        final String SENHA = "admin";
        Connection conexao;
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("conectou");
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
