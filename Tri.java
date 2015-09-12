/**
 * Author: Chih-Jye Wang
 * Date  : Sept 11, 2015
 * https://open.kattis.com/problems/tri
 */

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if(a + b == c) {
            System.out.printf("%d+%d=%d", a, b, c);
            return;
        }
        if(a - b == c) {
            System.out.printf("%d-%d=%d", a, b, c);
            return;
        }
        if(a * b == c) {
            System.out.printf("%d*%d=%d", a, b, c);
            return;
        }
        if(a / b == c) {
            System.out.printf("%d/%d=%d", a, b, c);
            return;
        }

        if(a == b + c) {
            System.out.printf("%d=%d+%d", a, b, c);
            return;
        }
        if(a == b - c) {
            System.out.printf("%d=%d-%d", a, b, c);
            return;
        }
        if(a == b * c) {
            System.out.printf("%d=%d*%d", a, b, c);
            return;
        }
        if(a == b / c) {
            System.out.printf("%d=%d/%d", a, b, c);
            return;
        }
    }
}