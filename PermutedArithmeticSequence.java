/**
 * Author: Chih-Jye Wang
 * Date  : Sep 24, 2015
 * https://open.kattis.com/problems/permutedarithmeticsequence
 * Notes:
 *   1. We just have to realize, an Arithmetic Sequence must be a sequence that
 *      is either increasing or decreasing.
 */

import java.util.*;

public class PermutedArithmeticSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int m = s.nextInt();
            int[] a = new int[m];
            int diff = 0;
            boolean isAS = true;
            for(int j = 0; j < m; j++) {
                a[j] = s.nextInt();
                if(j > 0) {
                    int d = a[j] - a[j - 1];
                    if(j == 1)
                        diff = d;
                    else if(d != diff)
                        isAS = false;
                }
            }

            if(isAS) {
                System.out.println("arithmetic");
                continue;
            }

            isAS = true;
            diff = 0;
            Arrays.sort(a);
            for(int j = 1; j < m; j++) {
                int d = a[j] - a[j - 1];
                if(j == 1)
                    diff = d;
                else if(d != diff) {
                    isAS = false;
                    break;
                }
            }

            if(isAS)
                System.out.println("permuted arithmetic");
            else
                System.out.println("non-arithmetic");
        }
    }
}