 class Parent {
    public void property(){
        System.out.println("Land + Cash + Jewellery");
    }
    public void marriage(){
        System.out.println("ShubhaLaxmi");
    }
}
class Child extends Parent{
     //If the child is not satisfied withs the marriage method of parent hen it can override the method
    public void marriage(){
        System.out.println("Jasmine");
    }
public  void m1(){}
}

  public class MethodOverriding {
      public static void main(String[] args) {
          Child c = new Child();
          c.property();
          c.marriage();
          Parent p1 = new Parent();
          p1.marriage();
          p1.property();
          Parent p2 = new Child();
          p2.marriage();


      }
  }

