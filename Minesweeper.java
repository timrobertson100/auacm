import java.util.*;

public class Minesweeper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextLine()) {
			String line = s.nextLine();
			Scanner l = new Scanner(line);
			int r = l.nextInt();
			int c = l.nextInt();

            if(r == 0 && c == 0)
                return;

			perform(s, r, c);
		}

	}

	public static void perform(Scanner s, int r, int c) {
		String[][] b = new String[r][c];

		for(int i = 0; i < r; i++) {
			String line = s.nextLine();
			for(int j = 0; j < c; j++) {
				b[i][j] = line.charAt(j) + "";
			}
		}

		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {

                if(!b[i][j].equals("."))
                    continue;

				int count = 0;

                //Above left
                if(i != 0 && j != 0 && b[i - 1][j - 1].equals("*")) count++;
                //Above
                if(i != 0 && b[i - 1][j].equals("*")) count++;
                //Above right
                if(i != 0 && j != (c - 1) && b[i - 1][j + 1].equals("*")) count++;
                //Right
                if(j != (c - 1) && b[i][j + 1].equals("*")) count++;
                //Below right
                if(i != (r - 1) && j != (c - 1) && b[i + 1][j + 1].equals("*")) count++;
                //Below
                if(i != (r - 1) && b[i + 1][j].equals("*")) count++;
                //Below left
                if(i != (r - 1) && j != 0 && b[i+1][j - 1].equals("*")) count++;
                //Left
                if(j != 0 && b[i][j - 1].equals("*")) count++;

                b[i][j] = count + "";
			}
		}

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();            
        }
	}
}