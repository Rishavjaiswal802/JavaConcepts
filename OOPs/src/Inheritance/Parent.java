package Inheritance;

public class Parent {
String name;
public    void m1(){
    System.out.println("I am parent method");
}

}
class Child extends  Parent{
    public  void  m2(){
        System.out.println("this is child method");
    }


}
class Test{
    public static void main(String[] args) {
        Parent p1= new Parent();
        p1.m1();
        //p.m2();   ->  invalid

        Child c= new Child();
        c.m1();
        c.m2();

        Parent p2= new Child();
        p2.m1();
        //p2.m2();  -> invalid
        Child c1 = (Child) new Parent();
        c1.m1();
        c1.m2();
    }
    



}

