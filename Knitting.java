import java.util.*;
import java.io.*;

public class Knitting {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        //Scanner scan = new Scanner(new File("Knitting.txt"));
        
        while(scan.hasNextInt()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            
            if(n == 0)
                return;
                
            if(scan.hasNextLine())
                scan.nextLine();
            
            int[] pattern = new int[k];
            
            for(int i = 0; i < k; i++) {
                pattern[i] = scan.nextInt();
            }
            
            if(scan.hasNextLine())
                scan.nextLine();
                
            int sum = n;
            int cur = n;
            int pi  = 0;
            for(int i = 1; i < m; i++) {
                sum += cur + pattern[pi];
                cur += pattern[pi];
                pi++;
                if(pi == pattern.length)
                    pi = 0;
            }
            
            System.out.println(sum);
        }
    }
}