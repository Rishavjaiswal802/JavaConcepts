package Interface;

public class Car implements Engine,Brake{
    @Override
    public void brake() {
        System.out.println("This brakes like a normal car");
    }

    @Override
    public void start() {
        System.out.println("This starts like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("This stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("This accelerate like a normal car");
    }
}
