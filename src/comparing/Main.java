package comparing;

public class Main {
    public static void main(String[] args) {

        Student Sameer = new Student(12, 80.98f);
        Student Amit = new Student(13, 91.88f);

        if(Sameer.compareTo(Amit) < 0) {
            System.out.println(Sameer.compareTo(Amit));
            System.out.println("Sameer has less marks than Amit");
        }
    }
}
