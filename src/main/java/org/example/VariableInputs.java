package org.example;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();

        System.out.println("Enter an integer:");
        int num = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double:");
        double num2 =  Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean value:");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your sting is " + text);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + num2);
        System.out.println("Your bool is " + bool);

    }
}
