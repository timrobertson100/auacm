/**
 * Text Roll 2013 Southeast
 * Author: Chih-Jye Wang
 * Date  : June 6, 2015
 */

import java.util.*;

public class TextRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int n = scanner.nextInt();
            if(n == 0)
                return;
            scanner.nextLine();
            doCase(scanner, n);
        }
    }

    private static void doCase(Scanner scanner, int n) {
        int pos = 1;
        for(int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            for(; pos <= str.length() && str.charAt(pos - 1) != ' '; pos++) {}
        }
        System.out.println(pos);
    }
}