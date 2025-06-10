package ex06_Arrays;

import java.util.Arrays;

public class Lab14_Array01 {
    public static void main(String[] args) {
        int a = 55;
        int[] arr = {5,13 , 34 , 25 , 54 , 87};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);


        }
        Arrays.sort(arr);
    }
}

