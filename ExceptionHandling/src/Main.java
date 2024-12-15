
class  parent {
    parent(){
        System.out.println("parent obj");
    }
    public static void m1(){
        System.out.println("m1");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("child Cons");
    }
    public static void m2() {
        System.out.println("m2");
    }
}
class subchild extends child{
    public static void m3() {
        System.out.println("m3");
    }
}
public class Main {
    public static void main(String[] args)  {
        subchild s =new subchild();

    }
}