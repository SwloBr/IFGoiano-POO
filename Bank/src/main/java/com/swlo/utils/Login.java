package com.swlo.utils;

import com.swlo.ContaCorrente;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com.swlo.Main.ClearConsole;
import static com.swlo.Main.contas;


public class Login {
    int cpf;
    String senha;
    Scanner scanner = new Scanner(System.in);

    public int login()  {


        while (true) {
            System.out.println("======X======\n" +
                    "1 - Login\n" +
                    "2 - Cadastrar\n" +
                    "0 - Fechar\n" +
                    "======X======");

            int loginOption = scanner.nextInt();
            ClearConsole();

            switch (loginOption) {
                case 1:
                    System.out.print("\nQual o seu CPF: ");
                    scanner.nextLine();
                    cpf = scanner.nextInt();
                    if (sameCPF(cpf) != -1) {
                        while (true) {
                            System.out.print("\nQual a Senha: ");

                            scanner.nextLine();

                            senha = scanner.nextLine();
                            if(checkPassword(cpf, senha)) {
                                System.out.println("LOGADO COM SUCESSO");
                                return sameCPF(cpf);
                            } else {
                                System.out.println("\nSenha Incorreta\n" +
                                        "Tente novamente\n");
                            }


                        }

                    }
                    System.out.print("\nQual a sua senha: ");

                case 2:
                    scanner.nextLine();
                    System.out.print("\nQual o seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("\nQual o seu CPF: ");
                    cpf = scanner.nextInt();
                    if (sameCPF(cpf) == -1) {

                        int nConta = contas.size() +1;
                        int agencia = 001;
                        int banco = 007;
                        System.out.println("Dados bancarios\n" +
                                "Numero: " + nConta +
                                "\nAgencia: " + agencia +
                                "\nBanco: " + banco +
                                "\n");

                        System.out.println("Qual senha você quer definir  em sua conta?");
                        scanner.nextLine();

                        senha = scanner.nextLine();
                        contas.add(new ContaCorrente(nome, nConta, cpf, agencia, banco, 0, senha));

                        System.out.println("\nCONTA CRIADA COM SUCESSO\n");



                    } else {
                        System.out.println("Esse CPF Já está em uso");

                    }
                    break;


                case 0:
                    System.out.println("\nO serviço será encerrado em breve\n");

                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOPÇÃO INEXISTENTE\n");

                    ClearConsole();
                    break;
            }

        }

    }

    public int sameCPF(int cpf) {

        for (int i = 0; i < contas.size(); i++) {
            if (Objects.equals(contas.get(i).getCPF(), cpf)) {

                return i;
            }
        }
        return -1;
    }

    boolean checkPassword(int cpf, String senha) {

        if (Objects.equals(contas.get(sameCPF(cpf)).getSenha(), senha)) {
            return true;
        }

        return false;
    }


}
