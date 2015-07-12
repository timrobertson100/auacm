/**
 * Surprising Strings 2006 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : July 11, 2015
 */

import java.util.Scanner;
import java.util.HashSet;

public class SurprisingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("*"))
                return;

            HashSet<String> set = new HashSet<String>();
            boolean surprising = true;

            for(int d = 0;;d++) {
                for(int i = 0; i < str.length(); i++) {
                    if(i + d + 1 >= str.length())
                        break;
                    String pair = "" + str.charAt(i) + str.charAt(i + d + 1);
                    if(set.contains(pair)) {
                        surprising = false;
                        break;
                    }
                    else {
                        set.add(pair);
                    }
                }

                if(!surprising || set.size() == 0)
                    break;
                
                set.clear();
            }

            if(surprising)
                System.out.printf("%s is surprising.\n", str);
            else
                System.out.printf("%s is NOT surprising.\n", str);
        }
    }
}