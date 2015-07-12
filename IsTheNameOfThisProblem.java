/**
 * Is the Name of This Problem 2012 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : July 12, 2015
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IsTheNameOfThisProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\"([A-Z ]+)\" \\1");

        while(true) {
            String str = scanner.nextLine();
            if(str.equals("END"))
                return;
            Matcher m = pattern.matcher(str);
            if(m.matches())
                System.out.printf("Quine(%s)\n", m.group(1));
            else
                System.out.println("not a quine");
        }
    }
}