package com.swlo.books;

import com.swlo.books.data.Author;
import com.swlo.books.data.Editor;

import java.util.ArrayList;

public class Livro extends Publicacao{

    private int Edition;
    private Editor editor;
    private String iSBN;

    public Livro(String title, ArrayList<Author> authorName, ArrayList<String> references, String realeseDate, int edition, Editor editor, String iSBN) {
        super(title, authorName, references, realeseDate);
        Edition = edition;
        this.editor = editor;
        this.iSBN = iSBN;
    }

    public int getEdition() {
        return Edition;
    }

    public String getEditor() {
        return editor.getEditorName();
    }

    public String getiSBN() {
        return iSBN;
    }

    @Override
    public double value() {
        return 1;
    }
}
