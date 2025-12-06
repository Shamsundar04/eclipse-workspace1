package in.interview;

public class CloneMethod implements Cloneable 
{
	
	public int add(int a, int b) 
	{
		return a+b;
	}
	
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
		
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		CloneMethod obj1=new CloneMethod();
		
		CloneMethod obj2=(CloneMethod)obj1.clone();
		System.out.println(obj2.add(1, 2));

	}

}
