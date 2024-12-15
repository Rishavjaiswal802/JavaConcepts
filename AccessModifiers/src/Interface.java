interface  A{
    void m1();
    void m2();

}
public class Interface implements A {
    public void m1(){
        System.out.println("m1");
    }


    public void m2() {
        System.out.println("m2");
    }
}
// A class can extend only one class at a time.
// An interface can extend any no of interface at a time.
// A class can implement any no of interface at a time.
// An interface only extends not implements.

