/**
 * Author: Chih-Jye Wang
 * Date  : Sept 10, 2015
 * https://open.kattis.com/problems/minimumscalar
 *
 * Notes:
 *   - Use long, not in, for vectors and result.
 */

import java.util.*;

public class MinScalarProd {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i = 0; i < t; i++)
			doCase(i);
	}

	private static void doCase(int count) {
		int n = scanner.nextInt();
		long[] v1 = new long[n], v2 = new long[n];
		for(int i = 0; i < n; i++)
			v1[i] = scanner.nextLong();
		for(int i = 0; i < n; i++)
			v2[i] = scanner.nextLong();
		Arrays.sort(v1);
		Arrays.sort(v2);

		long res = 0;

		for(int i = 0; i < n; i++)
			res += v1[i] * v2[n - 1 - i];

		System.out.printf("Case #%d: %d\n", count + 1, res);	
	}
}