package General;

public class AreaUsingOverloading {
    public static void main(String[] args) {

        System.out.println(area(2.3));
        System.out.println(area(2.3, 2.3));
        System.out.println(area(2.3f, 2.3f));
    }

    static double area(double radius) {
        return (3.14 * radius * radius);
    }

    static double area(double base, double height) {
        return (((double) 1 /2) * base * height);
    }

    static double area(float length, float width) {
        return ((double) length * width);
    }

}
