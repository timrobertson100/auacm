/**
 * Author: Chih-Jye Wang
 * Date  : Sept 11, 2015
 * https://open.kattis.com/problems/oddities
 */

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            System.out.printf("%d is %s\n", x, x % 2 == 0 ? "even" : "odd");
        }
    }
}