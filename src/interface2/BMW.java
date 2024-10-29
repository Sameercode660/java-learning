package interface2;

public class BMW  implements  Car1, Car2{

    @Override
    public void accelerate() {
        System.out.println("I am accelerator method");
    }

    @Override
    public void brake() {
        System.out.println("I am brake method");
    }

    @Override
    public void engine() {
        System.out.println("I am engine method");
    }

    @Override
    public void start() {
        System.out.println("I am start method");
    }

    @Override
    public void stop() {
        System.out.println("I am stop method");
    }

    @Override
    public void wheels() {
        System.out.println("I am wheels method");
    }
}
