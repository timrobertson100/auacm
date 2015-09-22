/**
 * Author: Chih-Jye Wang
 * Date  : Sep 21, 2015
 * https://open.kattis.com/problems/beatspread
 */

import java.util.Scanner;

public class BeatTheSpread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int s = scanner.nextInt(),
                d = scanner.nextInt();
            if(d > s || (s + d) % 2 == 1)
                System.out.println("impossible");
            else {
                int a = (s - d) / 2;
                int b = s - a;

                System.out.printf("%d %d\n", a > b ? a : b, a > b ? b : a);
            }
        }
    }
}