import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUtil {

	public static void main(String args[]) throws IOException {

		System.out.println("Enter string:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		System.out.println(StringUtil.reverseWords(input));
	}

	private static String reverseWords(String str) {

		char[] array = str.toCharArray();

		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (Character.isLetterOrDigit(str.charAt(i)) ||										
					str.charAt(i) == '-')
				continue;

			else {
				reverseWord(array, j, i - 1);
				j = i + 1;
			}
		}

		reverseWord(array, j, array.length - 1);
		return new String(array);
	}

	private static void reverseWord(char[] array, int j, int i) {
		// reverse the array elemts from j to i
		while (j <= i) {
			char tmp = array[j];
			array[j] = array[i];
			array[i] = tmp;
			j++;
			i--;
		}

	}
}
