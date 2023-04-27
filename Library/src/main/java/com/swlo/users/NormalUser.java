package com.swlo.users;

import com.swlo.books.Publicacao;
import com.swlo.books.data.Author;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

public class NormalUser extends User{

    public NormalUser(String name, String cpf, String email, String password, int telephoneNumber, ArrayList<Publicacao> loaned) {
        super(name, cpf, email, password, telephoneNumber, loaned);
    }

    @Override
    public void addLoaned(Publicacao publicacao) {
        if (getLoaned().size()==1) {
            System.out.println("Você não pode alugar mais de 1 livro");
            return;
        }
        getLoaned().add(publicacao);
        System.out.println("Alugado com sucesso");
    }

    @Override
    public void removeLoaned(Publicacao publicacao) {

        getLoaned().remove(0);
    }
}
