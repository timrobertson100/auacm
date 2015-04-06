/**
 * Refrigerator Magnets - 2011 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : April 6, 2015
 */

import java.util.Scanner;

public class RefrigeratorMagnets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String line = scan.nextLine();
            if(line.compareTo("END") == 0)
                return;

            boolean[] used = new boolean[26];
            boolean output = true;

            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ' ')
                    continue;
                if(used[line.charAt(i) - 'A']) {
                    output = false;
                    break;
                }
                used[line.charAt(i) - 'A'] = true;
            }

            if(output)
                System.out.println(line);
        }
    }
}