package in.string;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String name="s h a m";
//		String temp;
//		for (int i = 0; i < name.length(); i++) {
//			
//			temp="";
//			char charAt = name.charAt(i);
//			if (charAt!=' ') {
//				temp+=charAt;
//			}
//			System.out.print(temp);
//		}

		System.out.println(name.replaceAll(" ", ""));
	}
}