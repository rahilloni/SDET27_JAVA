package ArrayPractice;

import java.util.LinkedHashSet;

public class PrintDuplicateChar {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		String s="Raaheel";
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for( Character ch:set)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
		if(count>1)
		{
			System.out.println(ch+"=="+count);
		}
		
		}
		
	}

}
