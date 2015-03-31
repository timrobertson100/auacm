/**
 * Pizza Pricing - 2011 Mic-Central
 * Author: Chih-Jye Wang
 * Date  : March 31, 2015
 */

public class PizzaPricing {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        for(int c = 1; true; c++) {
            int n = scan.nextInt();
            if(n == 0)
                return;
            
            float min = Float.MAX_VALUE;
            int   res = 0;

            for(int i = 0; i < n; i++) {
                float d = scan.nextFloat();
                float p = scan.nextFloat();
                float r = d / 2;
                float x = (float)(p / (Math.PI * r * r));

                if(x < min) {
                    min = x;
                    res = (int)d;
                }
            }

            System.out.printf("Menu %d: %d\n", c, res);
        }
    }
}