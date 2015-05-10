/**
 * Digit Sum 2013 Mid-Central
 * Author: Chih-Jye Wang
 * Date  : May 9, 2015
 */

import java.util.*;

public class DigitSum {

    private static LinkedList<Integer> list;
    private static int zeroCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n == 0)
                return;

            list = new LinkedList<>();
            zeroCount = 0;

            for(int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                list.add(num);
                if(num == 0)
                    zeroCount++;
            }
            
            Collections.sort(list);
            
            doCase();
        }
    }

    private static void doCase() {
        int sum1 = 0, sum2 = 0;
        int num1 = 0, num2 = 0;

        int width = (int)Math.ceil(list.size() / 2.0);
        
        for(int col = 0; col < width; col++) {
            num1 = getNext();
            num2 = getNext();

            if(num1 > num2) {
                if(sum1 > sum2) {
                    sum2 += num1 * (int)Math.pow(10, col);
                    sum1 += num2 * (int)Math.pow(10, col);
                }
                else {
                    sum1 += num1 * (int)Math.pow(10, col);
                    sum2 += num2 * (int)Math.pow(10, col);
                }
            }
            else {
                if(sum1 > sum2) {
                    sum1 += num1 * (int)Math.pow(10, col);
                    sum2 += num2 * (int)Math.pow(10, col);
                }
                else {
                    sum2 += num1 * (int)Math.pow(10, col);
                    sum1 += num2 * (int)Math.pow(10, col);
                }
            }
        }

        System.out.println(sum1 + sum2);
    }

    private static int getNext() {
        if(list.size() == 0)
            return 0;

        if(list.size() - zeroCount <= 2 && zeroCount > 0) {
            zeroCount--;
            list.remove(0);
            return 0;
        }

        int max = list.removeLast();
        return max;
    }

}