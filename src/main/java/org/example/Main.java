package org.example;

import java.awt.*;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        int intValue1 = 74;
        int intValue2 = 36;
        int result1 = intValue1 + intValue2;
        System.out.println(result1);

        System.out.println("Task #2");
        int intValue3 = -5;
        int intValue4 = 8;
        int intValue5 = 6;
        int result2 = intValue3 + intValue4 * intValue5;
        System.out.println(result2);
        int intValue6 = 55;
        int intValue7 = 9;
        int result3 = (intValue6 + intValue7) % intValue7;
        System.out.println(result3);
        int intValue8 = 20;
        int intValue9 = -3;
        int intValue10 = 5;
        int result4 = intValue8 + intValue9 * intValue10 / intValue4;
        System.out.println(result4);
        int intValue11 = 15;
        int intValue12 = 3;
        int intValue13 = 2;
        int result5 = intValue10 + intValue11 / intValue12 * intValue13 - intValue4 % intValue12;
        System.out.println(result5);

        System.out.println("Task #3");
        int num1 = 125;
        int num2 = 24;
        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));

        System.out.println("Task #4");
        int[] arr = new int[]{5, 6, 7, 12, -5, 32, 43};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        System.out.println("Task #5");
        int[] my_array = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j]) && (i != j)) {
                    System.out.println(+my_array[j]);
                }
            }
        }
    }
}


