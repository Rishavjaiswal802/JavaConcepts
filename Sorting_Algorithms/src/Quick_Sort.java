import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr , int low, int high){
        if(low<high){
            int partIndex= partition(arr, low, high);
            quickSort(arr, low, partIndex-1);
            quickSort(arr,partIndex+1,high);
        }

    }

    private  static int partition(int[] arr, int low, int high) {
        int i= low ;
        int j= high;
        int pivot= arr[low];
        while (i<j)
        {
            while (arr[i] <= pivot && i<=high-1)
            {
                i++;
            }
            while (arr[j] > pivot && j>=low + 1){
                j--;
            }
            if (i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j] = temp;
        return j;
    }
}