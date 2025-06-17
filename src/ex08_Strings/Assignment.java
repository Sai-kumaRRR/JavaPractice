package ex08_Strings;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        //please do this assignment program
        //CLI Option
        // Take user input - Name , and salary and print them in the end.
        Scanner sc = new Scanner(System.in);

        //prompt the user for their name
        System.out.println("Enter your name");

        Scanner scanner = null;
        String name = scanner.nextLine();
        System.out.println("age");
        int age = scanner.nextInt();

        //prompt the user for their salary
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        //print the collected information
        System.out.println("\n-----user information ----");
        System.out.println("Name: " + name);
        System.out.println("age" + age);
        System.out.println("salary "+ salary);

        // close the scanner
        scanner.close();





    }
}
