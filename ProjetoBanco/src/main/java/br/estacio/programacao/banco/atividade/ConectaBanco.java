/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.banco.atividade;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Claudir
 */
public class ConectaBanco {

    Scanner entrada = new Scanner(System.in);
    
    public void cadastrarUsuario(String nome, String sobrenome){
        Usuario usuario = new Usuario();
        DAOUsuario dao = new DAOUsuario();
        usuario.setNome(nome);
        usuario.setSobrenome(sobrenome);
        dao.salvarUsuario(usuario);
    }
    public void listarUsuario(){
        DAOUsuario dao = new DAOUsuario();
        List<Usuario>lista;
        lista = dao.listarUsuario();
        for (Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }
    }
    public void alterarUsuario(String nome){
        DAOUsuario dao = new DAOUsuario();
        Usuario usuario = new Usuario();
        
        
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
                     cadastrarUsuario(nome, sobrenome);
                break;
            case 0:
                System.out.println("Saindo!");
                break;
            default:
                System.out.println("Escolha Inválida!");
                break;
        }

    }
    public void menuListar(){
        int lista = -1;
        String nome = "", sobrenome = "";
        System.out.print("\n1 - Usuário\n2 - Endereço\n3 - Perfil\n0 - Sair\nEsolha: ");
        lista = entrada.nextInt();
        switch(lista){
            case 1:
                listarUsuario();
            break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void menuPrincipal() {
        int escolha = -1;

        System.out.print("\n1 - Cadastrar\n2 - Alterar\n3 - Listar\n4 - Excluir\n0 - Sair\nEscolha: ");
        escolha = entrada.nextInt();
        switch (escolha) {
            case 1:
                menuCadastro();
                break;
            case 3:
                menuListar();
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
