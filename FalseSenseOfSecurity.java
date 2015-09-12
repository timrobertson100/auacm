/**
 * Author: Chih-Jye Wang
 * Date  : Sept 12, 2015
 * https://open.kattis.com/problems/falsesecurity
 */

import java.util.*;

public class FalseSenseOfSecurity {
    private static HashMap<Character, String> encode;
    private static HashMap<String, Character> decode;

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringBuilder encoded = new StringBuilder();
            int[] lens = new int[line.length()];
            
            //Get code lengths
            for(int i = 0; i < line.length(); i++) {
                String code = encode.get(line.charAt(i));
                lens[i] = code.length();
                encoded.append(code);
            }

            //Decode
            int index = 0;
            for(int i = 0; i < line.length(); i++) {
                int len = lens[lens.length - 1 - i];
                String code = encoded.substring(index, index + len);
                index += len;
                System.out.print(decode.get(code));
            }

            System.out.println();
        }
    }

    public static void init() {
        encode = new HashMap<>();
        decode = new HashMap<>();

        encode.put('A', ".-");
        encode.put('B', "-...");
        encode.put('C', "-.-.");
        encode.put('D', "-..");
        encode.put('E', ".");
        encode.put('F', "..-.");
        encode.put('G', "--.");
        encode.put('H', "....");
        encode.put('I', "..");
        encode.put('J', ".---");
        encode.put('K', "-.-");
        encode.put('L', ".-..");
        encode.put('M', "--");
        encode.put('N', "-.");
        encode.put('O', "---");
        encode.put('P', ".--.");
        encode.put('Q', "--.-");
        encode.put('R', ".-.");
        encode.put('S', "...");
        encode.put('T', "-");
        encode.put('U', "..-");
        encode.put('V', "...-");
        encode.put('W', ".--");
        encode.put('X', "-..-");
        encode.put('Y', "-.--");
        encode.put('Z', "--..");
        encode.put('_', "..--");
        encode.put(',', ".-.-");
        encode.put('.', "---.");
        encode.put('?', "----");

        decode.put(".-", 'A');
        decode.put("-...", 'B');
        decode.put("-.-.", 'C');
        decode.put("-..", 'D');
        decode.put(".", 'E');
        decode.put("..-.", 'F');
        decode.put("--.", 'G');
        decode.put("....", 'H');
        decode.put("..", 'I');
        decode.put(".---", 'J');
        decode.put("-.-", 'K');
        decode.put(".-..", 'L');
        decode.put("--", 'M');
        decode.put("-.", 'N');
        decode.put("---", 'O');
        decode.put(".--.", 'P');
        decode.put("--.-", 'Q');
        decode.put(".-.", 'R');
        decode.put("...", 'S');
        decode.put("-", 'T');
        decode.put("..-", 'U');
        decode.put("...-", 'V');
        decode.put(".--", 'W');
        decode.put("-..-", 'X');
        decode.put("-.--", 'Y');
        decode.put("--..", 'Z');
        decode.put("..--", '_');
        decode.put(".-.-", ',');
        decode.put("---.", '.');
        decode.put("----", '?');
    }
}