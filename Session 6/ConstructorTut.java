public class ConstructorTut {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        System.out.println(s1.name);    //null
//        System.out.println(s1.age);     //18
//        System.out.println(s1.rollNo);  //0
//
//        Student s2 = new Student();
//        System.out.println(s2.age);
//        Student s3 = new Student();
//        System.out.println(s3.age);



        Student s1 = new Student("jay", 24, 99);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);

        Student s2 = new Student();
        s2.name = "sharan";
        s2.age = 21;
        s2.rollNo = 87;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNo);
    }
}

class Student {
    String name;
    int age;
    int rollNo;

    public Student() {
        name = null;
        age = 0;
        rollNo = 0;
    }

    public Student(String objName, int objAge, int objRollNo) {
        name = objName;
        age = objAge;
        rollNo = objRollNo;
    }



    void toWrite() {
        System.out.println(name + " is writing");
    }

    void toRead() {
        System.out.println(name + " is reading");
    }

    void toStudy() {
        System.out.println(name + " is studying");
    }
}