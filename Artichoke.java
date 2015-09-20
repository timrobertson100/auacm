/**
 * Author: Chih-Jye Wang
 * Date  : Sep 19, 2015
 * https://open.kattis.com/problems/artichoke
 */

import java.util.Scanner;

public class Artichoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt(),
            a = scanner.nextInt(),
            b = scanner.nextInt(),
            c = scanner.nextInt(),
            d = scanner.nextInt(),
            n = scanner.nextInt();

        double max = Double.MIN_VALUE;
        double res = Double.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            double val = f(p, a, b, c, d, i);

            if(val > max)
                max = val;
            else if(val < max && i > 1) {
                double dif = max - val;
                if(dif > res)
                    res = dif;
            }
        }

        if(res == Double.MIN_VALUE)
            System.out.println(0.00);
        else
            System.out.println(res);
    }

    private static double f(int p, int a, int b, int c, int d, int k) {
        return p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
    }
}