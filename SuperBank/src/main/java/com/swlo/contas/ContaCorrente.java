package com.swlo.contas;

import com.swlo.clients.Client;
import com.swlo.clients.PessoaFisica;

public class ContaCorrente extends ContaFisica{

    private final PessoaFisica client;

    public ContaCorrente(String numeroDaConta, PessoaFisica client) {
        super(numeroDaConta, client);
        this.client = client;

    }

}
