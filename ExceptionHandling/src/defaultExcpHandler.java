//Example 1:
public class defaultExcpHandler {
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();

    }
//In the whole program no handling code is present so the exception will be handled by Default Exception handler that  comes under JVM
    public static void doMoreStuff(){
        System.out.println(10/0);
    }
}


//Example 2:
//public class defaultExcpHandler {
//    public static void main(String[] args) {
//        doStuff();
//    }
//    public static void doStuff(){
//        doMoreStuff();
//        System.out.println(10/0);   here , after coming back from the doMoreStuff() Exception occurs , it will be handled by DEH
//    }
//    //In the whole program no handling code is present so the exception will be handled by Default Exception handler that  comes under JVM
//    public static void doMoreStuff(){
//         System.out.println("Hello");
//    }
//}