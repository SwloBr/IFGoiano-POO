package com.swlo;

import com.swlo.utils.Login;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static ArrayList<ContaCorrente> contas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double value;
        Login loginMethods = new Login();
        ClearConsole();


        int accountNumber = loginMethods.login();

        while (true) {
            contas.get(accountNumber).status();

            System.out.println("\n======X======\n" +
                    "1 - Depositar\n" +
                    "2 - Sacar\n" +
                    "3 - Transferir\n" +
                    "4 - Extrato\n" +
                    "0 - Fechar\n" +
                    "======X======");


            int alternative = scanner.nextInt();
            switch (alternative) {
                case 1:
                    System.out.println("Qual o valor que deseja depositar? ");
                    value = scanner.nextDouble();
                    contas.get(accountNumber).depositar(value);
                    break;

                case 2:
                    System.out.println("Qual o valor que deseja sacar? ");
                    value = scanner.nextDouble();
                    contas.get(accountNumber).sacar(value);
                    break;
                case 3:
                    System.out.println("Para qual conta você quer transferir? (CPF, apenas numeros)");
                    int cpfReciver = scanner.nextInt();
                    if(loginMethods.sameCPF(cpfReciver) != -1) {
                        System.out.println("Recebedor: " + contas.get(loginMethods.sameCPF(cpfReciver)).getName());

                        System.out.println("Qual o valor que deseja transferir? ");
                        value = scanner.nextDouble();
                        contas.get(accountNumber).transferir(contas.get(loginMethods.sameCPF(cpfReciver)), value);
                    } else {
                        System.out.println("Conta de destino não encontrada");
                    }
                    break;
                case 4:
                    System.out.println("\n");
                    contas.get(accountNumber).pegarExtrato();
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("\nO serviço será encerrado em breve\n");

                    System.exit(0);

                default:
                    System.out.println("\nOPÇÃO INEXISTENTE\n");

                    ClearConsole();
                    break;
            }

        }


    }


    public static void ClearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name");

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}