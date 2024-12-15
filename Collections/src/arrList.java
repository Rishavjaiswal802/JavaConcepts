
//import package for ArrayList
import java.util.*;
public class arrList {
    public static void main(String args[]){
        int temp = 0;
        //create object of ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //add numbers in an ArrayList
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(8);
        //sort numbers in an ArrayList
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //return second highest number from sorted ArrayList
        temp=arrayList.get(arrayList.size()-1);
        System.out.println("Second highest number");
        System.out.println(temp);
    }
}