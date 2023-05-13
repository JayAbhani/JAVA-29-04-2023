public class ArrayTraversal {
    public static void main(String[] args) {
//        1d array
//        int[] arr = {1, 2, 3, 4, 5};
//        for(int i=0; i<arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        2d array
        int[][] arr = {{1, 2}, {3, 4, 99}, {5, 6}};
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[1][0]);

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
