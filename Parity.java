/**
 * Parity - 2008 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : April 5, 2015
 */

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String s = scan.nextLine();
            if(s.charAt(0) == '#')
                return;
            boolean odd = false;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'e') {
                    if(odd)
                        System.out.println('1');
                    else
                        System.out.println('0');
                }
                else if(s.charAt(i) == 'o') {
                    if(odd)
                        System.out.println('0');
                    else
                        System.out.println('1');
                }
                else {
                    System.out.print(s.charAt(i));
                    if(s.charAt(i) == '1')
                        odd = !odd;
                }
            }
        }
    }
}