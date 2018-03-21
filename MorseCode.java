import java.util.Arrays;
import java.util.HashMap;

public class MorseCode {

	public static void main(String[] args) {

		HashMap<String, Character> map = new HashMap<>();

		map.put(".-", 'a');
		map.put("-...", 'b');
		map.put("-.-.", 'c');
		map.put("-..", 'd');
		map.put(".", 'e');
		map.put("..-.", 'f');
		map.put("--.", 'g');
		map.put("....", 'h');
		map.put("..", 'i');
		map.put(".---", 'j');
		map.put("-.-", 'k');
		map.put(".-..", 'l');
		map.put("--", 'm');
		map.put("-.", 'n');
		map.put("---", 'o');
		map.put(".--.", 'p');
		map.put("--.-", 'q');
		map.put(".-.", 'r');
		map.put("...", 's');
		map.put("-", 't');
		map.put("..-", 'u');
		map.put("..-", 'v');
		map.put(".--", 'w');
		map.put("-..-", 'x');
		map.put("-.--", 'y');
		map.put("--..", 'z');

		String s = ".... . .-.. .-.. --- .";
		
		System.out.println(Arrays.toString((s.split(" "))));
		StringBuilder sb = new StringBuilder(" ");
		StringBuilder sb2 = new StringBuilder();
		String[] myArray = s.split(" ");
		for (int i = 0; i <myArray.length; i++) {
			sb.append(map.get(myArray[i]) );
			
		}
		sb2.append(sb + " ");
		System.out.println(sb);
	}
}

