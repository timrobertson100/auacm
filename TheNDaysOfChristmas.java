/**
 * The N Days of Christmas - 2013 Southeast
 * Author: Chih-Jye Wang
 * Date  : March 26, 2015
 *
 * Using divergent series formula. See reference below.
 *
 * Note that n must be long, because n * (n + 1) * (n + 2) will overflow int.
 * 
 * References:
 * http://www.algebra.com/algebra/homework/Sequences-and-series/Sequences-and-series.faq.question.512989.html
 * https://answers.yahoo.com/question/index?qid=20130221085518AA0o66x
 */

import java.util.Scanner;
public class TheNDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(long n = scan.nextInt(); n != 0; n = scan.nextInt())
            System.out.println(n * (n + 1) * (n + 2) / 6);
    }
}