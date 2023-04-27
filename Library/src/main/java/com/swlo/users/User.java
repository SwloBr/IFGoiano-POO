package com.swlo.users;

import com.swlo.books.Publicacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Objects;

public abstract class User {


    private final String name;

    private final String cpf;
    private final String password;
    private String email;
    private int telephoneNumber;
    private ArrayList<Publicacao> loaned;



    public User(String name, String cpf, String email, String password, int telephoneNumber, ArrayList<Publicacao> loaned) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.email = email;
        this.loaned = loaned;
        this.telephoneNumber = telephoneNumber;
    }


    public ArrayList<Publicacao> getLoaned() {
        return loaned;
    }

    public String listLoaned(){
        StringBuilder x = new StringBuilder();
        for (Publicacao pub: getLoaned()) {
            x.append(pub.getTitle()).append("/n");
        }
        return x.toString();
    }


    public abstract void addLoaned(Publicacao publicacao);
    public abstract void removeLoaned(Publicacao publicacao);

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Boolean checkPassword(String password) {

        if (Objects.equals(password, this.password)) {
            System.out.println("Senha Correta");
            return true;
        }
        System.out.println("Senha Inválida");
        return false;
    }



}
