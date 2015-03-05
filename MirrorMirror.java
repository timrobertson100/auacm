/**
 * Mirror, Mirror on the Wall
 *
 * Author: Chih-Jye Wang
 * Date  : Feb 16, 2015
 */
 
import java.util.*;

public class MirrorMirror {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            if(line.charAt(0) == '#')
                break;

            StringBuilder res = new StringBuilder(line.length());

            for(int i = 0; i < line.length(); i++) {
                char c = line.charAt(line.length() - 1 - i);

                if(c == 'b')
                    res.append('d');
                if(c == 'd')
                    res.append('b');
                if(c == 'p')
                    res.append('q');
                if(c == 'q')
                    res.append('p');
                if(c == 'i' || c == 'o' || c == 'v' || c == 'w' || c == 'x')
                    res.append(line.charAt(line.length() - 1 - i));
            }

            if(res.length() != line.length())
                System.out.println("INVALID");
            else
                System.out.println(res.toString());
        }
    }
}