import allAboutThreads.DefThread;

public class Main {
    public static void main(String[] args) {
        DefThread thread = new DefThread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread"+i);

        }

        int sum= 0;
        for (int i = 0; i < 10; i++) {
            sum+=sum+i;

        }
    }
}