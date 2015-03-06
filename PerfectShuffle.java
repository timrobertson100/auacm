/**
 * Perfect Shuffle
 *
 * Author: Chih Jye Wang
 * Date  : March 5, 2015
 */
 
import java.util.*;

public class PerfectShuffle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()) {
            int n = scan.nextInt();
            if(n == 0)
                return;
                
            scan.nextLine();
            
            String[] cards = new String[n];
            for(int i = 0; i < n; i++)
                cards[i] = scan.nextLine();
                
            int i = 0;
            int j = n % 2 == 0 ? n / 2 : n / 2 + 1;
            
            for(i = 0; i < n / 2; i++, j++) {
                System.out.println(cards[i]);
                System.out.println(cards[j]);
            }
            
            if(n % 2 != 0)
                System.out.println(cards[i]);
        }
    }
}