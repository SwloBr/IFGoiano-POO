package com.swlo.contas;

import com.swlo.clients.PessoaFisica;

public class ContaFisica extends Conta{

    private PessoaFisica client;
    public ContaFisica(String numeroDaConta, PessoaFisica client) {
        super(numeroDaConta);
        this.client = client;
    }

    public PessoaFisica getClient() {
        return client;
    }

}
