/*
 * n = 4268
 * op = 4
 * 
 * n = 426
 * op = 3
 */

import java.util.Scanner;

public class P5CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        while(n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
