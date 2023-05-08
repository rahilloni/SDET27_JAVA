package ArrayPractice2;

import java.util.LinkedHashSet;

public class indexOfCha {
	
	public static void main(String[] args) {
		
		String s="Raheel";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+i);
				}
			}
		}
		
	}

}
