/**
 * Author: Chih-Jye Wang
 * Date  : Sep 23, 2015
 * https://open.kattis.com/problems/subseqhard
 * 
 * Solution:
 * http://ipsc.ksp.sk/2006/real/solutions/c.html
 */

import java.util.Scanner;
import java.util.HashMap;

public class SubSeqHard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> m = new HashMap<>();
        int t = in.nextInt();
        for(int c = 0; c < t; c++) {
            int res = 0;
            int n = in.nextInt();
            int[] a = new int[n];
            m.put(0, 1);
            for(int i = 0; i < n; i++) {
                int x = in.nextInt();
                a[i] = i == 0 ? x : a[i-1] + x;

                if(a[i] > 0) {
                    if(m.containsKey(a[i] - 47))
                        res += m.get(a[i] - 47);
                }
                else {
                    if(m.containsKey(47 - a[i]))
                        res += m.get(47 - a[i]);
                }
                
                if(m.containsKey(a[i]))
                    m.put(a[i], m.get(a[i]) + 1);
                else
                    m.put(a[i], 1);
            }

            m.clear();
            System.out.println(res);
        }
    }
}