package com.swlo;

import java.util.ArrayList;

public class ContaCorrente {


    public final int numeroDaConta;
    private final String nome;
    private final int agencia;
    private final int banco;
    public ArrayList<String> extrato = new ArrayList<>();
    private double saldo;

    public ContaCorrente(String nome, int numeroDaConta, int agencia, int banco, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public void status() {
        System.out.printf("Olá %s, o seu saldo atual é de: R$ %.2f\n", nome, saldo);
        System.out.printf("Numero da conta: %d\n", numeroDaConta);
        System.out.printf("Agencia: %d\n", agencia);
        System.out.printf("banco: %d\n\n", banco);
    }


    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("O seu saldo é inferior ao valor que deseja sacar");
            extrato.add("Errou ao tentar realizar um saque, saldo insuficiente");
        } else {
            this.saldo -= saque;
            System.out.println("Você sacou com sucesso R$ " + saque);
            extrato.add("Você sacou com sucesso R$ " + saque);
        }
    }

    public void depositar(double deposito) {

        this.saldo += deposito;
        System.out.println("Você depositou com sucesso R$ " + deposito);
        extrato.add("Você depositou com sucesso R$ " + deposito);
    }


    public void transferir(ContaCorrente destino, double valorDaTransferencia) {
        if (valorDaTransferencia > saldo) {
            System.out.println("O seu saldo é inferior ao valor que deseja transferir");
            extrato.add("Errou ao tentar realizar uma transferencia, saldo insuficiente");
        } else {
            this.saldo -= valorDaTransferencia;
            System.out.println("Você transferiu com sucesso R$ " + valorDaTransferencia + " para " + destino.nome);
            extrato.add("Você transferiu com sucesso R$ " + valorDaTransferencia + " para " + destino.nome);
        }

    }

    public void pegarExtrato() {
        for (String s : extrato) {
            System.out.println(s);
        }
    }
}
