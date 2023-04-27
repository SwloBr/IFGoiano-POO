package com.swlo.contas;

import com.swlo.clients.Client;
import com.swlo.clients.PessoaJuridica;

public class ContaEmpresarial extends Conta{

    private final PessoaJuridica client;

    private double checkEspecial;


    public ContaEmpresarial(String numeroDaConta, PessoaJuridica client, double checkEspecial) {
        super(numeroDaConta);
        this.client = client;
        this.checkEspecial =  checkEspecial;
    }


    public PessoaJuridica getClient() {
        return client;
    }

    public double getCheckEspecial() {
        return checkEspecial;
    }

    public void setCheckEspecial(double checkEspecial) {
        this.checkEspecial = checkEspecial;
    }

}

