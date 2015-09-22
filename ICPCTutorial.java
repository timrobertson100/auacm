/**
 * Author: Chih-Jye Wang
 * Date  : Sep 22, 2015
 * https://open.kattis.com/problems/tutorial
 * Note:
 *   - The thing to realize is that 13! and 2^30 are larger than the upper bound of m.
 *   - This source code could definitely be simplifed.
 */

import java.util.*;

public class ICPCTutorial {

    static HashMap<Long, Long> fac;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fac = new HashMap<>();
        long m = sc.nextLong(), n = sc.nextLong(), t = sc.nextLong();
        long r = f(n, t);

        //System.out.println(r);

        if(r > m)
            System.out.println("TLE");
        else
            System.out.println("AC");
    }

    static long f(long n, long t) {
        switch((int)t) {
            case 1: return f1(n);
            case 2: return f2(n);
            case 3: return f3(n);
            case 4: return f4(n);
            case 5: return f5(n);
            case 6: return f6(n);
            case 7: return f7(n);
        }
        return 0;
    }

    static long f1(long n) {
        if (n > 12)
            return Integer.MAX_VALUE;

        if(n == 1 || n == 2)
            return n;

        if(fac.containsKey(n))
            return fac.get(n);
        
        long res = n * f1(n - 1);
        fac.put(n, res);
        return res;
    }

    static long f2(long n) {
        if(n >= 30)
            return Integer.MAX_VALUE;
        return 1 << n;       
    }

    static long f3(long n) {
        return n * n * n * n;
    }

    static long f4(long n) {
        return n * n * n;       
    }

    static long f5(long n) {
        return n * n;       
    }

    static long f6(long n) {
        return (long)Math.ceil((n * (Math.log(n) / Math.log(2))));        
    }

    static long f7(long n) {
        return n;        
    }
}