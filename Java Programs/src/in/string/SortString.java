package in.string;

public class SortString {

	public static void main(String[] args) {

		String string = "edcab";

		char[] charArray = string.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {

			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] > charArray[j]) {     
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}

		String string2 = new String(charArray);

		System.out.println(string2);
	}

}
