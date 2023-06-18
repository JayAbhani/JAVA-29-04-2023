public class LambdaTut {
    public static void main(String[] args) {
        A obj = i -> "Running " + i;

        String result = obj.run(5);
        System.out.println(result);
    }
}

@FunctionalInterface
interface A {
    String run(int i);
}

