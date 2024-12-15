package allAboutThreads;

public class DefThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread"+i);
        }
    }
}
//Note: The execution of the threads are handled by the thread scheduler but the result are not always same as it differs from jvm to jvm about the type of the algo it is using.
//Choose multithreading only when there are various process independent to each other.
 class ThreadMain {
    public static void main(String[] args) {
        DefThread thread = new DefThread();//instantiation  of thread
        thread.start();                     //starting the thread// ye internally call krta hai run() method.
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread"+i);
        }
    }
}
