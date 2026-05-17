package in.string;

public class SentenseRowColumn {

	public static void main(String[] args) {
		
		String str="the quick brown fox jumps over the lazy dog";
		str=str.replace(" ", "");
		int counter=0;
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=5;j++) {
				System.out.print(str.charAt(counter));
				counter++;
			}
			
			System.out.println();
		}
	}
}
