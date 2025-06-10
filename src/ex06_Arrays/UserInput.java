package ex06_Arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size in integer number");
        int size = (int) scanner.nextFloat();

         float[]names = new float[size];


        for (int i = 0; i <names.length; i++) {
            System.out.println("Enter the number");
            names[i] = scanner.nextFloat();


        }
        System.out.println(" ----- ");

        for (int i = 0; i <names.length;  i++) {
            System.out.println(names[i]);

        }
    }
}
