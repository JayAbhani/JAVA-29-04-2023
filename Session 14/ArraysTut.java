import java.util.Arrays;

public class ArraysTut {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 3, 2, 8};
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
