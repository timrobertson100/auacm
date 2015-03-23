/**
 * Duplicate Removal - 2009 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : March 23, 2015
 */

import java.util.Scanner;

public class DuplicateRemoval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int n = scan.nextInt();
            if(n == 0)
                return;

            int prev = -1;

            for(int i = 0; i < n; i++) {
                int guess = scan.nextInt();
                if(guess != prev)
                    System.out.print(guess + " ");
                prev = guess;
            }

            System.out.println("$");
        }
    }
}