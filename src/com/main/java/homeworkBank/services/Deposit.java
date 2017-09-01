package com.main.java.homeworkBank.services;

public class Deposit extends Service{
    private double rate;

    public Deposit(Boolean enabledPretermRepayment, double rate) {
        super("Deposit", enabledPretermRepayment);
        this.enablePretermRepayment(enabledPretermRepayment);
        this.setRate(rate);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
