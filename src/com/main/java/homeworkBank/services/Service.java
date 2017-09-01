package com.main.java.homeworkBank.services;

public abstract class Service {
    private String name;
    private Boolean enabledPretermRepayment;


    public Service(String name, Boolean enabledPretermRepayment) {

        this.name = name;
        this.enabledPretermRepayment = enabledPretermRepayment;
    }


    public String getName() {
        return name;
    }


    public Boolean ifEnabledPretermRepayment() {
        return enabledPretermRepayment;
    }

    public void enablePretermRepayment(Boolean enabledPretermRepayment) {
        this.enabledPretermRepayment = enabledPretermRepayment;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", enabledPretermRepayment=" + enabledPretermRepayment +
                '}';
    }
}
