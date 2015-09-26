/**
 * Author: Chih-Jye Wang
 * Date  : Sep 26, 2015
 * https://open.kattis.com/problems/symmetricorder
 */

import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i = 1;;i++) {
            int n = s.nextInt();
            if(n == 0)
                return;
            String[] a = new String[n];
            for(int j = 0; j < n; j++) {
                if(j % 2 == 0)
                    a[j / 2] = s.next();
                else
                    a[n - 1 - j / 2] = s.next();
            }
            System.out.println("SET " + i);
            for( int j = 0; j < n; j++)
                System.out.println(a[j]);
        }
    }
}