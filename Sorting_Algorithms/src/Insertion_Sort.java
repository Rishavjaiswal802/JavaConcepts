import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }
        ins_Sort(arr);
    }

    private static void ins_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j= i-1;
            for ( ; j >=0 ;j--) {
                if (arr[j]>temp){

                    arr[j+1]=arr[j];

                }
                else {
                    break;
                }
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
