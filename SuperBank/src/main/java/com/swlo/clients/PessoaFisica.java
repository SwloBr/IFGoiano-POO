package com.swlo.clients;

public class PessoaFisica extends Client{

    private final String cpf;
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
