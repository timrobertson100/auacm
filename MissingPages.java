import java.util.*;

public class MissingPages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            String line = s.nextLine();
            if(line.charAt(0) == '0')
                return;

            Scanner l = new Scanner(line);
            int n = l.nextInt();
            int p = l.nextInt();
            doCase(n, p);
        }
    }

    public static void doCase(int n, int p) {
        int sheet = findSheetNumber(n, p);
        int[] res = new int[4];
        res[0] = (sheet - 1) * 2 + 1;
        res[1] = res[0] + 1;
        res[2] = n - (sheet - 1) * 2 - 1;
        res[3] = res[2] + 1;

        for(int i : res)
            if(i != p)
                System.out.print(i + " ");
        System.out.println();
    }

    public static int findSheetNumber(int n, int p) {
        if(p <= n / 2) {
            return (int)Math.ceil(p / 2.0);
        }
        else {
            return (int)Math.ceil(((n + 1) - p) / 2.0);
        }
    }
}