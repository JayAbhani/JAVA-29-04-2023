public class InheritanceTut {
    public static void main(String[] args) {
        Student s1 = new Student("jay", 24, 58);
        String name = s1.getName();
        int age = s1.getAge();
        int rollNo = s1.getRollNo();

        System.out.println(name + " " + age + " " + rollNo);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toEat() {
        System.out.println(name + " is eating");
    }

    public void toWalk() {
        System.out.println(name + " is walking");
    }
}


class Student extends Person {
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void toStudy() {
        System.out.println("I am studying");
    }
}
