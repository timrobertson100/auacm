/**
 * Author: Chih-Jye Wang
 * Date  : Sept 28, 2015
 * https://open.kattis.com/problems/engineeringenglish
 * Really Easy
 */

import java.util.Scanner;
import java.util.HashSet;

public class EngineeringEnglish {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> m = new HashSet<>();
        while(s.hasNext()) {
            String str = s.next();
            String low = str.toLowerCase();
            if(m.contains(low)) {
                System.out.print(". ");
            }
            else {
                m.add(low);
                System.out.print(str + " ");
            }
        }
    }
}