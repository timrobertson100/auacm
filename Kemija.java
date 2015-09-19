/**
 * Author: Chih-Jye Wang
 * Date  : Sep 18 2015
 * https://open.kattis.com/problems/kemija08
 */

import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            System.out.print(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                i += 3;
            else
                i++;
        }
    }    
}