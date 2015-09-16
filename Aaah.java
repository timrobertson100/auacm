/**
 * Author: Chih-Jye Wang
 * Date  : Sep 15 2015
 * https://open.kattis.com/problems/aaah
 */

import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().length() < scanner.nextLine().length())
            System.out.println("no");
        else
            System.out.println("go");
    }
}