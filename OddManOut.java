/**
 * Author: Chih-Jye Wang
 * Date  : Sep 30, 2015
 * https://open.kattis.com/problems/oddmanout
 * Notes:
 *   - Easy
 *   - The trick is to XOR (^) all input integers per case.
 */

import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++) {
            int g = s.nextInt();
            int r = s.nextInt();
            for(int j = 1; j < g; j++)
                r ^= s.nextInt();
            System.out.printf("Case #%d: %d\n", i, r);
        }
    }
}