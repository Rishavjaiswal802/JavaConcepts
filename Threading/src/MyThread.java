public class MyThread extends Thread {
    int total= 0;

    public void run(){

        synchronized(this){
            System.out.println("Child Thread start calculation");
        for (int i = 0; i < 10; i++) {
            total+=i;
        }
        System.out.println("child thread giving notificatin call");
        this.notify();

    }
    }
    
}
