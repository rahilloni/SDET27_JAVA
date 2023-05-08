package Allprograms;

import java.util.Scanner;

public class calc3 {
	
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter two no's");
		int a=s.nextInt();
		int b=s.nextInt();
		add(a,b);
		System.out.println(add(a,b));
	}

}
