/*
 * n = 5
 * 0 1 1 2 3
 */

import java.util.Scanner;

public class P8PrintFibonacciNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;

        for(int i=1; i<=n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
 }