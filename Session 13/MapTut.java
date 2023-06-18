import java.util.*;

public class MapTut {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("A", 95);
        hm.put("B", 56);
        hm.put("C", 89);

        hm.remove("B");

        System.out.println(hm.get("A"));

        System.out.println(hm.containsKey("B"));

        System.out.println(hm.containsValue(89));

        System.out.println(hm.size());

        System.out.println(hm);


    }
}
