package com.main.java.homework2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonnachi {
    public static BigInteger previous = BigInteger.valueOf(1);
    public static BigInteger current = BigInteger.valueOf(1);
    public static ArrayList<BigInteger> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter a count of numbers you want to see");
                Integer count = scanner.nextInt();
                if (count >= 1) {
                    arrayList.add(previous);
                    countFibonnachi(previous, current, count);
                    System.out.println(arrayList);
                } else {
                    System.out.println("Enter number more then 1");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Not a number");
            }
    }

    private static void countFibonnachi(BigInteger previous, BigInteger  current, Integer count){
        if (arrayList.size() == count)  return;
            arrayList.add(current);
            countFibonnachi(current, previous.add(current), count);
    }
}
