/**
 * Judges' Time Calculation - 2010 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : March 21, 2015
 */

import java.util.Scanner;

public class JudgesTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //One iteration for each of n cases.
        for(int c = 0; c < n; c++) {
            int sh = scan.nextInt();
            int sm = scan.nextInt();
            int dh = scan.nextInt();
            int dm = scan.nextInt();

            //End hour (eh) and minute (em)
            int eh = sh + dh;
            int em = sm + dm;

            eh += em / 60;
            em %= 60;

            System.out.println("------+---------");
            System.out.println(" time | elapsed");
            System.out.println("------+---------");

            for(int h = sh; h <= eh; h++) {
                int diff = (h * 60) - (sh * 60 + sm); //Time diff in minutes
                System.out.printf("%2d:XX | XX %s %s\n",
                    h > 12 ? (h % 13 + 1) : h,
                    diff == 0 ? "" : (diff < 0 ? "-" : "+"),
                    diff == 0 ? "" : Math.abs(diff)
                );

            }
        }
    }
}