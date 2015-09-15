/**
 * Author: Chih-Jye Wang
 * Date  : Sep 15 2015
 * https://open.kattis.com/problems/ladder
 */

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(), v = scanner.nextInt();
        System.out.println((int)Math.ceil(h / Math.sin(Math.toRadians(v))));
    }
}