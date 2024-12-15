import java.util.Stack;

public class StackUsage {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(24);
        stack.add(45);
        stack.add(53);
        stack.add(234);
        stack.add(54324);
        stack.add(2344);
        System.out.println(stack);
        for (Object object : stack) {


            System.out.println(object);

        }
        stack.forEach(System.out::println);


    }
}