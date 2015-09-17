/**
 * Author: Chih-Jye Wang
 * Date  : Sep 16 2015
 * https://open.kattis.com/problems/reversebinary
 */

import java.util.Scanner;

public class ReverseBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0x40000000;
        int p = 0;
        int res = 0;

        for(int i = 0; i < 31; i++) {
            if((n & m) != 0) {
                if(p == 0)
                    p = i;
                res += 1 << (i - p);
            }
            m = m >> 1;
        }

        System.out.println(res);
    }
}