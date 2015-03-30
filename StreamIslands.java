/**
 * Islands in the Data Stream - 2013 Greater NY
 * Author: Chih-Jye Wang
 * Date  : March 29, 2015
 */

public class StreamIslands {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int p = scan.nextInt();
        for(int i = 0; i < p; i++) {
            int prev = 0, count = 0;
            scan.nextInt();
            for(int j = 0; j < 15; j++) {
                int x = scan.nextInt();
                if(x < prev)
                    count++;
                prev = x;
            }

            System.out.printf("%d %d\n", i + 1, count);
        }
    }
}