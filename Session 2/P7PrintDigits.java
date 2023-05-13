/*
 * n = 536
 * 5
 * 3
 * 6
 */

import java.util.Scanner;

public class P7PrintDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int temp = n;
        int nod = 0;

        while(temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int)Math.pow(10, nod-1);

        while(div != 0) {
            int dig = n / div;
            System.out.println(dig);
            n = n % div;
            div = div / 10;
        }

    }
}
