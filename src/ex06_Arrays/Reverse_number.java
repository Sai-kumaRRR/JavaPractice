package ex06_Arrays;

public class Reverse_number {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");




        }
        System.out.println("----------");


        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }


    }


}
