package com.swlo.contas;

import com.swlo.clients.PessoaFisica;

public class ContaEspecial extends ContaFisica{
    private double checkEspecial;


    public ContaEspecial(String numeroDaConta, PessoaFisica client, double checkEspecial) {
        super(numeroDaConta, client);
        this.checkEspecial =  checkEspecial;
    }


    public double getCheckEspecial() {
        return checkEspecial;
    }

    public void setCheckEspecial(double checkEspecial) {
        this.checkEspecial = checkEspecial;
    }
}

