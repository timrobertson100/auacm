/**
 * Author: Chih-Jye Wang
 * Date  : Sep 27, 2015
 * https://open.kattis.com/problems/statistics
 * Really Easy
 */

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i = 1; s.hasNext(); i++) {
            int n = s.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++) {
                int x = s.nextInt();
                if(x < min)
                    min = x;
                if(x > max)
                    max = x;
            }

            System.out.printf("Case %d: %d %d %d\n", i, min, max, max - min);
        }
    }
}