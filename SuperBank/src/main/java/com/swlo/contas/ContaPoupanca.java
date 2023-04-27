package com.swlo.contas;

import com.swlo.clients.PessoaFisica;

public class ContaPoupanca extends ContaFisica {


    private double rendimento;

    public ContaPoupanca(String numeroDaConta, PessoaFisica client) {
        super(numeroDaConta, client);
    }


    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void addRendimento(double rendimento) {
        this.rendimento += rendimento;
    }
}
