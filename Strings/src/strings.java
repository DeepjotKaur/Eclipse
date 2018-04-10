import java.util.Arrays;

public class strings {
	public static void main(String[] args) {
		// System.out.println(unique("Hello"));
		compression("aabbbcccc");
		// URLify("Mr John Smith", 13);
		System.out.println(permutation("Taco Cat", "Taco Cat"));
	}

	private static boolean permutation(String string, String string2) {
		// TODO Auto-generated method stub
		char[] stringOne = string.toCharArray();
		Arrays.sort(stringOne);
		char[] stringTwo = string.toCharArray();
		Arrays.sort(stringTwo);
		//System.out.println(stringTwo);
		//System.out.println(stringOne);
		if(stringOne.length != stringTwo.length) {
			return false;
		} return Arrays.equals(stringOne, stringTwo);

		
	}

	private static void compression(String string) {
		
		StringBuilder x = new StringBuilder();
		int count = 0;
		//System.out.println();
		for (int i = 0; i<string.length(); i++) {
			count++;
			
			if(i+1>=string.length()||string.charAt(i)!=string.charAt(i+1)) {
				x.append(string.charAt(i));
				x.append(count);
				count=0;
			}
			

		}
		if(string.length()<x.length()) {
			System.out.println(string);
		} else{
			System.out.println(x);
		}

	}

	// does the string passed in have all unique characters
	private static boolean unique(String theString) {
		if (theString.length() > 128) {
			return false;
		} else {
			boolean[] s = new boolean[128];
			for (int i = 0; i < s.length; i++) {

				if (i == theString.length()) {
					break;
				}
				int index = theString.charAt(i);

				if (s[index] == true) {
					return false;
				}
				s[index] = true;
			}
			return true;
		}
	}

	private static void URLify(String theString, int theLength) {
		char[] String = theString.toCharArray();
		int spaces = 0;
		for (int i = 0; i < String.length; i++) {
			if (String[i] == ' ') {
				spaces++;
			}
		}
		int newLength = theLength + (spaces * 3);
		// System.out.println(theString.length());
		// System.out.println(newLength);
		String[newLength] = '\0';
		for (int i = theLength - 1; i >= 0; i--) {
			if (String[i] == ' ') {
				String[newLength - 1] = '%';
				String[newLength - 2] = '2';
				String[newLength - 3] = '0';
				newLength -= 3;
			} else {
				String[newLength - 1] = String[i];
				newLength -= 1;
			}
			// System.out.print(array[i]);
			// System.out.println(newString[i]);

		}
		System.out.println(theString);
	}

}
