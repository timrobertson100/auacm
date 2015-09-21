/**
 * Author: Chih-Jye Wang
 * Date  : Sep 21, 2015
 * Welcome to Code Jam from Google Code Jam 2009
 * https://code.google.com/codejam/contest/90101/dashboard#s=p2&a=2
 * https://open.kattis.com/problems/welcomeeasy
 */

import java.util.Scanner;

public class WelcomeToCodeJam {
    final static int b = 10000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= n; i++) {
            String s = scanner.nextLine();
            int[] a = new int[19];
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == 'w') {
                    a[0]++;
                    a[0] %= b;
                }
                else if(c == 'e') {
                    if(a[0] != 0) {
                        a[1] += a[0];
                        a[1] %= b;
                    }
                    if(a[5] != 0) {
                        a[6] += a[5];
                        a[6] %= b;
                    }
                    if(a[13] != 0) {
                        a[14] += a[13];
                        a[14] %= b;
                    }
                }
                else if(c == 'l') {
                    if(a[1] != 0) {
                        a[2] += a[1];
                        a[2] %= b;
                    }
                }
                else if(c == 'c') {
                    if(a[2] != 0) {
                        a[3] += a[2];
                        a[3] %= b;
                    }
                    if(a[10] != 0) {
                        a[11] += a[10];
                        a[11] %= b;
                    }
                }
                else if(c == 'o') {
                    if(a[3] != 0) {
                        a[4] += a[3];
                        a[4] %= b;
                    }
                    if(a[8] != 0) {
                        a[9] += a[8];
                        a[9] %= b;
                    }
                    if(a[11] != 0) {
                        a[12] += a[11];
                        a[12] %= b;
                    }
                }
                else if(c == 'm') {
                    if(a[4] != 0) {
                        a[5] += a[4];
                        a[5] %= b;
                    }
                    if(a[17] != 0) {
                        a[18] += a[17];
                        a[18] %= b;
                    }
                }
                else if(c == 't') {
                    if(a[7] != 0) {
                        a[8] += a[7];
                        a[8] %= b;
                    }
                }
                else if(c == 'd') {
                    if(a[12] != 0) {
                        a[13] += a[12];
                        a[13] %= b;
                    }
                }
                else if(c == 'j') {
                    if(a[15] != 0) {
                        a[16] += a[15];
                        a[16] %= b;
                    }
                }
                else if(c == 'a') {
                    if(a[16] != 0) {
                        a[17] += a[16];
                        a[17] %= b;
                    }
                }
                else if(c == ' ') {
                    if(a[6] != 0) {
                        a[7] += a[6];
                        a[7] %= b;
                    }
                    if(a[9] != 0) {
                        a[10] += a[9];
                        a[10] %= b;
                    }
                    if(a[14] != 0) {
                        a[15] += a[14];
                        a[15] %= b;
                    }
                }
            }

            System.out.printf("Case #%d: %04d\n", i, a[18] % b);
        }
    }
}