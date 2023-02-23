package com.swlo;

public class Main {
    public static void main(String[] args) {

        ContaCorrente pedro = new ContaCorrente("Pedro Paulo", 209737697, 0001, 077, 2000);
        ContaCorrente marcel = new ContaCorrente("Marcel", 899737642, 2023, 001, 25000);

        System.out.println("\n\n");
        pedro.status();
        pedro.sacar(321421.42);
        pedro.depositar(41232.54);
        pedro.sacar(3211.42);
        pedro.transferir(marcel, 5212);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("EXTRATO");
        System.out.println("------------------------------------------------------------------------------");

        pedro.pegarExtrato();

        System.out.println("\n\n");
    }
}