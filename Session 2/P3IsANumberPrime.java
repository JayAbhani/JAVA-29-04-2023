/*
 * n = 13
 * prime
 */

import java.util.Scanner;

public class P3IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) {
                count++;
                break;
            }
        }
        if(count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
