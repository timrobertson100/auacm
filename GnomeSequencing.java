/**
 * Gnome Sequencing - 2009 Mid-Central.
 * Author: Chih-Jye Wang
 * Date  : March 27, 2015
 */

import java.util.Scanner;

public class GnomeSequencing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Gnomes:");

        for(int i = 0; i < n; i++) {
            int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();

            if((a <= b && b <= c) || (c <= b && b <= a))
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
        }
    }
}