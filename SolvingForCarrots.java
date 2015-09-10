/**
 * Author: Chih-Jye Wang
 * Date  : Sept 10, 2015
 * https://open.kattis.com/problems/carrots
 * Note: too easy
 */

import java.util.*;

public class SolvingForCarrots {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();
		scanner.nextLine();
		for(int i = 0; i < n; i++)
			scanner.nextLine();
		System.out.println(p);
	}
}