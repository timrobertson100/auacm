/**
 * Vive la Difference!
 *
 * Author: Chih-Jye Wang
 * Date  : Feb 16, 2015
 */

import java.util.*;

public class ViveLaDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();

            if(a == 0 && b == 0 && c == 0 && d == 0)
                break;

            int count = 0;

            int w = a;
            int x = b;
            int y = c;
            int z = d;

            while(w != x || x != y || y != z || z != w) {
                w = Math.abs(a - b);
                x = Math.abs(b - c);
                y = Math.abs(c - d);
                z = Math.abs(d - a);

                a = w;
                b = x;
                c = y;
                d = z;

                count++;
            }

            System.out.println(count);
        }
    }
}