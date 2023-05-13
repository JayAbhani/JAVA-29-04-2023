public class ArrayTut {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[2];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;
        arr[2][0] = 6;
        arr[2][1] = 7;

        System.out.println(arr[1][2]);

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(arr2[0][2]);
    }    
}
