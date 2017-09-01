package com.main.java.homeworkBank.services;

public class Credit extends Service{

    private int creditLine;

    public Credit(Boolean enabledPretermRepayment, int creditLine) {
        super("Credit", enabledPretermRepayment);
        this.enablePretermRepayment(enabledPretermRepayment);
        this.setCreditLine(creditLine);
    }


    public int getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(int creditLine) {
        this.creditLine = creditLine;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creditLine=" + creditLine +
                '}';
    }
}
