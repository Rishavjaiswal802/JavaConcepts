public class CopyConstructor {
    public static void main(String[] args) {
        p p1= new p("Rishav",18);
        p p2=new p(p1);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}
class p{
    String name= "Rishav";
    int age=20;
p(String name,int age){
    this.name=name;
    this.age=age;
}
p(p obj){
    name= obj.name;
    age= obj.age;
}
}

