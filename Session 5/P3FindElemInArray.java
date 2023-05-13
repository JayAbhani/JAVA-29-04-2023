import java.util.Scanner;

public class P3FindElemInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int res = getIndex(arr, x);
        System.out.println(res);
    }

    public static int getIndex(int[] arr, int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}



/*
5
[43, 65, 23, 78, 46]
23

return -1 if not found

2
 */