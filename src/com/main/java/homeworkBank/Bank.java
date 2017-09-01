package com.main.java.homeworkBank;

import com.main.java.homeworkBank.services.Service;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private BankName bankName;
    private List<Service> services = new ArrayList<>();

    public List<Service> getServices() {
        return services;
    }

    public Bank(BankName bankName) {
        this.bankName = bankName;
    }

    public void addService(Service service) {
        services.add(service);
    }

    public String getBankName() {
        return bankName.toString();
    }
}
