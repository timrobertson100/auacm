/**
 * Author: Chih-Jye Wang
 * Date  : Sep 19, 2015
 * https://open.kattis.com/problems/speedlimit
 */

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            if(n == -1)
                return;

            int[] s = new int[n];
            int[] t = new int[n];

            int sum = 0;

            for(int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                s[i] = a;
                t[i] = b;

                sum += i == 0 ? a * b : a * (t[i] - t[i-1]);
            }

            System.out.println(sum + " miles");
        }
    }
}