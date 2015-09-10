/**
 * Author: Chih-Jye Wang
 * Date  : Sept 10, 2015
 * https://open.kattis.com/problems/blackfriday
 * Note:
 *   - Return index not the max value.
 */

import java.util.*;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> visited = new HashSet<>();
        HashMap<Integer, Integer> unique = new HashMap<>();
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if(!visited.contains(a))
                unique.put(a, i);
            else
                unique.remove(a);

            visited.add(a);
        }
        int max = 0, index = 0;
        for(int key : unique.keySet()) {
            if(key > max) {
                max = key;
                index = unique.get(key);
            }
        }

        System.out.println(max == 0 ? "none" : index + 1);
    }
}