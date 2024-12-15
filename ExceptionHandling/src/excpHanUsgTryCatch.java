

public class excpHanUsgTryCatch {

    // without try catch block[abnormal termination ]

    //    public static void main(String[] args) {
//        System.out.println("stmt 1");
//        System.out.println(10/0);
//        System.out.println("stmt 3");
//    }


    //with try catch block[Normal Termination]


//               public static void main(String[] args) {
//                   System.out.println("stmt 1");
//                   try {
//                       System.out.println(10 / 0);
//                   } catch (ArithmeticException e) {
//                       System.out.println(10 / 2);
//                   }
//
//                   System.out.println("stmt 3");
//               }
//

//        public static void main(String[] args) {
//      try {
//
//
//        System.out.println("stmt 1");
//        System.out.println("Stmt 2");// when no exception [1 2 3 5] Normal Termination
//        System.out.println("stmt 3");
//    }catch (Exception e){
//          System.out.println("stmt 4");
//      }
//            System.out.println("stmt 5");
//        }
//
//
//public static void main(String[] args) {
//      try {
//
//
//        System.out.println("stmt 1");
//        System.out.println(10/0);// when  exception at 2 and corresponding catch block is found
//        System.out.println("stmt 3");// [1,4,5] Normal Termination
//    }catch (ArithmeticException e){
//          System.out.println("stmt 4");
//      }
//            System.out.println("stmt 5");
//        }
//
//
//       }

//    public static void main(String[] args) {
//        try {
//
//
//            System.out.println("stmt 1");
//            System.out.println(10/0);// when  exception at 2 and corresponding catch block is not found
//            System.out.println("stmt 3");// [1] Abnormal termination
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("stmt 4");
//        }
//        System.out.println("stmt 5");
//    }
//
//
//}


//    public static void main(String[] args) {
//        try {
//
//
//            System.out.println("stmt 1");
//            System.out.println(10/0);
//            System.out.println("stmt 3");// [1]
//        }catch (Exception e){
//            System.out.println(10/0);// when  exception at 4 Or 5 i.e., inside catch or final block
//        }
//        System.out.println("stmt 5");
//    }
//
//
//}


    //   Methods to print Exception Information  [3]

    //    public static void main(String[] args) {
//        try {
//            System.out.println(10/0);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println(e.toString()); //or just e
//
//            System.out.println(e.getMessage());
//        }
//        }
//    }
    public static void main(String[] args) {
int[] arr = new int[5];
        try {
    try {
        System.out.println(10/0);
    }catch (Exception e){
        System.out.println(e);
    }
}catch (Exception e){
            System.out.println("hello");
        }
    }


}