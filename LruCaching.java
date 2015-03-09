/**
 * LRU Caching
 * Problem F, 2012 Mid-Central
 *
 * Author: Chih-Jye Wang
 * Date  : March 9, 2015
 */

import java.util.Scanner;
import java.util.LinkedList;

public class LruCaching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseNum = 1;
        while(true) {
            int n = s.nextInt();
            
            if(n == 0)
                return;

            String data = s.next();
            run(caseNum, n, data);
            caseNum++;
        }
    }

    public static void run(int caseNum, int n, String data) {
        
        System.out.printf("Simulation %d\n", caseNum);

        LinkedList<Character> cache = new LinkedList<>();

        for(int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == '!')
                printCache(cache);
            else if(cache.contains(data.charAt(i))) {
                cache.remove(new Character(data.charAt(i)));
                cache.addLast(data.charAt(i));
            }
            else {
                if(cache.size() == n)
                    cache.removeFirst();
                cache.addLast(data.charAt(i));
            }
        }
    }

    public static void printCache(LinkedList<Character> cache) {
        for(char c : cache) {
            System.out.print(c);
        }
        System.out.println();
    }
}