package ex06_Arrays;

import java.util.Arrays;

public class Second_Largest_number {
    public static void main(String[] args) {

        int[]numbers = {43 , 65 , 87 , 54 , 32 , 89};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }

}
