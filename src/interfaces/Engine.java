package interfaces;

public class Engine extends Normal  {


}


abstract class Normal implements Car{
    public void acc() {
        System.out.println("Hello, I am the method of abstract class");
    }

    public  void start() {}

    public  void stop() {}
}