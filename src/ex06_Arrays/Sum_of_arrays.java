package ex06_Arrays;

public class Sum_of_arrays {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 86};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
       }
        System.out.println("-----");
        for (int n : numbers){
            sum = sum + n;

        }
        System.out.print(sum);
    }

}