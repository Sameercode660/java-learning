//Create a class Teacher (Tid, Tname, Designation, Salary, Subject). Write
//a java program to accept 'n' teachers and display who teach Java subject
//        (Use Array of object)


package ExamPrep;

import java.util.Scanner;

public class ArrayOfObject {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        Teacher[] teacher = new Teacher[num];

        for(int i = 0; i < num; i++) {
            int id;
            String name;
            String designation;
            double salalry;
            String subject;

            System.out.println("Enter the id: ");
            id = input.nextInt();


        }
    }
}

class Teacher {
    private int Tid;
    private String Tname;
    private String Designation;
    private double salary;
    private String Subject;

    Teacher(int Tid, String Tname, String Designation, double salary, String Subject) {
        this.Tid = Tid;
        this.Tname = Tname;
        this.Designation = Designation;
        this.salary = salary;
        this.Subject = Subject;
    }

    void display() {
        System.out.println("Name: " + this.Tname);
        System.out.println("Designation: " + this.Designation);
        System.out.println("Salary: " + this.salary);
        System.out.println("Subject " + this.Subject);
    }
}