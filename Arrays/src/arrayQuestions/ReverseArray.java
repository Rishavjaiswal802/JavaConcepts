package arrayQuestions;
import  java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int []arr ={123,142,54,5645,76,455};
        reverseArr(arr);
    }

    static void reverseArr(int []arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
