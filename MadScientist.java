/**
 * Mad Scientist
 *
 * Author: Chih Jye Wang
 * Date  : March 5, 2015
 */
 
import java.util.*;

public class MadScientist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()) {
            int k = scan.nextInt();
            if(k == 0)
                return;
            
            int sum  = 0;
            int next = 0;

            for(int i = 0; i < k; i++) {
                next = scan.nextInt();
                for(int j = sum; j < next; j++)
                    System.out.print(i + 1 + " ");
                sum = next;
            }
            
            System.out.println();
            scan.nextLine();
        }
    }
}