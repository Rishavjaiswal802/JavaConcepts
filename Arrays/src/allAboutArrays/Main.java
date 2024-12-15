package allAboutArrays;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        List<Integer> list = List.of(32, 234, 32423, 4245, 324);
//        List<Integer> list1 = Arrays.asList(23, 345, 34234, 3213, 535, 3);
//
//
//        Stream<Integer> stream = list.stream();
//        List<Integer> collect = stream.filter(i -> i > 234 ).collect(Collectors.toList());
//        System.out.printf(collect.toString());


        //mainly used for the collections and group of objects
        Stream<Object> stream = Stream.empty();


//        String string [] = {"Durgesh","Rishav", "Ankit"};
//
//        Stream<String> stringStream = Stream.of(string);
//        stringStream.forEach(i->{
//            System.out.printf("i");
//        });

        List<Integer> list1 = List.of(23, 434, 335, 54, 66);
        list1
                .stream()
                .forEach(System.out::print);

        //filter(predicate) here predicate means boolean type , true or false based on which it will filter out the results


//        List<String> stringList = List.of("Rishav", "Ankit", "Shreyash", "Vineet");
//        List<String> collect = stringList.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
//        System.out.println(collect);

        //map(function){body  //eg. square} it means it will take the values of the function and perform the operations defined in the method body
        //each value pe operation hoga
        List<Integer> list = List.of(2, 4, 5, 67, 8, 7);

        List<Integer> collect1 = list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> stringList = List.of("Rishav", "Ankit", "Shreyash", "Vineet");
        List<String> collected = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collected);



    }
}