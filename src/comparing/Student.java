package comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public int compareTo(Student o) {
        int result = (int)(this.marks - o.marks);
        return result;
    }
}
