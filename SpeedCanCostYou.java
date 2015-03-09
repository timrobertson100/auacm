import java.util.*;
import java.io.*;

public class SpeedCanCostYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()) {
            int d = scan.nextInt(), s1 = scan.nextInt(), s2 = scan.nextInt();

            if(scan.hasNextLine())
                scan.nextLine();
            
            if(d == 0 && s1 == 0 && s2 == 0)
                return;
            
            //Time difference in seconds
            double diff = (((double)d / s1) - ((double)d / s2)) * 3600d;
            int h = (int)(diff / 3600d);
            int m = (int)((diff - (h * 3600d)) / 60d);
            int s = (int)Math.round(diff - (h * 3600d) - (m * 60d));

            System.out.printf("%d:%02d:%02d\n", h, m, s);
        }
    }
}