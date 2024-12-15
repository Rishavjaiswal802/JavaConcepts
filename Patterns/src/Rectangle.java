import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the no of rows and columns");
        Scanner sc= new Scanner(System.in);
         int row = sc.nextInt();
         int col= sc.nextInt();
         for (int i =0; i<row ; i++){
             for (int j = 0; j < col; j++) {
                 System.out.print(" * ");
             }
             System.out.println();
         }
    }
}
