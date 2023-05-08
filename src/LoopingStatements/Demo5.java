package LoopingStatements;

import java.util.Scanner;

public class Demo5 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		
		if(num%5==0&&num%3==0)
		{
			System.out.println("HI BYE");
		}
		
		else if(num%5==0)
		{
			System.out.println("HI");
		}
		else if(num%3==0)
		{
			System.out.println("BYE");
		}
		else
		{
			System.out.println("Good Bye");
		}
	}

}
