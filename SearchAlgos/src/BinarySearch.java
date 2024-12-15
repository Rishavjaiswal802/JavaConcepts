import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }

        System.out.println("Please Enter the key to be searched for:");
        int key= sc.nextInt();
        int result =binarySearch(arr,arr.length, key);
        System.out.println(result);
    }
   public static int binarySearch(int[] arr,int size, int key) {
       int start = 0;
       int end = size - 1;
       int mid = start + (end - start) / 2;
       while (start <= end) {
           if (arr[mid] == key) {
               return mid;
           }
           if (key > arr[mid]) {
               start = mid + 1;
           }
           if (key <arr[mid]) {
               end = mid - 1;
           }
           mid = start + (end - start) / 2;
       }
       return -1;
   }


}
