public class GettersAndSettersWithAccessSpecifiers {
    public static void main(String[] args) {
        Employee e1 = new Employee("jay", 24);
        Employee e2 = new Employee("sharan", 22);
        System.out.println(e1.isPerson);
        System.out.println(e2.isPerson);
        System.out.println(Employee.isPerson);

        e1.toEat();
        e2.toEat();
        Employee.toEat();

        System.out.println(Math.PI);
        System.out.println(Math.max(5, 6));
    }
}

class Employee {
    private String name;
    private int age;

    static boolean isPerson = true;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toRead() {
        System.out.println(name + " is reading");
    }
    public void toWrite() {
        System.out.println(name + " is writing");
    }

    static void toEat() {
        System.out.println("eating");
    }
}