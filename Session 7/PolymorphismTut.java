//public class PolymorphismTut {
//    public static void main(String[] args) {
////        Circle c = new Circle();
////        c.toDraw();
////
////        Shape s = new Circle();
////        s.toDraw();
////
////        Shape s2 = new Circle();
////        s2.toDraw();
////
////        Shape s3 = new Rectangle();
////        s3.toDraw();
//
//        Calculator c = new Calculator();
//        int res = c.add(4, 2, 5);
//        System.out.println(res);
//    }
//}
//
//class Shape {
//    public void toDraw() {
//        System.out.println("drawing a generic shape");
//    }
//}
//
//class Circle extends Shape {
//    @Override
//    public void toDraw() {
//        System.out.println("drawing a circle");
//    }
//}
//
//class Rectangle extends Shape {
//    @Override
//    public void toDraw() {
//        System.out.println("drawing a rectangle");
//    }
//}
//
//
//class Calculator {
//    public int add(int a, int b) {
//        int res = a + b;
//        return res;
//    }
//
//    public int add(int a, int b, int c) {
//        int res = a + b + c;
//        return res;
//    }
//
//    public double add(double a, double b) {
//        double res = a + b;
//        return res;
//    }
//}
//
//
