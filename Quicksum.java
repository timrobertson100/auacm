/**
 * Quicksum - 2006 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : April 4, 2015
 */

import java.util.Scanner;

public class Quicksum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String m = scan.nextLine();
            if(m.charAt(0) == '#')
                return;
            int sum = 0;
            for(int i = 0; i < m.length(); i++) {
                if(m.charAt(i) == ' ')
                    continue;
                sum += (i + 1) * (m.charAt(i) - 'A' + 1);
            }
            System.out.println(sum);
        }
    }
}