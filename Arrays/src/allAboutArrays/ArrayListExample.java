package allAboutArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(20);
//        list.add(21);
//        list.add(2223);
//        list.remove(2);
//        list.set(1,88);


        //Taking Input
        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));
        }


        System.out.println(list);


    }
}
