package com.swlo.books.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Author {

    private final String authorName;
    private Date bornDate;
    private Date deathDate = null;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");




    public Author(String authorName, String bornDate, String deathDate) {
        this.authorName = authorName;
        try {
            this.bornDate = formatDate.parse(bornDate);
            this.deathDate = formatDate.parse(deathDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public Author(String authorName, String bornDate) {
        this.authorName = authorName;
        try {
            this.bornDate = formatDate.parse(bornDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBornDate() {
        return formatDate.format(bornDate);
    }

    public String getDeathDate() {
        return formatDate.format(deathDate);
    }
}
