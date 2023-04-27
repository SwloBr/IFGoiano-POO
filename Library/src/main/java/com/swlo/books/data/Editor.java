package com.swlo.books.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Editor {
    private String editorName;
    private Date foundationDate;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

    public Editor(String editorName, String foundationDate) {
        this.editorName = editorName;
        try {
            this.foundationDate = formatDate.parse(foundationDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getEditorName() {
        return editorName;
    }

    public String getFoundationDate() {
        return formatDate.format(foundationDate);
    }
}

