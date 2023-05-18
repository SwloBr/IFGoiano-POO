package com.swlo;


import java.time.LocalDate;
import java.util.Objects;

public class UpdateThread extends Thread{
    public void run() {
        try {

            for (Loan loan : Locadora.getLoansList()) {
                if(Objects.equals(loan.getEstimativeSubmissionDate(), LocalDate.now())) {
                    loan.renewLoan();

                }
            }


            Thread.sleep(24*60*60*1000L);

        } catch (InterruptedException e) {
            return;
        }
    }
}
