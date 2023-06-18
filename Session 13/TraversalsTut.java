import java.util.*;

public class TraversalsTut {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(10);

        // for(int i=0; i<l.size(); i++) {
        //     System.out.println(l.get(i));
        // }

        // for(Integer elem: l) {
        //     System.out.println(elem);
        // }


        Set<Integer> s = new HashSet<>();
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(8);
        s.add(10);
        s.add(6);

        // for(Integer elem: s) {
        //     System.out.println(elem);
        // }



        Map<String, Integer> hm = new HashMap<>();

        hm.put("A", 95);
        hm.put("B", 56);
        hm.put("C", 89);

        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }
}