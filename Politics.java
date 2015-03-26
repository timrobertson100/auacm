/**
 * Politics - 2013 Southeast Division II
 * Author: Chih-Jye Wang
 * Date  : March 25, 2015
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Arrays;

public class Politics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            if(n == 0 && m == 0)
                return;

            //HashMap for candidates
            HashMap<String, Integer> order = new HashMap<>();

            //Read candidates
            for(int i = 0; i < n; i++)
                order.put(scan.next(), i);

            //Read supporters
            Support[] sup = new Support[m];
            for(int i = 0; i < m; i++) {
                sup[i] = new Support(scan.next(), scan.next());
                if(!order.containsKey(sup[i].candidate))
                    order.put(sup[i].candidate, order.size());
            }

            //Sort supporters
            Arrays.sort(sup, new C(order));

            for(int i = 0; i < m; i++)
                System.out.println(sup[i].supporter);

        }
    }

    private static class Support {
        String candidate;
        String supporter;

        public Support(String supporter, String candidate) {
            this.supporter = supporter;
            this.candidate = candidate;
        }
    }

    private static class C implements Comparator<Support> {
        private HashMap<String, Integer> order;

        public C(HashMap<String, Integer> order) {
            this.order = order;
        }

        public int compare(Support a, Support b) {
            return order.get(a.candidate).compareTo(order.get(b.candidate));
        }
    }
}