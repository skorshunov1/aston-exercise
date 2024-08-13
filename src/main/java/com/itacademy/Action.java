package com.itacademy;

import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter an integer a: ");
        int a = scanner.nextInt();
        System.out.println("Please, enter an integer b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;


        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
    }

}

