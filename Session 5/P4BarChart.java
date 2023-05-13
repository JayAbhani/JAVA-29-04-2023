import java.util.Scanner;

public class P4BarChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int max = findMax(arr);

        for(int i=max; i>=1; i--) {
            for(int j=0; j<arr.length; j++) {
                if(arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
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



