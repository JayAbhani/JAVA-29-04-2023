public class AbstractionTut {
    public static void main(String[] args) {

    }
}

//abstract class Shape {
//    void m1() {
//        System.out.println("shaping m1");
//    }
//
//    abstract void toDraw();
//}
//
//class Circle extends Shape {
//    @Override
//    void toDraw() {
//        System.out.println("drawing a circle");
//    }
//}


interface Shape {
    void toDraw();
}

class Circle implements Shape {
    @Override
    public void toDraw() {
        System.out.println("drawing a circle");
    }
}