package in.c_classroom;

public class AndOrNotOperator {

	public static void main(String[] args) {

		String no = "97006065048";
		int temp=0;
		
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		
		
		for(char ch:no.toCharArray())
		{
			if(ch=='0')
			{
				temp++;
				
			}
			else 
			{
				sb2.append(ch);
			}
			
		}

		for(int i=0;i<temp;i++)
		{
			sb1.append('0');
		}
		

StringBuilder sb3=sb1.append(sb2);
	
	System.out.println(sb3);

	}

}
