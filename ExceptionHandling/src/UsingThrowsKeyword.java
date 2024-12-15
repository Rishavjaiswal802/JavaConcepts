import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UsingThrowsKeyword {

}

//class Test{
//    public static void main(String[] args) {
//        PrintWriter w = new PrintWriter("abc.txt");
//        w.println("hello");
//
//    }
//}

                //The above code throws FileNotFoundException
                //There Are two ways to handle this exception;
 //               1> Try Catch block
//                2) Using Throws keyword

//                   using Try catch block

//class Test{
//    public static void main(String[] args) {
//        try {
//            PrintWriter w = new PrintWriter("abc.txt");
//            w.println("hello");
//
//        }catch (FileNotFoundException e){
//
//        }
//
//    }
//}