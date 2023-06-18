public class AnonymousInnerClassTut {
    public static void main(String[] args) {
        A obj = new A(){

            @Override
            public void run() {
                System.out.println("running");
            }

            @Override
            public void drink() {
                System.out.println("drinking");
            }
                        
        };

        obj.run();
        obj.drink();
    }
}


interface A {
    void run();
    void drink();
}

// class B implements A {

//     @Override
//     public void run() {
//         System.out.println("running");
//     }
    
// }