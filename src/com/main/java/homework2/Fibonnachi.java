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
            findParityVsOddness();
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
            System.out.printf("Number at index %d is %d \n", INDEX, numberByIndex);
        } catch (Exception e) {
            System.out.println("Invalid input. Not a number\n");
        }
        return numberByIndex;
    }

    private static void findParityVsOddness() {
        int countParity = 0;
        int countOddness = 0;


        for (int i = 0; i < arrayList.size(); i++) {
            BigInteger[] divideAndRemainder = arrayList.get(i).divideAndRemainder(BigInteger.valueOf(2));
            if(divideAndRemainder[1].equals(BigInteger.valueOf(0))){
                countParity++;
            }else {
                countOddness++;
            }
        }
        System.out.println("Parity " + countParity*100.f/arrayList.size()+" %");
        System.out.println("Oddness " + countOddness*100.f/arrayList.size()+ " %");

    }
}
