import java.util.*;
import java.io.*;

public class FredsLottoTickets {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
        String line = scan.nextLine();
        int n = Integer.parseInt(line);
		while(n != 0) {
			perform(scan, n);
            
            line = scan.nextLine();
            n = Integer.parseInt(line);    
		}
	}

	private static void perform(Scanner scan, int n) {
		boolean[] num = new boolean[49];
		for(int i = 0; i < n; i++) {
			String line = scan.nextLine();
			Scanner s = new Scanner(line);
			while(s.hasNextInt()) 
				num[s.nextInt() - 1] = true;
		}

		for(int i = 0; i < num.length; i++) {
			if(!num[i]) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}