/**
 * Author: Chih-Jye Wang
 * Date  : Sep 15 2015
 * https://open.kattis.com/problems/ants
 * Notes:
 *   - The time limit is very short. Initially, I used printf() to output the
 *     result and I got "Exceed Time Limit". Then I used simple print() and
 *     the solution was accepted.
 */

import java.util.Scanner;

public class Ants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l, n, min, max, p;
        int i, j;

        int t = scanner.nextInt();
        
        for(i = 0; i < t; i ++) {
            l = scanner.nextInt();
            n = scanner.nextInt();
            min = -1;
            max = -1;

            for(j = 0; j < n; j++) {
                p = scanner.nextInt();
                min = Math.max(min, Math.min(p, l - p));
                max = Math.max(max, Math.max(p, l - p));
            }

            System.out.print(min);
            System.out.print(' ');
            System.out.println(max);
        }
    }
}