/**
 * Author: Chih-Jye Wang
 * Date  : Sept 10, 2015
 * https://open.kattis.com/problems/raggedright
 * Notes:
 *   - End of file on Linux is ctrl+d
 */
import java.util.*;

public class RaggedRight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<>();
		int max = 0;
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			lines.add(line);
			if(line.length() > max)
				max = line.length();
		}
		int res = 0;
		for(int i = 0; i < lines.size() - 1; i++)
			res += (max - lines.get(i).length()) * (max - lines.get(i).length());

		System.out.println(res);
	}
}