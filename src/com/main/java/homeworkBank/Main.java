package com.main.java.homeworkBank;

import com.main.java.homeworkBank.services.Credit;
import com.main.java.homeworkBank.services.Deposit;
import com.main.java.homeworkBank.services.Insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private final static int NUMBER_OF_SERVICES = 3;
    static List<Bank> banks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("I decided to know some info about banks: ");
        getBanks();
        addService();
        banks.stream().forEach(bank -> System.out.println("Bank "+ bank.getBankName()+ " has services " + bank.getServices()));
    }

    private static void getBanks(){
        banks.add(new Bank(BankName.PRIVAT));
        banks.add(new Bank(BankName.ALPHA));
        banks.add(new Bank(BankName.KBC));
        for (com.main.java.homeworkBank.Bank bank: banks) {
            System.out.print(bank.getBankName()+" ");
        }
    }

    private static void addService(){
        banks.stream().forEach(bank -> {
            int random = new Random().nextInt(NUMBER_OF_SERVICES)+1;
            switch (random){
                case 1: bank.addService(new Deposit(true, 12.5));
                case 2: bank.addService(new Credit(true, 500));
                case 3: bank.addService(new Insurance(true));

            }
        });
    }
}
