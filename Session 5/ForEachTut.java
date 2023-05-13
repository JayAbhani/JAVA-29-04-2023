public class ForEachTut {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9};
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i] + 1;
            System.out.println(arr[i]);
        }

        System.out.println("-----------------------------");

        for(int elem: arr) {
            elem = elem + 1;
            System.out.println(elem);
        }
    }
}
