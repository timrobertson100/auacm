/**
 * Author: Chih-Jye Wang
 * Date  : Sept 9 2015
 * https://open.kattis.com/problems/toilet
 */
import java.util.Scanner;

public class ToiletSeat {
	static final boolean up = false;
	static final boolean down = true;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.printf("%d\n%d\n%d", alwaysUp(s), alwaysDown(s), leave(s));
	}

	public static int alwaysUp(String s) {
		//boolean pos = s.charAt(0) == 'U' ? up : down;
		int count = 0;

		for(int i = 1; i < s.length(); i++) {
			if(i == 1) {
				if(s.charAt(0) == 'U' && s.charAt(1) == 'D') count += 2;
				if(s.charAt(0) == 'D' && s.charAt(1) == 'U') count++;
				if(s.charAt(0) == 'D' && s.charAt(1) == 'D') count++;
			}
			else if(s.charAt(i) == 'D') count += 2;
		}

		return count;
	}

	public static int alwaysDown(String s) {
		boolean pos = s.charAt(0) == 'U' ? up : down;
		int count = 0;

		for(int i = 1; i < s.length(); i++) {
			if(i == 1) {
				if(s.charAt(0) == 'U' && s.charAt(1) == 'U') count++;
				if(s.charAt(0) == 'U' && s.charAt(1) == 'D') count++;
				if(s.charAt(0) == 'D' && s.charAt(1) == 'U') count+=2;
			}
			else if(s.charAt(i) == 'U') count += 2;
		}

		return count;
	}

	public static int leave(String s) {
		int count = 0;
		for(int i = 1; i < s.length(); i++)
			if(s.charAt(i) != s.charAt(i - 1))
				count++;
		return count;
	}
}