/**
 * Digit Solitaire
 *
 * Author: Chih-Jye Wang
 * Date  : Feb 16, 2015
 */
import java.util.Scanner;

public class DigitSolitaire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int i = scan.nextInt();
            if(i == 0)
                break;
            go(i);
            System.out.println();
        }
    }
    
    private static void go(int num) {
        System.out.print(num);
        String str = "" + num;
        while(str.length() > 1) {
            int p = str.charAt(0) - 48;
            for(int i = 1; i < str.length(); i++) {
                p *= str.charAt(i) - 48;
            }
            
            System.out.print(" " + p);
            str = "" + p;
        }
    }
}