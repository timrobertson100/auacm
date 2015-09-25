/**
 * Author: Chih-Jye Wang
 * Date  : Sep 25, 2015
 * https://open.kattis.com/problems/erase
 * Level : Easy
 */

import java.util.Scanner;

public class EraseSecurely {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String s1 = s.next(), s2 = s.next();
        if(n % 2 == 0) {
            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) != s2.charAt(i)) {
                    System.out.println("Deletion failed");
                    return;
                }
            }
            System.out.println("Deletion succeeded");
        }
        else {
            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) == s2.charAt(i)) {
                    System.out.println("Deletion failed");
                    return;
                }
            }
            System.out.println("Deletion succeeded");
        }
    }
}