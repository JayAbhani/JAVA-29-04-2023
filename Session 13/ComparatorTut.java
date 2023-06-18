import java.util.*;

public class ComparatorTut {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("jay", 5, 24));
        students.add(new Student("neha", 23, 20));
        students.add(new Student("rohan", 15, 23));

        System.out.println("before sorting");
        for(Student s: students) {
            System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getAge());
        }

        AgeComparator ageComparator = new AgeComparator();
        RollNoComparator rollNoComparator = new RollNoComparator();
        Collections.sort(students, rollNoComparator);

        System.out.println("after sorting");
        for(Student s: students) {
            System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getAge());
        }
    }
}


class Student{

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
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getRollNo(), o2.getRollNo());
    }
}

