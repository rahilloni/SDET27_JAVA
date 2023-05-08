package Allprograms;

import java.util.Scanner;

public class calc {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("If u want to add press 1");
		System.out.println("If u want to substract press 2");
		System.out.println("If u want to multiply press 3");
		
		int que=s.nextInt();
		if(que==1)
		{
			System.out.println("Enter two no's to add");
			int a=s.nextInt();
			int b=s.nextInt();
			int sum=a+b;
			System.out.println(sum);
		}
		if(que==2)
		{
			System.out.println("enter two no's to substract");
			int a=s.nextInt();
			int b=s.nextInt();
			int sum=a-b;
			System.out.println(sum);
		}
		if(que==3)
		{
			System.out.println("enter two no's to multiply");
			int a=s.nextInt();
			int b=s.nextInt();
			int sum=a*b;
			System.out.println(sum);
		}
		
		
	}

}
