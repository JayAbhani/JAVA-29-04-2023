import java.util.Scanner;

public class P2SpanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = getSpan(arr);
        System.out.println(res);


    }

    public static int getSpan(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else if(arr[i] < min) {
                min = arr[i];
            }
        }
        int span = max - min;
        return span;
    }
}




/*
span = max val - min val;
5
[43, 65, 23, 78, 46]

55

 */