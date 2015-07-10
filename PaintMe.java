/**
 * Paint Me 2012 Southeast
 * Author: Chih-Jye Wang
 * Date  : July 9, 2015
 */

import java.util.Scanner;

public class PaintMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            int w = scanner.nextInt();
            int l = scanner.nextInt();
            int h = scanner.nextInt();
            int a = scanner.nextInt();
            int m = scanner.nextInt();

            if(n == 0 && w == 0 && l == 0 && h == 0 && a == 0 && m == 0)
                return;

            int area = ((2 * h * l + 2 * w * h + l * w) - readWindowArea(scanner, m)) * n;
            System.out.println((int)Math.ceil((float)area / a));
        }
    }

    private static int readWindowArea(Scanner scanner, int m) {
        int res = 0;
        for(int i = 0; i < m; i++) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            res += w * h;
        }
        return res;
    }
}