/**
 * Root of the Problem 2006 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : May 4, 2015
 *
 * Strategy: linear search
 */

import java.util.Scanner;

public class RootOfTheProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int b = scan.nextInt();
            int n = scan.nextInt();
            if(b == 0 && n == 0)
                return;
            int minDiff = Integer.MAX_VALUE;
            for(int a = 0; a < 10000000; a++) {
                int power = (int)Math.pow(a, n);
                int diff = Math.abs(b - power);

                if(diff <= minDiff) {
                    minDiff = diff;
                }
                else {
                    System.out.println(a - 1);
                    break;
                }
            }
        }
    }
}