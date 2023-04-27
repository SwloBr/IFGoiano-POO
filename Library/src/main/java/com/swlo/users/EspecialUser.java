package com.swlo.users;

import com.swlo.books.Publicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class EspecialUser extends User {
    private Scanner scanner = new Scanner(System.in);
    public EspecialUser(String name, String cpf, String email, String password, int telephoneNumber, ArrayList<Publicacao> loaned) {
        super(name, cpf, email, password, telephoneNumber, loaned);
    }

    @Override
    public void addLoaned(Publicacao publicacao) {
        getLoaned().add(publicacao);
        System.out.println("Alugado com sucesso");
    }

    @Override
    public void removeLoaned(Publicacao publicacao) {
        System.out.println("Qual voced deseja devolver?");

        for (int i = 0; i < getLoaned().size() ; i++) {
            System.out.println((i +1) + " - " + getLoaned().get(i).getTitle());
        }
        System.out.println("\n");

        while (true) {
            int option = scanner.nextInt();




        }
    }
}
