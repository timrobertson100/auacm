/**
 * Sort Me - 2013 Mid-Central
 *
 * Author: Chih-Jye Wang
 * Date  : March 19, 2015
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Arrays;

public class SortMe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Sorter  c = null;
        int     y = 1;

        while(s.hasNext()) {
            int n = s.nextInt();
            if(n == 0)
                return;
            String str = s.next();

            //Create order map
            HashMap<Character, Integer> order = new HashMap<>();
            for(int i = 0; i < str.length(); i++)
                order.put(str.charAt(i), i);

            //Create comparator
            if(c == null)
                c = new Sorter(order);
            else
                c.setOrder(order);

            String[] res = new String[n];

            //Read all lines
            for(int i = 0; i < n; i++)
                res[i] = s.next();

            Arrays.sort(res, c);

            //Print out sorted lines
            System.out.println("year " + y);
            for(String line : res)
                System.out.println(line);

            y++;

            //Clear order
            order.clear();
        }
    }

    private static class Sorter implements Comparator<String> {
        private HashMap<Character, Integer> order;

        public Sorter(HashMap<Character, Integer> order) {
            this.order = order;
        }

        public void setOrder(HashMap<Character, Integer> order) {
            this.order = order;
        }

        public int compare(String a, String b) {
            if(a == "" && b == "")
                return 0;
            if(a == "")
                return -1;
            if(b == "")
                return 1;

            for(int i = 0; i < a.length() && i < b.length(); i++) {
                int c = order.get(a.charAt(i));
                int d = order.get(b.charAt(i));

                if(c < d)
                    return -1;
                else if(c > d)
                    return 1;
            }

            if(a.length() < b.length())
                return -1;
            else if(a.length() > b.length())
                return 1;

            return 0;
        }
    }
}