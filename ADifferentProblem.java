/**
 * Author: Chih-Jye Wang
 * Date  : Sept 8 2015
 * Problem from Kattis
 */
import java.util.Scanner;

public class ADifferentProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLong()){
			long a = scanner.nextLong(), b = scanner.nextLong();
			System.out.println(a > b ? a - b : b - a);
		}
	}
}