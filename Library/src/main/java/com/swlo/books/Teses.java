package com.swlo.books;

import com.swlo.books.data.Author;
import com.swlo.books.data.Editor;

import java.util.ArrayList;
import java.util.Date;

public class Teses extends Publicacao {

    private int pagesNumber;
    private String summary;
    private Date defenseDate;
    private String institute;

    @Override
    public double value() {
        return 1.5;
    }

    public Teses(String title, ArrayList<Author> authorName, ArrayList<String> references, String realeseDate) {
        super(title, authorName, references, realeseDate);
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public String getSummary() {
        return summary;
    }

    public Date getDefenseDate() {
        return defenseDate;
    }

    public String getInstitute() {
        return institute;
    }

}
