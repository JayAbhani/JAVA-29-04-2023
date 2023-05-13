import java.util.Scanner;

public class P1MaxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = findMax(arr);
        System.out.println(res);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}





/*
5
[43, 65, 23, 78, 46]

78
 */