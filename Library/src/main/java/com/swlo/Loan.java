package com.swlo;

import com.swlo.books.Publicacao;
import com.swlo.users.User;

import java.util.Date;

public class Loan {

    private int renovations = 0;

    private Publicacao publicacao;
    private final User user;
    private final Date loanDate;
    private String devolutionDay;


    public Loan(Publicacao publicacao, User user, Date loanDate) {
        this.publicacao = publicacao;
        this.user = user;
        this.loanDate = loanDate;
    }


}
