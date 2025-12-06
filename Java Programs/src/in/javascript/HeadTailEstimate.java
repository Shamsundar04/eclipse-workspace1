package in.javascript;

import java.util.Scanner;

public class HeadTailEstimate {
	
	public static void estimateHead(int trial) {
		int headCount=0;
		int tailCount=0;
		for(int i=0;i<trial;i++) {
			double toss=Math.random();
			if (toss<0.5) 
				headCount++;
			else
				tailCount++;
		}
		
		System.out.println(trial+" coin toss trial");
		System.out.println(headCount+" total head");
		double probability=Math.round(((double)headCount/trial)*100);
		System.out.println(probability);
		System.out.println("TailCount "+tailCount);
		System.out.println(((double)headCount/trial)*100+" estimate");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int trial=sc.nextInt();
		estimateHead(trial);
		sc.close();
	}
}
