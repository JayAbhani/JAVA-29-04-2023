public class FunctionalInterfaceTut {
    public static void main(String[] args) {
        A obj = new B();
        obj.run();
    }
}

@FunctionalInterface
interface A {
    void run();
}

class B implements A {

    @Override
    public void run() {
        System.out.println("running");
    }
    
}

// this way applies to normal interfaces also