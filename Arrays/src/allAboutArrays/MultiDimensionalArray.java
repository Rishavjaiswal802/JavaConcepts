package allAboutArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {


    public static void getArr(int [][]arr ) {
        //System.out.println(Arrays.toString(arr));
        for (int [] a:arr
             ) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static  void setArr(int [][]arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }

        }
    }
    public static void main(String[] args) {

        int [][] arr = new int[3][3];
        setArr(arr);
        getArr(arr);

    }
}
