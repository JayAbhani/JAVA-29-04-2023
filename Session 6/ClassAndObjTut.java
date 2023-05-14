public class ClassAndObjTut {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.name = "jay";
        p1.age = 24;
        p1.contact = "8879266812";
        System.out.println(p1.name + " " + p1.age + " "  + p1.contact);
        p1.toEat();
        p1.toRead();

        p2.name = "sharan";
        p2.age = 22;
        p2.contact = "123456789";
        System.out.println(p2.name + " " + p2.age + " "  + p2.contact);
        p2.toEat();
        p2.toRead();


    }
}


class Person {
    String name;
    int age;
    String contact;

    void toEat() {
        System.out.println(name + " can eat");
    }

    void toRead() {
        System.out.println(name + " can read");
    }
}


