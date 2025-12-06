package in.string;

public class ToCharArrayMethod {

	public static void main(String[] args) {

//		Program 1: Reverse String using toCharArray() (Without using StringBuilder)
//		String str="mahs";
//		char[] arr = str.toCharArray();
//		for (int i = arr.length-1; i >= 0 ; i--) {
//			System.out.print(arr[i]);
//		}

		
//		Program 2: Count Total Vowels in a String
//		String str = "Education";
//		int count = 0;
//		char[] arr = str.toCharArray();
//		for (char c : arr) {
//			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//				count++;
//			}
//		}
//		System.out.println("Vowels count: " + count);
		
		
//		Program 3: Replace All 'a' with '@'
//		String str = "java is amazing";
//		
//		char[] arr = str.toCharArray();
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if (arr[i]=='a') {
//				arr[i]='@';
//			}
//		}
//		
//		String result=new String(arr);
//		System.out.println(result.getClass().getName());
//		System.out.println(result);
		
		
		
//		Count Uppercase, Lowercase, Digits, and Special Characters	
//		String str = "Hello123@Java!";
//		int upperCase=0,lowerCase=0,digit=0,special=0;
//		
//		char[] arr = str.toCharArray();
//		
//		for (char c : arr) {
//			if (Character.isUpperCase(c))upperCase++;
//			if (Character.isLowerCase(c))lowerCase++;
//			if (Character.isDigit(c))digit++;
//			if (!Character.isLetterOrDigit(c))special++; 
//		}
//		
//		System.out.println(upperCase);
//		System.out.println(lowerCase);
//		System.out.println(digit);
//		System.out.println(special);
		
		
//		Program 5: Remove All Spaces from a String
		String str = "Java is awesome";
		
		char[] arr = str.toCharArray();
		
		for (char c : arr) {
			if (c != ' ') {
				System.out.print(c);
			}
		}
	}
}
