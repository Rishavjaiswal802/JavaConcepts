//public class usingThrowKeyword {
//    public static void main(String[] args) {
//       throw  new ArithmeticException("/ by zero");
////           |-----------------------------------| create san exception object  throw keyword hand it overs to the JVM manually
//
//    }
//}

class Test extends Throwable {
    Test(String s) {
        super(s);
        System.out.println("Hello There !!!");
    }
}
    class Implement {
        public static void main(String[] args) throws Test
        {
            try {
                throw new Test("This is user defined exception");
            } catch (Test t) {

                System.out.println(t.toString());
            }
        }
    }
