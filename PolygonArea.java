/**
 * Author: Chih-Jye Wang
 * Date  : Sept 12, 2015
 * https://open.kattis.com/problems/polygonarea
 * Note:
 *   - Using Shoelace Formula: https://en.wikipedia.org/wiki/Shoelace_formula
 */

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            if(n == 0)
                return;
            int[] x = new int[n];
            int[] y = new int[n];

            for(int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }

            int sum = 0;
            for(int i = 0; i < n; i++)
                sum += x[i] * y[(i + 1) % n] - y[i] * x[(i + 1) % n];

            System.out.printf("%s %.1f\n", sum < 0 ? "CW" : "CCW", Math.abs(0.5 * sum));
        }
    }
}