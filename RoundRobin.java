import java.util.Scanner;
import java.util.LinkedList;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()) {
            int n = s.nextInt();
            if(n == 0)
                return;
            int t = s.nextInt();
            run(n, t);
        }
    }

    public static void run(int n, int t) {
        LinkedList<Integer> count = initCount(n);
        int start = 0;
        
        do {
            
            int q = t / count.size();
            int r = t % count.size();
            
            //Add each count by q
            if(q != 0)
                for(int i = 0; i < count.size(); i++)
                    count.set(i, count.get(i) + q);
            
            //Add remainder to count
            if(r != 0)
                for(int i = start; i < start + r; i++)
                    count.set(i % count.size(), count.get(i % count.size()) + 1);
            
            //Eliminate one person
            if(r == 0) {
                int remove = (start + count.size() - 1) % count.size();
                count.remove(remove);
                start = remove % count.size();
            }
            else {
                int remove = (start + r - 1) % count.size();
                count.remove(remove);
                start = remove % count.size();
            }
            
        } while(!endGame(count));
        
        System.out.printf("%d %d\n", count.size(), count.get(0));
    }

    private static LinkedList<Integer> initCount(int n) {
        LinkedList<Integer> count = new LinkedList<>();
        for(int i = 0; i < n; i++)
            count.addLast(0);
        return count;
    }
    
    /**
     * Game ends when everyone has the same count.
     */
    private static boolean endGame(LinkedList<Integer> count) {
        int c = count.get(0);
        for(int i = 1; i < count.size(); i++)
            if(count.get(i) != c)
                return false;
        return true;
    }
}