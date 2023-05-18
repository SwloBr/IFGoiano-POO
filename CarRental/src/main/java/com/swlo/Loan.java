package com.swlo;

import com.swlo.client.Client;
import com.swlo.client.LegalEntity;
import com.swlo.client.PhisicalPerson;
import com.swlo.vehicle.Car;

import java.time.LocalDate;
import java.time.Period;

public class Loan {

    private final LocalDate loanDate;
    private Car car;
    private Client client;
    private LocalDate estimativeSubmissionDate;
    private LocalDate submissionDate;
    private boolean finished;
    private int renovations;

    private double penalty = car.penaltyValue();

    public Loan(Car car, Client client) {
        if ((client instanceof LegalEntity) || (client instanceof PhisicalPerson) && client.getActiveLoans() == 0) {
            if (car.isAvailable()) {
                this.car = car;
                this.client = client;
                loanDate = LocalDate.now();
                estimativeSubmissionDate = loanDate.plus(Period.ofDays(7));
                finished = false;
                renovations = 0;
                Locadora.addLoaned(car);
                car.setAvailable(false);
            } else {
                throw new RuntimeException("Car is not available");
            }
        } else {
            throw new RuntimeException("Max loans reached");
        }
    }

    public void renewLoan() {
        estimativeSubmissionDate = estimativeSubmissionDate.plus(Period.ofDays(7));
        renovations++;
    }

    public void returnLoan() {
        Locadora.removeLoaned(car);
        submissionDate = LocalDate.now();
    }

    public double getPenalty() {
        if (renovations > car.maxRenovation()) {
            return (renovations - car.maxRenovation()) * car.penaltyValue();

        } else {
            return 0;
        }
    }

    public double totalValue() {
        return getPenalty() + car.getValue();
    }


    public LocalDate getLoanDate() {
        return loanDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getEstimativeSubmissionDate() {
        return estimativeSubmissionDate;
    }

    public void setEstimativeSubmissionDate(LocalDate estimativeSubmissionDate) {
        this.estimativeSubmissionDate = estimativeSubmissionDate;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getRenovations() {
        return renovations;
    }

    public void setRenovations(int renovations) {
        this.renovations = renovations;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }
}
