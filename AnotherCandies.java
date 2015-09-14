/**
 * Author: Chih-Jye Wang
 * Date  : Sept 14, 2015
 * https://open.kattis.com/problems/anothercandies
 */

import java.util.Scanner;

public class AnotherCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long sum = 0;
            for(int j = 0; j < n; j++) {
                sum += scanner.nextLong() % n;
                sum %= n;
            }

            System.out.println(sum == 0 ? "YES" : "NO");
        }
    }
}