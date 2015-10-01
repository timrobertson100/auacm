/**
 * Author: Chih-Jye Wang
 * Date  : Oct 1, 2015
 * https://open.kattis.com/problems/vauvau
 * Notes:
 *   - Difficulty: medium
 *   - The tricky part is that the number starts at 1 not 0, so the modulus
 *     operation works a little differently.
 *   - Helps to draw out the examples on paper.
 */

import java.util.Scanner;

public class Vauvau {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),
            b = s.nextInt(),
            c = s.nextInt(),
            d = s.nextInt();

        for(int i = 0; i < 3; i++) {
            boolean isA = false;
            boolean isB = false;
            int x = s.nextInt();
            
            //Is dog A active?
            int m = x % (a + b);
            if(m == 0)
                m = a + b;
            if(m <= a)
                isA = true;

            //Is dog B active?
            m = x % (c + d);
            if(m == 0)
                m = c + d;
            if(m <= c)
                isB = true;

            //Output result
            if(!isA && !isB)
                System.out.println("none");
            else if((!isA && isB) || (isA && !isB))
                System.out.println("one");
            else
                System.out.println("both");
        }
    }
}