/**
 * Author: Chih-Jye Wang
 * Date  : Sept 10, 2015
 * https://open.kattis.com/problems/doorman
 */

import java.util.*;

public class Doorman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.nextLine();
		
		String s = scanner.nextLine();
		LinkedList<Character> q = new LinkedList<>();
		for(int i = 0; i < s.length(); i++)
			q.add(s.charAt(i));

		int m = 0, w = 0, t = 0;

		while(true) {
			if(Math.abs(m - w) > x || t == s.length())
				break;

			if(m == w) {
				if(q.remove() == 'M')
					m++;
				else
					w++;
				t++;
			}
			else if(m < w){
				if(q.getFirst() == 'W' && q.size() >= 2 && q.get(1) == 'M') {
					q.remove(1);
					m++;
				}
				else {
					if(q.remove() == 'W')
						w++;
					else
						m++;
				}
				t++;
			}
			else { //m > w
				if(q.getFirst() == 'M' && q.size() >= 2 && q.get(1) == 'W') {
					q.remove(1);
					w++;
				}
				else {
					if(q.remove() == 'W')
						w++;
					else
						m++;
				}
				t++;
			}
		}

		//System.out.print(s);
		if(Math.abs(m - w) > x)
			System.out.println(t - 1);
		else
			System.out.println(t);
	}
}