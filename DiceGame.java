/**
 * Author: Chih-Jye Wang
 * Date  : Oct 2, 2015
 * https://open.kattis.com/problems/dicegame
 * Easy
 */

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float g = ((s.nextFloat() + s.nextFloat()) / 2) + ((s.nextFloat() + s.nextFloat()) / 2);
        float e = ((s.nextFloat() + s.nextFloat()) / 2) + ((s.nextFloat() + s.nextFloat()) / 2);
        if(g > e)
            System.out.println("Gunnar");
        else if(g < e)
            System.out.println("Emma");
        else
            System.out.println("Tie");
    }
}