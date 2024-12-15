package allAboutArrays;

public class ArrayToFunc {
    public static void printArray(int[] arr){
        for (int i:arr) {
            System.out.print(i);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }
    }

    public static void main(String[] args) {
        int[] arr= new int [9];
        ArrayToFunc.printArray(arr);
    }
}
