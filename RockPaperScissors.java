/**
 * Rock, Paper, Scissors - 2009 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : March 28, 2015
 */

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String p1 = scan.nextLine();
            String p2 = scan.nextLine();

            if(p1.length() == 1 && p1.charAt(0) == 'E')
                return;

            int c1 = 0;
            int c2 = 0;

            for(int i = 0; i < p1.length(); i++) {
                if(p1.charAt(i) == 'R') {
                    if(p2.charAt(i) == 'P')
                        c2++;
                    if(p2.charAt(i) == 'S')
                        c1++;
                }
                else if(p1.charAt(i) == 'P') {
                    if(p2.charAt(i) == 'R')
                        c1++;
                    if(p2.charAt(i) == 'S')
                        c2++;
                }
                else { // p1 == 'S'
                    if(p2.charAt(i) == 'R')
                        c2++;
                    if(p2.charAt(i) == 'P')
                        c1++;
                }
            }

            System.out.println("P1: " + c1);
            System.out.println("P2: " + c2);
        }
    }
}