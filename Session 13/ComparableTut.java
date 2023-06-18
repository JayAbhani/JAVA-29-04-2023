import java.util.*;

public class ComparableTut {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("jay", 5, 24));
        students.add(new Student("neha", 23, 20));
        students.add(new Student("rohan", 15, 23));

        System.out.println("before sorting");
        for(Student s: students) {
            System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getAge());
        }

        Collections.sort(students);

        System.out.println("after sorting");
        for(Student s: students) {
            System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getAge());
        }


    }
}

class Student implements Comparable<Student>{

    String name;
    int rollNo;
    int age;

    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getRollNo() {
        return this.rollNo;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Student other) {
        // return Integer.compare(this.getAge(), other.getAge());

        if(this.getAge() < other.getAge()) {
            return 1;
        } else if(this.getAge() > other.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

}
