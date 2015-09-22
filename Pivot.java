/**
 * Author: Chih-Jye Wang
 * Date  : Sep 22, 2015
 * https://open.kattis.com/problems/pivot
 */

import java.util.Scanner;

public class Pivot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] mins = new int[n];
        int[] maxs = new int[n];

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            maxs[i] = max;
            if(a[i] > max)
                max = a[i];
        }

        int min = Integer.MAX_VALUE;
        for(int i = n - 1; i >= 0; i--) {
            mins[i] = min;
            if(a[i] < min)
                min = a[i];
        }

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] >= maxs[i] && a[i] <= mins[i])
                count++;
        }

        System.out.println(count);
    }
}