import java.util.*;

public class SetTut {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(7);
        hs.add(3);

        // hs.remove(10);

        // System.out.println(hs.isEmpty());

        // hs.clear();

        // System.out.println(hs.isEmpty());


        // System.out.println(hs.contains(10));



        System.out.println(hs);


        // Collections.sort(hs);    //not allowed
    }
}