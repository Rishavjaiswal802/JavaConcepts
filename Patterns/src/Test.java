import java.util.Scanner;

class Pattern{
    public void print(int rows, int col){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=col ; j++) {
                if (j==1 || j==col) {
                    System.out.print("*");
                } else if (i==1 || i==rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        void pyramid(int n){

        int z=1;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n ; j++) {
                    System.out.print(z);
                    z++;
                }
                System.out.println();

            }

                }

}



public class Test {
    public static void main(String[] args) {


        Pattern ptr = new Pattern();

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of rows");
//        int rows = sc.nextInt();
//        System.out.println("Enter the no of column");
//        int col = sc.nextInt();

//        ptr.print(rows, col);
        int n = sc.nextInt();
        ptr.pyramid(n);

    }
}
