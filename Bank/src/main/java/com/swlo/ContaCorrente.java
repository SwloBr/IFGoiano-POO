package com.swlo;

import java.util.ArrayList;
import java.util.Objects;

public class ContaCorrente {


    public final int numeroDaConta;

    private final int cpf;
    private final String nome;
    private final int agencia;
    private final int banco;
    public ArrayList<String> extrato = new ArrayList<>();
    private double saldo;

    private String senha;


    public ContaCorrente(String nome, int numeroDaConta, int cpf, int agencia, int banco, double saldo, String senha) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean verificarSenha(String senhaEntrada) {
        if (Objects.equals(senhaEntrada, this.senha)) {
            return true;
        }
        return false;
    }

    public void status() {
        System.out.printf("\n\nOlá %s, o seu saldo atual é de: R$ %.2f\n", nome, saldo);
        System.out.printf("CPF: %d\n", cpf);
        System.out.printf("Numero da conta: %d\n", numeroDaConta);
        System.out.printf("Agencia: %d\n", agencia);
        System.out.printf("banco: %d\n\n", banco);
    }

    public String getSenha() {
        return this.senha;
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
            destino.saldo += valorDaTransferencia;
            System.out.println("Você transferiu com sucesso R$ " + valorDaTransferencia + " para " + destino.nome);
            extrato.add("Você transferiu com sucesso R$ " + valorDaTransferencia + " para " + destino.nome);
        }

    }

    public void pegarExtrato() {
        for (String s : extrato) {
            System.out.println(s);
        }
    }


    public int getCPF() {
        return this.cpf;
    }

    public String getName() {
        return nome;
    }
}
