package arrayQuestions;

import java.util.Arrays;

public class SecLarElement {
    public static void main(String[] args) {
        int[] arr = {23,4,67,453,354,4564};
        int[] result = secondLargestElement(arr,6);
        System.out.println(Arrays.toString(result));

    }
    public static int [] secondLargestElement(int[] arr,int size){
        if (size == 0|| size==1) {
            System.out.println("-1");
        }
        int smallest = Integer.MAX_VALUE;
        int secSmall= Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i]>largest){
                largest= arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i]<smallest){
                smallest= arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i]>secLar && arr[i] !=largest){
                secLar=arr[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i]<secSmall && arr[i] !=smallest){
                secSmall=arr[i];
            }
        }
        return new int[]{secLar, secSmall};


    }
}
