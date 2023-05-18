package com.swlo.client;

public class PhisicalPerson extends Client{

    private final String CPF; //constant


    public PhisicalPerson(String name, String phoneNumber, String address, String CPF) {
        super(name, phoneNumber, address);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }
}
