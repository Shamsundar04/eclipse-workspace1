package in.numeric;

public class CheckNoIsIncreasing {

	public static void main(String[] args) {
		
		
		int num=1789;
		boolean increase=true;
		int smaller=10;
		
		while (num!=0) {
			
			int digit=num%10;
			
			if (digit>smaller) {
				increase=false;
				break;
			}
			
			smaller=digit;
			num/=10;
		}
		
		System.out.println(increase?"increase":"decrease");
	}
}
