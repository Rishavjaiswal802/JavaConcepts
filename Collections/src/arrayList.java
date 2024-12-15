import java.util.*;
public class arrayList {
    public static void main(String[] args) {
ArrayList<Integer> al = new ArrayList<>(5);
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements ");
        for (int i = 0; i <5 ; i++) {
     int s = sc.nextInt();
            al.add(s);
        }
        for (int i:al) {
            System.out.println(i);
        }
        System.out.println(al);

        Iterator<Integer> itr = al.iterator();


        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        al.forEach(e->{
            System.out.println(e);
        });


    }


}
