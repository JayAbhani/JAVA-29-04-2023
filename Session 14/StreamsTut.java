import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsTut {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(3, 4, 8, 2, 5, 10, 1);


    

        Stream<Integer> s1 = al.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c, e) -> c+e);


        // int result = al.stream().filter(n -> n%2==0).map(n -> n*2).reduce(0, (c, e) -> c+e);

        System.out.println(result);

        










        // int sum = 0;
        // for(int n: al) {
        //     if(n%2 == 0) {
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);
    }
}
