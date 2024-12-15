public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (NullPointerException | IndexOutOfBoundsException|ClassCastException| ArithmeticException e){
            System.out.println(e);
        }
    }
}
