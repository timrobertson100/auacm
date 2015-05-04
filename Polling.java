/**
 * Polling - 2014 Southeast
 * Author: Chih-Jye Wang
 * Date  : May 3, 2015
 */
 
import java.util.*;

public class Polling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        HashMap<String, Integer> votes = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int vote = 0;
            if(votes.containsKey(name)) {
                votes.put(name, votes.get(name) + 1);
                vote = votes.get(name);
            }
            else {
                votes.put(name, 1);
                vote = 1;
            }

            if(vote > max) {
                max = vote;
                res.clear();
                res.add(name);
            }
            else if(vote == max) {
                res.add(name);
            }
        }

        Collections.sort(res);
        
        for(String name : res) {
            System.out.println(name);
        }
    }
}