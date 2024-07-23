package org.example;

import java.util.Scanner;

public class Greeting {
        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
            //Prompt the user for their name
            System.out.println("What your name? ");
            //Read the users input
            String name = scanner.nextLine();
            //Print a greeting message using the users name
            System.out.println("Hi " + name + "!");
        }
}
