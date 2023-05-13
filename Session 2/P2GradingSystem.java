/*
 * input -> marks of students
 * marks > 90  => excellent
 *       >80 <=90   => good
 *      >70 <=80  => fair
 *      >60 <= 70  => meets expectations
 *      <60     => need practice
 */

import java.util.Scanner;

import javax.xml.transform.Source;

public class P2GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if(marks > 90) {
            System.out.println("excellent");
        } else if(marks > 80 && marks <= 90) {
            System.out.println("good");
        } else if(marks > 70 && marks <= 80) {
            System.out.println("fair");
        } else if(marks > 60 && marks <= 70) {
            System.out.println("meets expectations");
        } else if(marks < 60) {
            System.out.println("need more practice");
        }
    }
}
