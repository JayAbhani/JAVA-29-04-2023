import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodTut {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(4, 5, 7, 3, 2, 8);
        
        // for(int i=0; i<al.size(); i++) {
        //     System.out.println(al.get(i));
        // }

        // for(Integer n: al) {
        //     System.out.println(n);
        // }

        // al.forEach(n -> System.out.println(n));


      

        al.forEach(n -> System.out.println(n));



        


    }    
}
