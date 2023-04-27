package com.swlo.screens;

import com.swlo.Data;
import com.swlo.clients.Client;
import com.swlo.clients.PessoaFisica;
import com.swlo.clients.PessoaJuridica;
import com.swlo.contas.*;

import java.util.Objects;
import java.util.Scanner;

public class StartScreen {

    public Scanner scanner = new Scanner(System.in);

    public void firstScreen() {

        System.out.println("===================\n" +
                "     BRAVE BANK  \n" +
                "===================\n\n" +
                "1 - Entrar em uma conta\n" +
                "2 - Criar conta\n" +
                "3 - Fechar progama\n\n" +
                "-------------------\n");
        firstOption();
    }

    public void firstOption() {
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                logIn();
                break;
            case 2:
                singIn();
                break;
            case 3:
                exit();
                break;
            default:
                firstScreen();
                break;
        }

    }

    public void logIn() {

        System.out.println("Insira o numero da conta que\ndeseja acessar: ");

        String numeroDaConta = scanner.next();
        for (Conta conta : Data.contas) {
            if (Objects.equals(conta.getNumeroDaConta(), numeroDaConta)) {
                if (conta instanceof ContaEmpresarial) {
                    Data.juridicoScreen.conta = (ContaEmpresarial) conta;
                    Data.juridicoScreen.startScreen();
                } else if (!(conta instanceof ContaEmpresarial)){
                    Data.fisicoScreen.conta = (ContaFisica) conta;
                    Data.fisicoScreen.startScreen();
                } else if (Data.contas.size() == 0) {
                    System.out.println("Nenhuma Conta encontrada\n");
                } else {
                    System.out.println("Conta inexistente\n");
                }

            }
        }
        firstScreen();
    }

    public void singIn() {

        System.out.println("Qual tipo de cliente você é: \n" +
                "1 - Fisica\n" +
                "2 - Juridica\n");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Qual seu CPF? ");
            String cpf = scanner.next();

            PessoaFisica client = checkarPessoaFisica(cpf);

            System.out.println("Qual tipo de conta você quer criar?");
            System.out.println("1 - Corrente\n" +
                    "2 - Especial\n" +
                    "3 - Poupança\n" +
                    "0 - Voltar para o inicio\n");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    ContaCorrente contaCorrente = new ContaCorrente(Integer.toString(Data.contas.size()), client);
                    Data.contas.add(contaCorrente);
                    System.out.println("Conta criada");
                    firstScreen();
                    break;
                case 2:
                    ContaEspecial contaEspecial = new ContaEspecial(Integer.toString(Data.contas.size()), client, (Data.contas.size()*115));
                    Data.contas.add(contaEspecial);
                    System.out.println("Conta criada");
                    firstScreen();
                    break;
                case 3:
                    ContaPoupanca contaPoupanca = new ContaPoupanca(Integer.toString(Data.contas.size()), client);
                    Data.contas.add(contaPoupanca);
                    System.out.println("Conta criada");
                    firstScreen();
                    break;
                case 0:
                    firstScreen();
                default:
                    System.out.println("Valor inválido");
                    break;
            }


        } else if (option == 2) {
            System.out.println("Qual seu CNPJ? ");
            String cnpj = scanner.next();
            PessoaJuridica client = checkarPessoaJuridica(cnpj);

            ContaEmpresarial contaEmpresarial = new ContaEmpresarial(Integer.toString(Data.contas.size() + 100), client, (Data.contas.size()*45));
            Data.contas.add(contaEmpresarial);
            System.out.println("Conta criada");
            firstScreen();


        } else {
            System.out.println("Valor inválido");
            logIn();
        }


    }

    public PessoaFisica checkarPessoaFisica(String cpf) {
        for (Client client : Data.clients) {
                if (client instanceof PessoaFisica) {
                    PessoaFisica pessoaFisica = (PessoaFisica) client;
                    if(Objects.equals(pessoaFisica.getCpf(), cpf)) {
                        return pessoaFisica;
                    }
                }

            }


        System.out.println("Qual seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual seu telefone? ");
        String telefone = scanner.next();
        System.out.println("Qual seu email? ");
        String email = scanner.next();
        PessoaFisica pp = new PessoaFisica(nome, telefone, email, cpf);
        Data.clients.add(pp);
        return pp;
    }
    public PessoaJuridica checkarPessoaJuridica(String cnpj) {
        for (Client client : Data.clients) {
                if (client instanceof PessoaJuridica) {
                    PessoaJuridica pessoaJuridica = (PessoaJuridica) client;
                    if(Objects.equals(pessoaJuridica.getCnpj(), cnpj)) {
                        return pessoaJuridica;
                    }
                }

            }


        System.out.println("Qual o nome da empresa? ");
        String nome = scanner.nextLine();
        System.out.println("Qual o telefone? ");
        String telefone = scanner.next();
        System.out.println("Qual o email? ");
        String email = scanner.next();
        PessoaJuridica pp = new PessoaJuridica(nome, telefone, email, cnpj);
        Data.clients.add(pp);
        return pp;
    }


    public void exit() {
        System.out.println("\nO serviço será encerrado em breve\n");

        System.exit(0);

    }


}
