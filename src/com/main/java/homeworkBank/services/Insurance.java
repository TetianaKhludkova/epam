package com.main.java.homeworkBank.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Insurance extends Service{
    private String subjectOfInsurance;

    public Insurance(Boolean enabledPretermRepayment) {
        super("Insurance", enabledPretermRepayment);
        this.enablePretermRepayment(enabledPretermRepayment);
        this.setSubjectOfInsurance();
    }


    public String getSubjectOfInsurance() {
        return subjectOfInsurance;
    }

    public void setSubjectOfInsurance() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Life");
        subjects.add("Car");
        subjects.add("House");
        subjects.add("Travel");

        int random = new Random().nextInt(subjects.size());
        switch (random){
            case 0: this.subjectOfInsurance = subjects.get(0);
            case 1: this.subjectOfInsurance = subjects.get(1);
            case 2: this.subjectOfInsurance = subjects.get(2);
            case 3: this.subjectOfInsurance = subjects.get(3);

        }
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "subjectOfInsurance='" + subjectOfInsurance + '\'' +
                '}';
    }
}
