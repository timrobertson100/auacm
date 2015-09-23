/**
 * Author: Chih-Jye Wang
 * Date  : Sep 23, 2015
 * https://open.kattis.com/problems/mixedfractions
 */

import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a == 0 && b == 0)
                return;
            System.out.printf("%d %d / %d\n", a / b, a % b, b);
        }
    }
}