public class Main {
//String name;
//int roll;
//Main(String name, int roll){
//    this.name=name;
//    this.roll=roll;
//}

    public static void main(String[] args) {
//        Main name1 = new Main("Rishav",01);
//        Main name2 = new Main("Jaiswal",02);
//        Main name3 = new Main("Rishav",01);
//        Main name4 = name1;// = =
//        System.out.println(name1.equals(name2));  //f
//        System.out.println(name1.equals(name3));  //t
//        System.out.println(name1.equals(name4));  //tttt  t


//        String s1 = new String("Rishav");
//        String s2 = new String("Rishav");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
//        String s1= "Rishav";
//        String s2 = "Rishav";
//
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);

        // .equals() (for objects)  method checks only the reference type not the content of the object .
        // it returns true only if the reference is pointing to the same object irrespective of the content
        // it returns false even if two objects have the same content or data.

        //.equals method in String class is meant for content comparison

//        String s = new String("Risahv");
//        System.out.println(s.hashCode());
//        s.concat(" Jaiswal");
//        System.out.println(s.hashCode());
//        System.out.println(s);

//        StringBuffer sb = new StringBuffer("Rishav ");
//        System.out.println(sb.hashCode());
//        sb=sb.append("Jaiswal");
//        System.out.println(sb.hashCode());

        String s1 = "Rishav";
        System.out.println(s1.hashCode());
        String s2=s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(s1.hashCode());
        final String s= "Rose";
        System.out.println(s.concat("Bud"));


}
}