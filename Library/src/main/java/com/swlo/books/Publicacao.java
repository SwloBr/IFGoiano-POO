package com.swlo.books;

import com.swlo.books.data.Author;
import com.swlo.books.data.Editor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public abstract class Publicacao{



    private final String title;
    private final ArrayList<Author> authorName;
    private ArrayList<String> references;
    private Boolean loaned = false;
    private Date realeseDate;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public abstract double value();


    public Publicacao(String title, ArrayList<Author> authorName, ArrayList<String> references, String realeseDate) {
        this.title = title;
        this.authorName = authorName;
        this.references = references;
        try {
            this.realeseDate = formatDate.parse(realeseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName(int i) {

        StringBuilder x = new StringBuilder();
        for (Author aut: authorName) {
            x.append(aut.getAuthorName()).append("/n");
        }
        return x.toString();
    }
    public void addAuthorName(Author author) {
        authorName.add(author);
    }


    public String getReferences() {

        StringBuilder x = new StringBuilder();
        for (String ref: references) {
            x.append(ref).append("/n");
        }
        return x.toString();
    }

    public Boolean getLoaned() {
        return this.loaned;
    }

    public void setLoaned(Boolean loaned) {
        this.loaned = loaned;
    }

    public String getRealeseDate() {
        return formatDate.format(realeseDate);
    }

}

