package in.string;

public class OccuranceOfChar {

	public static void main(String[] args) {
		
		String str="banna";
		int freq[]=new int[256];
		
		
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)]++;
		}
		
		for (int i=0;i<freq.length;i++) {
			if (freq[i]>0) {
				System.out.println(i+" "+freq[i]);
			}
		}
	}
}
