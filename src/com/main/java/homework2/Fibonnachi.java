package com.main.java.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonnachi {
    public static Integer POSITION =1;
    public static ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter a count of numbers you want to see");
                Integer count = scanner.nextInt();
                if (count >= 1) {
                    arrayList.add(POSITION);
                    countFibonnachi(POSITION, count);
                    System.out.println(arrayList);
                } else {
                    System.out.println("Enter number more then 1");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Not a number");
            }
    }

    private static void countFibonnachi(Integer POSITION, Integer count){
        if (arrayList.size() == count)  return;
            arrayList.add(POSITION);
            countFibonnachi(POSITION+2, count);
    }


}
