/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.banco.atividade;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Claudir
 */
public class ConectaBanco {

    final String URL = "jdbc:postgresql://localhost:5432/progii-db";
    final String USUARIO = "postgres";
    final String SENHA = "admin";
    Connection conexao;
    Scanner entrada = new Scanner(System.in);

    public void cadastroUsuario(String nome, String sobrenome) {

        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            String sql = "INSERT INTO tb_usuario (nome, sobrenome)"
                    + "VALUES(" + nome+ "," + sobrenome + ")";
            Statement sttm = conexao.createStatement();
            sttm.executeUpdate(sql);
            conexao.close();
            System.out.println("Cadastro realizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void menuCadastro() {
        int cadastro = -1;
        String nome = "", sobrenome = "";
        System.out.print("\n1 - Usuário\n2 - Endereço\n3 - Perfil\n0 - Sair\nEsolha: ");
        cadastro = entrada.nextInt();
        switch (cadastro) {
            case 1:
                System.out.print("Informe o nome do usuário: ");
                nome = entrada.next();
                System.out.print("Informe o sobrenome do usuário: ");
                sobrenome = entrada.next();
                cadastroUsuario(nome, sobrenome);
                break;
            case 0:
                System.out.println("Saindo!");
                break;
            default:
                System.out.println("Escolha Inválida!");
                break;
        }

    }

    public void menuPrincipal() {
        int escolha = -1;

        System.out.print("\n1 - Cadastrar\n2 - Alterar\n3 - Buscar\n4 - Excluir\n0 - Sair\nEscolha: ");
        escolha = entrada.nextInt();
        switch (escolha) {
            case 1:
                menuCadastro();
                break;
            case 0:
                System.out.println("Saindo!");
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
                    
        }
    }

    public static void main(String[] args) {
        ConectaBanco conecta = new ConectaBanco();
        conecta.menuPrincipal();
    }

}
