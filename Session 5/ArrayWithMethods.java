public class ArrayWithMethods {
    public static void main(String[] args) {
        //passing arrays to methods
//        int[] arr = {2, 4, 6, 7};
//        int res = sum(arr);
//        System.out.println(res);


//        returning array from method
        int[] arr = ca();
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);


    }

//    public static int sum(int[] arr) {
//        int sum = 0;
//        for(int i=0; i<arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        return sum;
//    }

    public static int[] ca() {
        return new int[3];
    }
}
