package in.string;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		
//		Software Services
		
		String str="Software Services";
		int count = 0;
		
		str = str.toLowerCase().replace(" ", "");
		
//		StringBuilder builder=new StringBuilder(str);
//		str = builder.reverse().toString();
		
		
//		softwareservices
		
		for(int i=0;i<str.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
				
//				softwareservices
//							   s              
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			if (count==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}	
	}
}
