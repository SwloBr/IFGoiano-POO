package com.swlo.screens;

import com.swlo.Data;
import com.swlo.contas.*;

import java.util.Objects;
import java.util.Scanner;

public class JuridicoScreen {

    public Scanner scanner = new Scanner(System.in);
    public ContaEmpresarial conta;
    private double valor;
    private String destino;

    public void startScreen() {


            System.out.printf("%s\n%s\nSaldo: R$ %.2f\n\n", conta.getClient().getNome(), conta.getClient().getCnpj(), conta.getSaldo());
        System.out.println("1 - Sacar\n" +
                "2 - Depositar\n" +
                "3 - Transferir\n" +
                "0 - Sair da conta\n\n");

        int option = scanner.nextInt();

        switch (option) {

            case 1:
                System.out.println("Qual o valor que deseja sacar?");

                valor = scanner.nextDouble();

                if (conta.sacar(valor, conta)) {
                    conta.setSaldo(conta.getSaldo() - valor);
                    System.out.println("Sacado");
                } else {
                    System.out.println("\nSem saldo\n");
                    startScreen();
                }
                break;
            case 2:
                System.out.println("Qual o valor que deseja depositar?");

                valor = scanner.nextDouble();


                conta.setSaldo(conta.getSaldo() + valor);
                System.out.println("Depositado");

                break;
            case 3:
                System.out.println("Qual o valor que deseja transferir?");

                valor = scanner.nextDouble();

                if (conta.sacar(valor, conta)) {

                    destino = scanner.next();

                    conta.setSaldo(conta.getSaldo() - valor);
                    System.out.println("Sacado");


                } else {
                    System.out.println("\nSem saldo\n");
                    startScreen();
                }
                break;
            case 0:
                Data.startScreen.firstScreen();
                break;
            default:
                System.out.println("Opção inválida");
                startScreen();


        }
    }

    public boolean transferir(double valor, Conta destino) {

        for (Conta contaDestino : Data.contas) {
            if (Objects.equals(destino, contaDestino.getNumeroDaConta())) {
                conta.setSaldo(conta.getSaldo() - valor);
                contaDestino.setSaldo(conta.getSaldo() + valor);
                System.out.println("Transferencia feita com sucesso");
                return true;
            }
        }
        return false;
    }


}
