package com.swlo;

import com.swlo.books.Artigos;
import com.swlo.books.Livro;
import com.swlo.books.Publicacao;
import com.swlo.books.Teses;
import com.swlo.books.data.Author;
import com.swlo.books.data.Editor;
import com.swlo.users.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    public static ArrayList<Author> authors = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Editor> editors = new ArrayList<>();

    public void loadData() {

        // AUTHORS \\

        authors.add(new Author("Pedro Paulo", "27/08/2003"));
        authors.add(new Author("Jk Rolling", "18/04/1989"));
        authors.add(new Author("dromeld", "18/04/1949"));

        // EDITORS \\

        editors.add(new Editor("Pedro's company", "23/12/1999"));
        editors.add(new Editor(" Harr", "14/02/1799"));
        // PUBLISHS  \\


        ArrayList<Publicacao> publicacaos = Biblioteca.publicacaos;
        publicacaos.add(new Artigos("Particulas phi", new ArrayList<Author>(Arrays.asList(authors.get(0))), new ArrayList<String>(Arrays.asList("Pedrudo")), "22/04/2021", "ovo"));
        publicacaos.add(new Livro("Petter Poul e a Pedra Filosofal", new ArrayList<Author>(Arrays.asList(authors.get(1))), new ArrayList<String>(Arrays.asList("Pedrudo")), "22/04/2021", 3, editors.get(1), "611233"));
        publicacaos.add(new Livro("Petter Poul e o Prisioneio de Azkaban", new ArrayList<Author>(Arrays.asList(authors.get(1))), new ArrayList<String>(Arrays.asList("Pedrudo")), "28/07/2021", 3, editors.get(1), "93123124"));
        publicacaos.add(new Teses("Raios gammas puros", new ArrayList<Author>(Arrays.asList(authors.get(2))), new ArrayList<String>(Arrays.asList("Maria Curie")), "18/05/1998"));
    }

}
