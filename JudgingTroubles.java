/**
 * Author: Chih-Jye Wang
 * Date  : Sept 10, 2015
 * https://open.kattis.com/problems/judging
 */

import java.util.*;

public class JudgingTroubles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		HashMap<String, Integer> h1 = new HashMap<>();
		HashMap<String, Integer> h2 = new HashMap<>();

		for(int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			if(h1.containsKey(s))
				h1.put(s, h1.get(s) + 1);
			else
				h1.put(s, 1);
		}

		for(int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			if(h2.containsKey(s))
				h2.put(s, h2.get(s) + 1);
			else
				h2.put(s, 1);
		}

		int res = 0;
		for(String key : h1.keySet()) {
			if(h2.containsKey(key)) {
				res += Math.min(h1.get(key), h2.get(key));
			}
		}

		System.out.println(res);
	}
}