/**
 * Author: Chih-Jye Wang
 * Date  : Sep 27, 2015
 * https://open.kattis.com/problems/measurement
 */

import java.util.Scanner;
import java.util.HashMap;

public class ImperialMeasurement {
    public static void main(String[] args) {
        int[] c = { //Conversion table
            1000,   //1000 thous = 1 inch
            12,     //12 inches = 1 foot
            3,      //3 feet = 1 yard
            22,     //22 yard = 1 chain
            10,     //10 chains = 1 furlong
            8,      //8 furlong = 1 mile
            3       //3 mile = 1 league
        };

        HashMap<String, Integer> m = new HashMap<>();
        m.put("th", 0); m.put("thou", 0);
        m.put("in", 1); m.put("inch", 1);
        m.put("ft", 2); m.put("foot", 2);
        m.put("yd", 3); m.put("yard", 3);
        m.put("ch", 4); m.put("chain", 4);
        m.put("fur", 5); m.put("furlong", 5);
        m.put("mi", 6); m.put("mile", 6);
        m.put("lea", 7); m.put("league", 7);

        Scanner s = new Scanner(System.in);
        double val = s.nextInt();

        int a = m.get(s.next());
        s.next();
        int b = m.get(s.next());

        if(a < b) {
            for(int i = a; i < b; i++)
                val /= c[i];
        }
        else if(a > b) {
            for(int i = a - 1; i >= b; i--)
                val *= c[i];
        }

        System.out.println(val);
    }
}