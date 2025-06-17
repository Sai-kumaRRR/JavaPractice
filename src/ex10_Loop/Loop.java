package ex10_Loop;

public class Loop {
    public static void main(String[] args) {
        // This is a comment explaining the purpose of the following code
        // This code will print the numbers from 1 to 10 using a for loop

        // for (initialization; condition; increment/decrement) {
        //     // code to be executed
        // }

        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Loop to print numbers from 10 to 1 in reverse order
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Loop to print even numbers from 0 to 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // Loop to print odd numbers from 1 to 10
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}
