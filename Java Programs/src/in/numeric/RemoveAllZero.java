package in.numeric;

public class RemoveAllZero {

	public static void main(String[] args) {
		
		int num=10204;
		StringBuilder remove=new StringBuilder(); 
		
		String replace = String.valueOf(num).replace("0", "");
		int int1 = Integer.parseInt(replace);
		
		System.out.println(int1);
		
//		while (num!=0) {
//			
//			if (num%10!=0) {
//				remove.append(num%10);
//			}
//			num=num/10;
//		}
//		String string = remove.reverse().toString();
//		System.out.println(Integer.parseInt(string));
	}
}
