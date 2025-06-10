package ex06_Arrays;

public class Max_Min_Number {
    public static void main(String[] args) {

        int[]array = {10,20,30,40,50,60,70,80,90,100};

         //max , min
        // 1 -> inputs - Array -> int
        int max_output  = give_max(array);
        int min_output = give_min(array);
        System.out.println(max_output);
        System.out.println(min_output);

    }
    static int give_max(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int give_min(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
