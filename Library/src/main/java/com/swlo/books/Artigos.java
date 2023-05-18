package com.swlo.books;

import com.swlo.books.data.Author;
import com.swlo.books.data.Editor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;



public class Artigos extends Publicacao{

    private String summary;



    public Artigos(String title, ArrayList<Author> authorName, ArrayList<String> references, String realeseDate, String summary) {
        super(title, authorName, references, realeseDate);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    @Override
    public double value() {
        return 0.5;
    }

    @Override
    public String getAuthorName(int i) {
        return super.getAuthorName(i);
    }
}
