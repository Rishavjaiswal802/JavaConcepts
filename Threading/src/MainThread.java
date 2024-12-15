public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        synchronized(thread){
            System.out.println("Main Thread calling wait method");
            thread.wait();
            System.out.println("Main thread got notification");
        }
        System.out.println(thread.total);
    }
}


