/**
 * Author: Chih-Jye Wang
 * Date  : Sep 27, 2015
 * https://open.kattis.com/problems/bishops
 * Easy
 */

import java.util.Scanner;

public class Bishops {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            int i = s.nextInt();
            int r = 0;
            if(i == 1)
                r = 1;
            else
                r = i + i - 2;
            System.out.println(r);
        }
    }
}