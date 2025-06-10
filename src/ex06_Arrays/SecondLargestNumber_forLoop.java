package ex06_Arrays;

import java.util.Arrays;

public class SecondLargestNumber_forLoop {
    public static void main(String[] args) {
        int[]numbers = {12, 34, 56, 86};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
