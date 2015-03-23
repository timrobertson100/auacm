/**
 * Reverse Rot - 2014 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : March 22, 2015
 */

import java.util.Scanner;
import java.util.HashMap;

public class ReverseRot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int n = scan.nextInt();
            if(n == 0)
                return;

            String msg = scan.next();

            //Make the rotation
            HashMap<Character, Character> key = new HashMap<>();
            for(char c = 'A'; c < (char)('Z' + 3); c++) {
                char s = (char)(c + (char)n);
                if(s > 'Z' + 2)
                    s = (char)(s  % ('Z' + 3) + 'A');
                if(s == 'Z' + 1) s = '_';
                else if(s == 'Z' + 2) s = '.';
                key.put(c <= 'Z' ? c : (c == 'Z' + 1 ? '_' : '.'), s);
            }

            //Encrypt message
            StringBuilder res = new StringBuilder(msg.length());
            for(int i = msg.length() - 1; i >= 0; i--) {
                res.append(key.get(msg.charAt(i)).toString());
            }

            System.out.println(res.toString());
        }
    }
}