package com.swlo.clients;

public class PessoaJuridica extends Client{

    private final String cnpj;
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
