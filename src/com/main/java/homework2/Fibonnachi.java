package com.main.java.homework2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonnachi {
    public static BigInteger previous = BigInteger.valueOf(1);
    public static BigInteger current = BigInteger.valueOf(1);
    public static ArrayList<BigInteger> arrayList = new ArrayList<>();

    public static final Integer INDEX = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter a count of numbers you want to see");
                Integer count = scanner.nextInt();
                if (count >= 1) {
                    arrayList.add(previous);
                    countFibonnachi(previous, current, count);
                    System.out.println(arrayList);
                    scanner.close();
                } else {
                    System.out.println("Enter number more then 1");
                    scanner.close();
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Not a number");
                scanner.close();
            }
            getNumberByIndex(INDEX);

    }

    private static void countFibonnachi(BigInteger previous, BigInteger  current, Integer count){
        if (arrayList.size() == count)  return;
            arrayList.add(current);
            countFibonnachi(current, previous.add(current), count);
    }

    private static BigInteger getNumberByIndex(Integer INDEX){
        BigInteger numberByIndex = null;
        try {
            numberByIndex = arrayList.get(INDEX);
            System.out.printf("Number at index %d is %d", INDEX, numberByIndex);
        } catch (Exception e) {
            System.out.println("Invalid input. Not a number");
        }
        return numberByIndex;
    }
}
